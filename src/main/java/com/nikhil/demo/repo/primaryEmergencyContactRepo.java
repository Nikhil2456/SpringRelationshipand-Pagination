package com.nikhil.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.demo.model.primaryEmergencyContactModel;

public interface primaryEmergencyContactRepo extends JpaRepository<primaryEmergencyContactModel,Integer> {

}
