package com.example.DemoApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//=======================================================================
// Applicationクラス
// main文でSpringが起動する
// @SpringBootApplicationアノテーション
// - @Configuration, @EnableAutoConfiguration, @ComponentScan
// 　　の3つを設定したのと同様の意味
// @Configuration: Springの設定をJavaで行う用
// @EnableAutoConfiguration: Bean定義など
// @ComponentScan: DIコンテナが管理するBeanの自動登録を行うために使用
//=======================================================================
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
