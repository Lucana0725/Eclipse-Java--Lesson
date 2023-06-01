package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter  // メンバー変数のgetterを自動で設定するアノテーション
@Setter  // メンバー変数のsetterを(同上)
public class RegisterBean {
	private String name;  // RegisterBeanのメンバー変数name
	private String age;  // RegisterBeanのメンバー変数age
}
