package com.azid.SpringBoot_.Assessment_.Employee_Management.mapper;

import com.azid.SpringBoot_.Assessment_.Employee_Management.dto.DepartmentDTO;
import com.azid.SpringBoot_.Assessment_.Employee_Management.entity.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    Department toEntity(DepartmentDTO dto);
    DepartmentDTO toDto(Department department);
}
