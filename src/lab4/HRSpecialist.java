/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Date;

/**
 *
 * @author Owner
 */
public class HRSpecialist {
    
    // Create a reference for the employee
    private Employee employee;
    
    // Create array to store employees. 5 max
    public Employee[] employees = new Employee[5];

    // Allow HR to Hire the employee
    public void hireNewEmployee (String firstName, String lastName, String ssn, String cubeID) {
        employee = new Employee(firstName, lastName, ssn); // Create new employee with info
        this.conductFirstEmployeeOrientatin(cubeID);
        
    }
    
    // Allow HR Specialist to conduct an orientaion
    public void conductFirstEmployeeOrientatin (String cubeID) {
        employee.doFirstTimeOrientation(cubeID);
    }
    
    // Allow HR Specialist to set orientation date
    public void setEmployeeOrientationDate (Date startDate){
        employee.setOrientationDate(startDate);
    }
    
    
    // Allow HR employee to assing new cube
    public void changeEmployeeLocation (String cubeId){
        employee.setCubeId(cubeId);
        employee.isMovedIn();
    }
    
    // Allow HR to get and print emloyee data
    public void retrieveEmployeeData(){
        EmployeeReportService report = new EmployeeReportService();
        report.addData("Employee " + employee.getFirstName() + " " + employee.getLastName() + " "
                + "sits in cube " + employee.getCubeId() + ".");
        report.outputReport();
    }
    
    // Allow HR to save Employee Info for referenc later
    public void saveEmployeeInfo (Employee employeeName, int index) {
        employeeName = employees[index];
    }
    
    // Allow HR to pritn out saved employee data
    public void retrieveSavedEmployeeInfo (int index){
        EmployeeReportService report = new EmployeeReportService();
        report.addData("Employee " + employees[index].getFirstName() + " " + employees[index].getLastName() + " was hired on "
        + employees[index].getOrientationDate() + " and sits in cube " + employees[index].getCubeId() + ".");
        report.outputReport();
    }
    
   // Allow HR to print out  employee location
    public void retrieveSavedEmployeeLocation (int index){
        EmployeeReportService report = new EmployeeReportService();
        report.addData("Employee " + employees[index].getFirstName() + " " + employees[index].getLastName() + " is in cube " + employees[index].getCubeId() + ".");
        report.outputReport();
    }
}
