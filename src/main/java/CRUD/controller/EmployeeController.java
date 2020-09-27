package CRUD.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CRUD.model.Employee;
import CRUD.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	
		
	//display list of employees
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee() {
				
		return  employeeService.getAllEmployees();	
	}
	
	
	
	
	@GetMapping("/getUser/{id}")
	public Employee getEmployeeById(@PathVariable Long id)  {
		
		return employeeService.getEmployeeById(id);
	}

	
	
	@GetMapping("/getByFname/{firstName}")
	public List<Employee> getEmployeeByFname(@PathVariable String firstName)  {
		
		return employeeService.getEmployeeByFname(firstName);
	}
	
	
	
	@GetMapping("/getByLname/{lastName}")
	public  List<Employee> getEmployeeByLname(@PathVariable String lastName)  {
		
		return employeeService.getEmployeeByLname(lastName);
	}
	
	@GetMapping("/getByAttendance/{attandance}")
	public List<Employee> getByAttendance(@PathVariable Integer attandance){
		return employeeService.getByAttendance(attandance);
	}
	
	
	
	@GetMapping("/getByPass/{result}")
	public List<String > getEmployeeByPass(@PathVariable boolean result)  {
		
		return employeeService.getEmployeeByPass( result);
	}
	
	
	@GetMapping("/getByMarks/{marks}")
	public List<Employee> getEmployeeByMarks(@PathVariable int marks)  {
		
		return employeeService.getEmployeeByMarks( marks);
	}
	
	
	@GetMapping("/getDistinctFname/{pass}")
	public List<String > getDistinctFname(@PathVariable boolean pass)  {
		
		return employeeService.getDistinctFname(pass);
	}
	
	
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		Employee createdEmployee = employeeService.saveEmployee(employee);
		return createdEmployee;
	}
	
	
	
	@GetMapping("/getEmployeeOfMaxSalary")
	public List<String> getEmployeeOfMaxSalary() {
		
		return employeeService.getEmployeeOfMaxSalary();
		
	}
	
	
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable long id) {
		
		employeeService.deleteEmployeeById(id);
		return "The employee of id "+id +" is deleted";
		
	}
	
	
	@PutMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@PathVariable long id , @RequestBody Employee employee) {
				
		return employeeService.updateEmployee(id ,employee);

	}
	
	
}
