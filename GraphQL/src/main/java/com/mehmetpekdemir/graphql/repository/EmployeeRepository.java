package com.mehmetpekdemir.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mehmetpekdemir.graphql.entity.Employee;

import java.util.List;

/**
 * 
 * @author MEHMET PEKDEMIR
 * @since 1.0
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public List<Employee> getByFirstNameLike(String firstName);

}
