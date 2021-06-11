package com.Employee.Employee.Service;

import com.Employee.Employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService
{

    ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployee(Employee e)
    {
        employees.add(e);
    }

    public void addEmployees(List<Employee> e)
    {
            for(Employee emp : e)
            {
                employees.add(emp);
            }
    }

    public Employee getEmployee(long id)
    {
            for(Employee emp : employees)
            {
                if(emp.getId()==id)
                {
                    return emp;
                }
            }
            return null;
    }

    public Employee updateEmployee(long id, Employee e)
    {
        boolean flag=false;
        Employee employ = null;
        for(Employee emp : employees)
        {
            if(emp.getId()==id)
            {
                flag=true;
                employ=emp;
            }
        }
        if(flag)
        {
            employees.remove(employ);
        }
        employees.add(e);
        return e;

    }

    public Employee deleteEmployee(long id)
    {
        boolean flag=false;
        Employee employ = null;
        for(Employee emp : employees)
        {
            if(emp.getId()==id)
            {
                flag=true;
                employ=emp;
            }
        }
        if(flag)
        {
            employees.remove(employ);
        }
        return null;
    }

    public List<Employee> getAllEmployees()
    {
        return employees;
    }
}
