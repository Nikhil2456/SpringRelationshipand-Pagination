package com.nikhil.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.demo.model.EmployeeModel;

public interface employeeRepo extends JpaRepository<EmployeeModel,Integer> {
}
