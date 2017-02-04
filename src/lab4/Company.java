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

// Class declaration
public class Company {
    
    // Declare new variables of mehtod objects
    private HRSpecialist hrSpecialist;
    private Employee employee;
    
    
    // Create a new HRSpecilait Object to crate and save employees
    HRSpecialist hr = new HRSpecialist();
    
    // Company constructor to run in pilot program and create new HRSpecialist object
    public Company (){
        hr = new HRSpecialist();
    }
    
    // Method to hire new employees
    public void hireNewEmployee(String firstName, String lastName, String ssn, String cubeID, int index){
        hr.hireNewEmployee(firstName, lastName, ssn, cubeID, index);
    }
   
   // Method to get saved employeeinfo once it is in the HR specialist array
   public void retreiveSavedEmployeeInfo(int index){
       hr.retrieveSavedEmployeeInfo(index);
   }
   
   // Method to retrieve single employee data
   public void retrieveEmployeeData(){
       hr.retrieveEmployeeData();
   }
   
   // Mthod to update employee cube number in array
   public void changeEmployeeLocation(String cubeId, int index){
       hr.changeEmployeeLocation(cubeId, index);
   }
}
