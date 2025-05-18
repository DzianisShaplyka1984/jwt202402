package com.academy.jwt202402.service;

import com.academy.jwt202402.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> findAll();
}
