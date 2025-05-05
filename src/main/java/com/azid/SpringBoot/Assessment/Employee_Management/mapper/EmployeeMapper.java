package com.azid.SpringBoot.Assessment.Employee_Management.mapper;

import com.azid.SpringBoot.Assessment.Employee_Management.dto.EmployeeDTO;
import com.azid.SpringBoot.Assessment.Employee_Management.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEntity (EmployeeDTO dto);
    EmployeeDTO toDto(Employee employee);
}
