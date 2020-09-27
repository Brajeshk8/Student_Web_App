package CRUD.service;

import java.util.List;

import CRUD.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	List<Employee> getEmployeeByFname(String firstName); 
	
	List<Employee> getEmployeeByLname(String lastName);
	
	List<Employee> getByAttendance( Integer attandance);
	
	List<String > getEmployeeByPass( boolean result);
	
	List<String > getDistinctFname(boolean pass);
	
	List<Employee> getEmployeeByMarks( int marks);
	
	List<String> getEmployeeOfMaxSalary();
	
	Employee updateEmployee(long id ,Employee employee);
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);
}
