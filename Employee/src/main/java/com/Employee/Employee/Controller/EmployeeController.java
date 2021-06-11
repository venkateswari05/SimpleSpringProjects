package com.Employee.Employee.Controller;

import com.Employee.Employee.Service.EmployeeService;
import com.Employee.Employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void add(@RequestBody Employee e)
    {
        employeeService.addEmployee(e);
    }

    @RequestMapping(value="/addall", method = RequestMethod.POST)
    public void addAll(@RequestBody List<Employee> e)
    {

        employeeService.addEmployees(e);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Employee get(@PathVariable long id)
    {

        return employeeService.getEmployee(id);
    }

    @RequestMapping(value="/update/{id}", method = RequestMethod.PUT)
    public Employee update(@PathVariable long id, @RequestBody Employee e)
    {

        return employeeService.updateEmployee(id,e);
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public Employee delete(@PathVariable long id)
    {
        return employeeService.deleteEmployee(id);
    }

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public List<Employee> getAll()
    {
        return employeeService.getAllEmployees();
    }

}
