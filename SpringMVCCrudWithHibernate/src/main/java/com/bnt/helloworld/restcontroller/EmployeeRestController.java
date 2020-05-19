package com.bnt.helloworld.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bnt.helloworld.domain.Employee;
import com.bnt.helloworld.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	@Qualifier("employeeService")
	private IEmployeeService employeeService;
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	@ResponseBody
	public void deleteEmployee(@PathVariable("id") Integer employeeId) {
		//return employeeService.findEmployee(employeeId);
		System.out.println("rest controller called " +employeeId);
		
		employeeService.deleteEmployee(employeeId);
		
		/*ModelAndView modelAndView = new ModelAndView("employeeportal");          
		modelAndView.addObject("listEmployee", employeeService.getAllEmployeeDetails());	
		
		Employee newEmployee = new Employee();
		modelAndView.addObject("employee", newEmployee);
		return modelAndView;*/
	}





}
