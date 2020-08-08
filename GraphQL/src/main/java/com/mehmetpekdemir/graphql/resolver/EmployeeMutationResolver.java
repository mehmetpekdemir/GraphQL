package com.mehmetpekdemir.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mehmetpekdemir.graphql.dto.EmployeeDTO;
import com.mehmetpekdemir.graphql.entity.Employee;
import com.mehmetpekdemir.graphql.service.EmployeeService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

/**
 * Also see {@link GraphQLMutationResolver}
 * <p>
 * This class provide those : create() , update() etc.
 * </p>
 *
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Component
@RequiredArgsConstructor // Constructor Injection with lombok
public class EmployeeMutationResolver implements GraphQLMutationResolver {

	private final EmployeeService employeeService;

	public Employee createEmployee(EmployeeDTO employeeDTO) {
		return employeeService.createEmployee(employeeDTO);
	}

}
