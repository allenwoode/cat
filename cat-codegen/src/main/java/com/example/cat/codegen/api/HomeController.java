/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: HomeController
 * Author:   feilin
 * Date:     2021/6/7 上午12:28
 * Description:
 */
package com.example.cat.codegen.api;

import com.example.cat.common.core.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/codegen")
public class HomeController {

    @GetMapping("/")
    public R<?> index() {
        log.info(">================= /codegen =================<");
        return R.ok();
    }
}
