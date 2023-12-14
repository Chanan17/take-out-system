package com.fxz.vo;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "员工脱敏返回的数据格式")
public class EmployeeVo {
    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;
}
