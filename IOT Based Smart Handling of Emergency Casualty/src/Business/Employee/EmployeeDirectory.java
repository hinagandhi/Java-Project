/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, String location){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setWorkplace(location);
        employee.setAvailability("Available");
        if(location!=null)
        {
        employee.setEmp_latitude(employee.calculateRandomLatitude());
        employee.setEmp_longitude(employee.calculateRandomLongitude());
        }
        employeeList.add(employee);
        return employee;
    }
}