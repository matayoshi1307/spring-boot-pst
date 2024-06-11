package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//JPAのエンドポイントになる
@RestController
//controllerクラスを定義する
public class MainController {
    //@AutowiredでEmployeeRepositoryのインスタンスを生成してアプリケーションに注入する
	@Autowired
	//注入されたインスタンスを保持し、アプリケーション内で、データーベース操作
	private EmployeeRepository employeeRepository;
    //Getリクエスト(/test1)のみをURLに紐づける
	@GetMapping("/test1")
	//Employeeクラスのオブジェクトをリストとして、取得する
	public List<Employee> get() {
		//取得したメソッドを返す
		return employeeRepository.findAll();
	}
}