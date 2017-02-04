package lab4;

import java.util.Date;

/**
 * This class is the startup class for the program. But together with the 
 * other classes provided it is not a particularly good simulation of the 
 * real world. Employees don't just hire themselves and them tell themselves
 * to go through orientation. There's usually a company and a HR person involved.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Startup {
    public static void main(String[] args) {
        
        
        //HRSpecialist hr = new HRSpecialist();
        Company corp = new Company();
        
        
        // Create new employee and hire
        corp.hireNewEmployee("Peter", "Piper", "333-33-3333", "A101", 0);
        
            // Create space in output
               System.out.println();
        
        
        // Display employee info
        System.out.println("Show employee info");
        System.out.println("-----------------------");
        corp.retreiveSavedEmployeeInfo(0);
    
        
        // Change the employee seat locaiton
        corp.changeEmployeeLocation("B555", 0);
        
            // Create space in output
               System.out.println();        
        
        // Display updated employee info
        System.out.println("Show updated employee info");
        System.out.println("-----------------------");
        corp.retrieveEmployeeData();
        
            // Create space in output
               System.out.println();        
        
        // Hire a second employee
        corp.hireNewEmployee("James", "Kirk", "444-44-4444", "E1701", 1);
        corp.hireNewEmployee("Mr", "Spock", "444-77-4444", "E1702", 2);
        
        // Display employee for both employees
        System.out.println("Show all employee info");
        System.out.println("-----------------------");
        corp.retreiveSavedEmployeeInfo(0);
        corp.retreiveSavedEmployeeInfo(1);
        corp.retreiveSavedEmployeeInfo(2);
        
            // Creae space in output
            System.out.println();
 
        
 
        
       
    }
    
    
    
}
