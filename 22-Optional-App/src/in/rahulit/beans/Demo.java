package in.rahulit.beans;
 
import java.util.Optional;

import in.rahulit.service.EmployeeService;

public class Demo {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();

		// Employee emp = service.getEmpById(101);

		Optional<Employee> empById = service.getEmpById(101);
		if (empById.isPresent()) {
			Employee emp = empById.get();
			System.out.println(emp.getName());
		} else {
			System.out.println("With Given ID no record found");
		}
	}

}
