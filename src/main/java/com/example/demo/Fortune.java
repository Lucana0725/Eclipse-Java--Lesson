package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fortune {
	
	@RequestMapping("/fortune")
	public String start() {
		double fn = Math.random();  // 0.0~1.0の乱数を生成
	}
}
