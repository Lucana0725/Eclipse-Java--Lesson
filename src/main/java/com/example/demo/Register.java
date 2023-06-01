package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {

	@RequestMapping("/")
	public String start() {
		return "input.html";
	}
	
	@RequestMapping("/register")
	public ModelAndView register  // input.htmlで「送信」が押されたら動くメソッド
		(@ModelAttribute RegisterBean rb, ModelAndView mav) {
			// 引数として ①RegisterBeanクラスのrbというオブジェクトを受け取る(@ModelAttributeはinput.htmlで送信された値をRegisterBeanのメンバー変数に自動的に割り当ててくれる)
			// ②ModelAndViewクラスのmavというオブジェクト。モデルとビューの情報を保持するためのオブジェクト。
		
			mav.addObject("rb", rb);  // モデルの情報をもたせる"addObject"メソッド
			mav.setViewName("register.html");  // ビューの情報をもたせる"setViewName"メソッド
			return mav;  // ここでreturnしてやることで、mavとして保持しているデータがsetViewNameで設定した"register.html"に飛ぶ。
	}
}
