/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: SysLogServiceImpl
 * Author:   feilin
 * Date:     2021/6/18 上午12:50
 * Description:
 */
package com.eeyoo.cat.api.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.eeyoo.cat.api.domain.model.SysLog;
import com.eeyoo.cat.api.domain.model.SysLogDTO;
import com.eeyoo.cat.api.mapper.SysLogMapper;
import com.eeyoo.cat.api.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {
    @Override
    public Page getLogByPage(Page page, SysLogDTO sysLog) {
        log.info("======================== sys_log_impl =====================");
        return null;
    }
}
