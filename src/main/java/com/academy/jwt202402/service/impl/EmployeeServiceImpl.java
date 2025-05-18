package com.academy.jwt202402.service.impl;

import com.academy.jwt202402.dto.EmployeeDto;
import com.academy.jwt202402.model.entity.Employee;
import com.academy.jwt202402.model.repository.EmployeeRepository;
import com.academy.jwt202402.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeDto> findAll() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDto> employeeDtos = new ArrayList<>();

        employees.forEach(employee -> {
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setName(employee.getName());
            employeeDto.setPhone(employee.getPhone());

            employeeDtos.add(employeeDto);
        });

        return employeeDtos;
    }
}
