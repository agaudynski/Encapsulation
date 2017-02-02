/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author agaudynski
 */
public class EmployeeOrientationReportService {
    
    private Employee employee;
    
    ///// Generic call that can be used
    public void doOutput (String message){
        System.out.println(message);
    }
    
    ////////  Specific calls that reference employee class
    
    public void outputMetWithHrMessage(){
        String message = "Employe has met with HR.";
        System.out.println(message);
        
    }
    
    ///////
    
    
    public void outputMetDepartmentStaffMessage () {
    
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + " "
                + "met with Dept. Staff on " + employee.getOrientationDate());
    }
    
    
   ///////
    
   public void outputReviewDeptPoliciesMessage () {
       String message = "" + employee.getFirstName() + " " + employee.getLastName() + " "
               + "reviewed Dept policies on " + employee.getOrientationDate();
       System.out.println(message);
   }
   
   //////
   
   public void outputMovedIntoCubeMessage (String cubeID) {
       System.out.println(employee.getFirstName() + " " + employee.getLastName() + ""
               + "moved into cubicle " + cubeID + " on " + employee.getOrientationDate());
   }

    
    

    
    
}
