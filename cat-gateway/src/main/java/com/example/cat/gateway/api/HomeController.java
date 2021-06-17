/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: HomeController
 * Author:   feilin
 * Date:     2021/6/7 下午10:31
 * Description:
 */
package com.example.cat.gateway.api;

import com.example.cat.common.core.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("/home")
    public R<String> index() {
        log.info("===================== /home =======================");
        return R.ok("成功");
    }
}
