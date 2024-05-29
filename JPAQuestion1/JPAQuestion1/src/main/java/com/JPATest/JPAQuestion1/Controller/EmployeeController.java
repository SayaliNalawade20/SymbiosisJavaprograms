package com.JPATest.JPAQuestion1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.JPATest.JPAQuestion1.Service.EmployeeService;
import com.JPATest.JPAQuestion1.entities.Employee;


@Controller
public class EmployeeController {

	
	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/NewEmployee")
	public String addNewBorrower(Model model) {
		model.addAttribute("newEmployee", new Employee());
		return "newEmployee";
		
	}
	
	
	@PostMapping("/employeeAdded")
	public String getEmployeeStatus(@ModelAttribute("employee") Employee employee, BindingResult result, Model model) {
	    if (result.hasErrors()) {
	    	  return "newEmployee";
	    }
		return "employee";
		
	}
	
	
	@GetMapping("/existemployee")
	public String getExistingEmployee(Model model) {
		List<Employee> existingEmployee = employeeService.getAll();
		for(Employee b : existingEmployee) {
			System.out.println(b.getFirstName());
		}
		model.addAttribute("employees", existingEmployee);
		return "existingEmployee";
		
	}
	
	 @PostMapping("/update/{id}")
	    public String updateEmployee(@PathVariable("id") long id, @Validated Employee employee, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	            employee.setId(id);
	            return "update_form";
	        }

	        employeeService.saveData(employee);
	        return "redirect:/employees";
	    }

	
	@GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") long id, Model model) {
       
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }

}
