/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: SysLogController
 * Author:   feilin
 * Date:     2021/6/18 上午12:44
 * Description:
 */
package com.eeyoo.cat.api.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eeyoo.cat.api.service.SysLogService;
import com.eeyoo.cat.api.domain.model.SysLogDTO;
import com.example.cat.common.core.util.R;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/log")
public class SysLogController {

    private final SysLogService sysLogService;
    private ObjectMapper objectMapper;

    @GetMapping("/page")
    public R page(Page page, SysLogDTO sysLog) {
        log.info("========================== /log/page ===========================");
        Object obj = sysLogService.getLogByPage(page, sysLog);
        log.info(">>>>> sys_log_page {}", obj);
        return R.ok(obj);
    }

    @GetMapping("/{id}")
    public R detail(@PathVariable Long id) {
        log.info("========================== /log/{} ===========================", id);
        return R.ok(sysLogService.getById(id));
    }
}
