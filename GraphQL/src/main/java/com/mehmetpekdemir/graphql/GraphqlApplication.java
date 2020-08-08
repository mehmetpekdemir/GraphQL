package com.mehmetpekdemir.graphql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mehmetpekdemir.graphql.dto.EmployeeDTO;
import com.mehmetpekdemir.graphql.service.EmployeeService;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	CommandLineRunner createInitialEmployees(EmployeeService employeeService) {
		return (args) -> {
			EmployeeDTO employee = new EmployeeDTO();
			employee.setFirstName("Mehmet");
			employee.setLastName("Pekdemir");
			employeeService.createEmployee(employee);

			EmployeeDTO employee1 = new EmployeeDTO();
			employee1.setFirstName("Mehmet");
			employee1.setLastName("Pekdemir1");
			employeeService.createEmployee(employee1);

			EmployeeDTO employee2 = new EmployeeDTO();
			employee2.setFirstName("Mehmet");
			employee2.setLastName("Pekdemir2");
			employeeService.createEmployee(employee2);
		};
	}
}
