package employee_management.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employee_management.model.Employee;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	 @GetMapping
	    public List<Employee> getEmployees() {


	        List<Employee> employees = Arrays.asList(

	                new Employee(1, "Harshal", "DevOps Engineer"),

	                new Employee(2, "Akshay", "Java Developer"),

	                new Employee(3, "Amit", "Cloud Engineer")

	        );


	        return employees;

	    }
}
