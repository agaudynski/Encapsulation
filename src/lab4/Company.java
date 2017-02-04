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
public class Company {
    
    private HRSpecialist hrSpecialist;
    private Employee employee;
    
    HRSpecialist hr = new HRSpecialist();
    
    public Company (){
        hr = new HRSpecialist();
    }
    
    // Hire new employee
    public void hireNewEmployee(String firstName, String lastName, String ssn, String cubeID){
        hr.hireNewEmployee(firstName, lastName, ssn, cubeID);
    }
    
    // Find employee info
    public void findEmployeeInfo (int index) {
        hr.retrieveSavedEmployeeInfo(index);
    }
    
    //Find employee location
    public void getEmployeeLocation(int index) {
        hr.retrieveSavedEmployeeLocation(index);
    }
    
   public void saveEmployeeInfo(Employee employeeName, int index){
       hr.saveEmployeeInfo(employeeName, index);
   }
   
   public void retreiveSavedEmployeeInfo(int index){
       hr.retrieveSavedEmployeeInfo(index);
   }
    
   public void retrieveEmployeeData(){
       hr.retrieveEmployeeData();
   }
   
   public void changeEmployeeLocation(String cubeId){
       hr.changeEmployeeLocation(cubeId);
   }
}
