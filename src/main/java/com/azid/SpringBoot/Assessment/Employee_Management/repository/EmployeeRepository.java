package com.azid.SpringBoot_.Assessment_.Employee_Management.repository;


import com.azid.SpringBoot_.Assessment_.Employee_Management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
