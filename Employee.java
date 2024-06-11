package com.example.demo;
//jpaを使用してデータベースとやりとりをするimport文
import jakarta.persistence.Entity;
//エンティティクラスに対応するデータベースのカラムを指定している
import jakarta.persistence.Id;
//エンティティクラスに対応するデータベースのテーブルを指定している
import jakarta.persistence.Table;

@Entity
//格納するテーブルを定義
@Table(name="employee")
//Employeeクラスを定義
public class Employee {
   @Id
   //Employeeテーブルのidカラムを参照するという定義
    private Integer id;
   //Employeeテーブルのnameカラムを参照するという定義
    private String name;
   //Employeeテーブルのromajiカラムを参照する という定義
    private String romaji;
    //参照したidカラムの値を取得する
    public Integer getId() {
        return id;
    }
    //参照したnameカラムの値を取得する
	public String getName() {
		return name;
	}
	//参照したromajiカラムの値を取得する
	public String getRomaji() {
		return romaji;
	}
}