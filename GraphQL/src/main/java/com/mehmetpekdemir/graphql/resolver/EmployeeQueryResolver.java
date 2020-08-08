package com.mehmetpekdemir.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mehmetpekdemir.graphql.entity.Employee;
import com.mehmetpekdemir.graphql.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Also see {@link GraphQLQueryResolver}
 * <p>
 * This class provide those : getById() ,getAll() etc.
 * </p>
 *
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Component
@RequiredArgsConstructor // Constructor Injection with lombok
public class EmployeeQueryResolver implements GraphQLQueryResolver {

	private final EmployeeService employeeService;

	public List<Employee> getEmployeesByFirstNameLike(String firstName) {
		return employeeService.getByFirstNameLike(firstName);
	}

	public Optional<Employee> getEmployeeById(Long id) {
		return employeeService.getEmployeeById(id);
	}

}
