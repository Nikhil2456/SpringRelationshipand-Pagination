package com.nikhil.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nikhil.demo.model.EmployeeModel;
import com.nikhil.demo.repo.employeeRepo;
import com.nikhil.demo.repo.primaryEmergencyContactRepo;

@RestController
public class employeeController {
	@Autowired
	private employeeRepo emprepo;
    @Autowired
	private primaryEmergencyContactRepo contactRepo;
	@GetMapping("/employee")
	public List<EmployeeModel> findAll(){
		return emprepo.findAll();
	}
	@GetMapping("/pagination")
	public Page<EmployeeModel> findByPage(@RequestParam int page , @RequestParam int size){
		PageRequest pr =PageRequest.of(page, size);
		System.out.println(page+" "+size);
		return emprepo.findAll(pr);
	}
	
	@GetMapping("/EmployeeSort")
	public List<EmployeeModel> findAllSorted(){
		return emprepo.findAll(Sort.by(Sort.Direction.DESC,"empId"));
	}
	@PostMapping("/employee")
	public EmployeeModel save(@RequestBody @NonNull EmployeeModel empReq) {
		return emprepo.save(empReq);
	}
	
	@PutMapping(value="/employee/{id}")
	public String update(@NonNull @PathVariable int id, @RequestBody  EmployeeModel empReq) {
		emprepo.deleteById(id);
		emprepo.save(empReq);
		System.out.println("New Emp ID is = "+empReq.getEmpId());
		return "Updated";
	}
	@DeleteMapping(value="employee/{id}")
	public String delete(@PathVariable int id) {
		emprepo.deleteById(id);
		return "Deleted";
	}
}
