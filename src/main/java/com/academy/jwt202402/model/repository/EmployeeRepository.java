package com.academy.jwt202402.model.repository;

import com.academy.jwt202402.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
