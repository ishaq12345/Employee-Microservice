package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public class EmployeeServiceimpl implements IEmployeeService {
	
	//dummy Employee List
	
	List<Employee> list=List.of(
			new Employee(1311L, "Peter","888889999"),
			new Employee(1312L, "Parker","888669999"),
			new Employee(1313L, "Robert","888559999"),
			new Employee(1314L, "Tony","888444999"),
			new Employee(1315L, "Stark","888885799"),
			new Employee(1316L, "Max","888889099"),
			new Employee(1317L, "Will","888887799"),
			new Employee(1318L, "Lucy","888843999")
			
			);
	
	@Override
	public Employee getEmployee(Long id) {
		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
