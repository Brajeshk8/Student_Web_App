package CRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CRUD.model.Employee;
import CRUD.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		return employee;
		
	}


	@Override
	public Employee getEmployeeById(long id) {
		
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if(optional.isPresent()) {
			employee = optional.get();
		}else {
			throw new RuntimeException("Employee not found for id ::" + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {

		this.employeeRepository.deleteById(id);
		
	}
	
	@Override
	public List<Employee> getEmployeeByFname( String firstName)  {
		
		return employeeRepository.findByFname(firstName);
	}
	
	@Override
	public  List<Employee> getEmployeeByLname(String lastName)  {
		
		return employeeRepository.findByLname(lastName);
	}
	
	@Override
	public List<Employee> getByAttendance(Integer attandance){
		
		return employeeRepository.findByAttendance(attandance);
	}
	
	@Override
	public List<String > getEmployeeByPass(boolean pass)  {
		
		return employeeRepository.findByPass( pass);
	}
	
	@Override
	public List<Employee> getEmployeeByMarks(int marks)  {
		
		return employeeRepository.findByMarks( marks);
	}
	
	@Override
	public List<String > getDistinctFname(boolean pass)  {
		
		return employeeRepository.findByDistinctFname(pass);
	}
	
	@Override
	public List<String> getEmployeeOfMaxSalary() {
		
		return employeeRepository.findByMaxSalary();
		
	}
	@Override
	public Employee updateEmployee(long id ,Employee employee) {
		
		
		
		Optional<Employee> employeeOpt = employeeRepository.findById(id);
		Employee Oldemployee = employeeOpt.get();
		Oldemployee.setRoll_No(employee.getRoll_No());
		Oldemployee.setFirstName(employee.getFirstName());
		Oldemployee.setLastName(employee.getLastName());
		
		Oldemployee.setCourse(employee.getCourse());
		Oldemployee.setDepartment(employee.getDepartment());
		Oldemployee.setMarks(employee.getMarks());
		Oldemployee.setTotal_marks(employee.getTotal_marks());
		Oldemployee.setPass(employee.isPass());
		Oldemployee.setTotal_attendance(employee.getTotal_attendance());
		Oldemployee.setSalary(employee.getSalary());

		Employee updatedEmployee = employeeRepository.save(Oldemployee);
		
		return updatedEmployee;
	}

}
