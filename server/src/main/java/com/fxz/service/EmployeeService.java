package com.fxz.service;

import com.fxz.dto.EmployeeDTO;
import com.fxz.dto.EmployeeLoginDTO;
import com.fxz.dto.EmployeePageQueryDTO;
import com.fxz.entity.Employee;
import com.fxz.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    void save(EmployeeDTO employeeDTO);

    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
}
