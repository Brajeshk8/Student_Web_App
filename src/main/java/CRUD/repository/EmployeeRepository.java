package CRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import CRUD.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee , Long> {

	
	@Query(value = " select * from result where "  +  
	"total_attendance >= ?1" , nativeQuery = true ) 
	List<Employee> findByAttendance(Integer attendance);		
	
	
	
	 @Query(value = "select  distinct fname   from result where " +
	 		" pass= ?1" , nativeQuery = true)
	 List<String> findByDistinctFname(boolean pass);
	
	 @Query(value = "select fname,lname , salary from result where " + 
	 "salary =(select max(salary) from result)" , nativeQuery = true)
	 List<String> findByMaxSalary();
	 
	 
	 
	 @Query(value = "select * from result where " +
	            " fname = ?1 " , nativeQuery = true)
	 List<Employee> findByFname(String name);
	 
	 
   
	@Query(value = "select * from result where " + 
	            "lname = ?1" , nativeQuery = true)
	List<Employee> findByLname(String name);
	
	
	@Query(value = "select  fname ,lname , marks , count(department) from result where " + 
            "pass = ?1" + " group by 1 , lname , marks  having count(department)>0 order by 1  desc" , nativeQuery = true)
	List<String> findByPass(boolean pass);
	
	
	@Query(value = "select * from result where " + 
            "marks >= ?1"  + " order by marks", nativeQuery = true)
	List<Employee> findByMarks(int marks);

	
	
	List<Employee> findByFirstName(String name);
}
