package com.mehmetpekdemir.graphql.service.impl;

import com.mehmetpekdemir.graphql.dto.EmployeeDTO;
import com.mehmetpekdemir.graphql.entity.Employee;
import com.mehmetpekdemir.graphql.repository.EmployeeRepository;
import com.mehmetpekdemir.graphql.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Service
@RequiredArgsConstructor // Constructor Injection with lombok
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public List<Employee> getByFirstNameLike(String firstName) {
		return employeeRepository.getByFirstNameLike(firstName);
	}

	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public Employee createEmployee(EmployeeDTO employeeDTO) {
		return employeeRepository.save(new Employee(employeeDTO.getFirstName(), employeeDTO.getLastName()));
	}

}
