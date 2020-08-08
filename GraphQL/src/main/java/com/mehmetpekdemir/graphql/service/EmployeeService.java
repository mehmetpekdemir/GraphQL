package com.mehmetpekdemir.graphql.service;

import com.mehmetpekdemir.graphql.dto.EmployeeDTO;
import com.mehmetpekdemir.graphql.entity.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
public interface EmployeeService {

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<Employee> getByFirstNameLike(String firstName);

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public Optional<Employee> getEmployeeById(Long id);

	public Employee createEmployee(EmployeeDTO employeeDTO);

}
