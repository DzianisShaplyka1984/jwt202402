package com.academy.jwt202402.controller;

import com.academy.jwt202402.dto.EmployeeDto;
import com.academy.jwt202402.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping(value = "/employees")
    private List<EmployeeDto> findEmployees() {

        return employeeService.findAll();
    }
}
