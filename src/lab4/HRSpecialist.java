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

// Declaration of new HR Specialist
public class HRSpecialist {
    
    // Variable to use in class
    private Employee employee;
    private String employeeInfo;
    private String msg;
 
    
    // Create array to store employees. 5 max
    public String[] employees = new String[5];
    
    
    // Create a report service to run output
    EmployeeReportService report = new EmployeeReportService();
    
    
    // Parent method to create employee and conduct orientation
    public void hireNewEmployee (String firstName, String lastName, String ssn, String cubeID, int index) {
        this.createNewEmployee(firstName, lastName, ssn); // Create new employee with info
        this.conductFirstEmployeeOrientatin(cubeID); // Assign employee seat location
        this.createEmployeeInfo(); // Create info for employee
        this.saveEmployeeInfo(getEmployeeInfo(), index);
    }
    
    
    // Mehtod to create a new employee
    // Used in hireNewEmployee()
    public void createNewEmployee(String firstName, String lastName, String ssn){
         employee = new Employee(firstName, lastName, ssn);
    }

    
    // Allow HR Specialist to conduct an orientaion
    // used in hireNewEmployee()
    public void conductFirstEmployeeOrientatin (String cubeID) {
        employee.doFirstTimeOrientation(cubeID);
    }
    
    
    // Allow HR Specialist to set orientation date
    public void setEmployeeOrientationDate (Date startDate){
        employee.setOrientationDate(startDate);
    }
    
    
    // Allow HR employee to assing new cube
    public void changeEmployeeLocation (String cubeId, int index){
        employee.setCubeId(cubeId);
        employee.isMovedIn();
        this.createEmployeeInfo();
        this.getEmployeeInfo();
        this.saveEmployeeInfo(employeeInfo, index);
        
    }
    
    
    // Allow HR to get and print emloyee data
    public void retrieveEmployeeData(){
        //EmployeeReportService report = new EmployeeReportService();
        report.addData("Employee " + employee.getFirstName() + " " + employee.getLastName() + " "
                + "sits in cube " + employee.getCubeId() + ". \n"
                        + " LAST ORIENTATION: " + employee.getOrientationDate() + " HIRED ON:" + employee.getHireDate());
        report.outputReport();
    }
    
    
    // Create a record of employee info
    public void createEmployeeInfo (){
        employeeInfo = "Employee " + employee.getFirstName() + " " + employee.getLastName() + " "
                + "sits in cube " + employee.getCubeId() + ". \n"
                + " LAST ORIENTATION: " + employee.getOrientationDate() + " HIRED ON:" + employee.getHireDate();
    }
    
    
    // String to get employee info
    public String getEmployeeInfo() {
        return employeeInfo;
    }
    
    
    // Method to get employee info if needed
    public String getSavedEmployeeInfo(int index){
        return employees[index];
    }
    
    
    // Allow HR to save Employee Info for reference later
    // Used in hireNewEmployee()
    public void saveEmployeeInfo (String employeeInfo, int index) {
        employees[index] = getEmployeeInfo();
    }
    
    
    // Method to retrieve employee info from the array
    public void retrieveSavedEmployeeInfo (int index){
        EmployeeReportService report = new EmployeeReportService();
        report.addData(employees[index]);
        report.outputReport();
    }
 
}
