package CRUD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "result")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "roll_no")
	private Integer roll_No;
	
	@Column(name = "fname")
	private String firstName;
	
	@Column(name = "lname")
	private String lastName;
	
	@Column(name = "course")
	private String course;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "marks")
	private Integer marks;
	
	@Column(name = "total_marks")
	private Integer total_marks;
	
	@Column(name = "pass")
	private boolean pass;
	
	@Column(name = "total_attendance")
	private Integer total_attendance;
	
	@Column(name = "salary")
	private Integer salary;
	
	public Integer getRoll_No() {
		return roll_No;
	}
	public void setRoll_No(Integer roll_No) {
		this.roll_No = roll_No;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Integer getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(Integer total_marks) {
		this.total_marks = total_marks;
	}
	public boolean isPass() {
		return pass;
	}
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	public Integer getTotal_attendance() {
		return total_attendance;
	}
	public void setTotal_attendance(Integer total_attendance) {
		this.total_attendance = total_attendance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
