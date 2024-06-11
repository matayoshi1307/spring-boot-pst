package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
//EmployeeRepositoryというインターフェイスを定義しています
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
