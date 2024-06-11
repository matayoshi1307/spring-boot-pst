package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//Applicatinの名前
@SpringBootApplication
//JPAのエンドポイントになる
@RestController
//クラス定義
public class Test4Application {
    //メインメソッド
    public static void main(String[] args) {
        SpringApplication.run(Test4Application.class, args);
    }
    //Getリクエスト(/hello)のみをURLとメソッドに紐づける
    @GetMapping("/hello")
    //Getリクエストを処理するために使用される
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    	//文字列を返す時のformat
        return String.format("Hello %s!", name);
    }
}
