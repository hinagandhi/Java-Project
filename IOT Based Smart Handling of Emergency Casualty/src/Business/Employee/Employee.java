/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;

/**
 *
 * @author raunak
 */
public class Employee extends Person {
    
    private String empId;
    private static int count1 = 0;

    public double getEmp_latitude() {
        return emp_latitude;
    }

    public void setEmp_latitude(double emp_latitude) {
        this.emp_latitude = emp_latitude;
    }

    public double getEmp_longitude() {
        return emp_longitude;
    }

    public void setEmp_longitude(double emp_longitude) {
        this.emp_longitude = emp_longitude;
    }
    private double emp_latitude;
    private double emp_longitude;
    public String getAvailability() {
        return availability;
    }
    private String availability ;

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    public Employee() {
       // super(null);
        empId = "E"+(int)(Math.random()*1000);
        
    }

    public String getId() {
        return empId;
    }   
    public double calculateRandomLatitude(){
    double minLat = -90.00;
    double maxLat = 90.00;
    emp_latitude = minLat + (double)(Math.random() * ((maxLat - minLat) + 1));
    return (float)emp_latitude;
      }
    public double calculateRandomLongitude()
    {
     double minLon = 0.00;
    double maxLon = 180.00;     
    emp_longitude = minLon + (double)(Math.random() * ((maxLon - minLon) + 1));
    return (float)emp_longitude;
    }
}
