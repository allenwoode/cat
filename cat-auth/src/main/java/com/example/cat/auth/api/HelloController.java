/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: HelloController
 * Author:   feilin
 * Date:     2021/6/6 下午11:23
 * Description:
 */
package com.example.cat.auth.api;

import com.example.cat.common.core.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

	@GetMapping("/")
	public R<?> index() {
		log.info(">======================= /hello =========================<");
		return R.ok("成功");
	}

}
