package com.fxz.service;

import com.fxz.dto.EmployeeDTO;
import com.fxz.dto.EmployeeLoginDTO;
import com.fxz.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    void save(EmployeeDTO employeeDTO);
}
