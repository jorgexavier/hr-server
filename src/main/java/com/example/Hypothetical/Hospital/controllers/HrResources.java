package com.example.Hypothetical.Hospital.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hypothetical.Hospital.controllers.Model.Employee;
import com.example.Hypothetical.Hospital.controllers.Model.EmployeesList;

@RestController
@RequestMapping("/hr")
public class HrResources {

	List<Employee> employees = Arrays.asList(new Employee("E1", "Jorge", "Almeida", "Dentistry"),
			new Employee("E2", "Cátia", "Samantha", "Nurolosgitry"), new Employee("E3", "Sandra", "Brito", "Meditech"));

	@RequestMapping("/employees")
	public EmployeesList getEmployee() {
		
		EmployeesList employeesList = new EmployeesList();
		employeesList.setEmployees(employees);
		return employeesList;
	}

	@RequestMapping("/employees/{Id}")
	public Employee getEmployeeById(@PathVariable("Id") String Id) {

		Employee e = employees.stream().filter(Employee -> Id.equals(Employee.getId())).findAny().orElse(null);
		return e;
	}

}
