/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: HomeController
 * Author:   feilin
 * Date:     2021/6/17 下午9:54
 * Description:
 */
package com.eeyoo.cat.api.controller;

import com.example.cat.common.core.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping
	public R home() {
		return R.ok(null, "成功");
	}

}
