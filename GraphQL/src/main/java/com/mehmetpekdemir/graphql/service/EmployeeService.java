package com.mehmetpekdemir.graphql.service;

import com.mehmetpekdemir.graphql.dto.EmployeeDTO;
import com.mehmetpekdemir.graphql.entity.Employee;

import java.util.List;
import java.util.Optional;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public interface EmployeeService {

	public List<Employee> getByFirstNameLike(String firstName);

	public Optional<Employee> getEmployeeById(Long id);

	public Employee createEmployee(EmployeeDTO employeeDTO);

}
