package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 *    1. Not all methods need to be public
 *    2. When methods need to be called in a certain order you can do this
 *       by creating a parent method that calls the other, helper methods.
 *    3. There is some duplicate code used that violates the D.R.Y. principle.
 *       Eliminate that by encapsulating the duplicate code in a new method
 *       and then call that method in place of the duplicate code
 *    4. All method parameters should be validated.
 * 
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    
   
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;
    private String fmtDate;  // Added to store fomatted date;

    // Constructor for primary employee information. Takes employee name and assigsn other string defaults.
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.cubeId = "not assigned";
        this.fmtDate = "00/00/00";
    }
    
    ///////////////////////////////////// updated ////////////////////////////////////
    // Create parent method to update Orientation Information in order of operation and update info ///
    public void doFirstEmployeeOrientation (Date orientationDate, String cubeID) {
        this.setOrientationDate(orientationDate);  // Sets initial date to pass along to other methods.
        this.formatDate(orientationDate);   // Formats the date
        this.getFormattedDate();            // Returns the formatted date to method scope
        this.meetWithHrForBenefitAndSalryInfo();  // Sets metWithHR to true and outputs message
        this.meetDepartmentStaff();               // Sets metWithDept to true and outputs messagge
        this.reviewDeptPolicies();                // Sets reviewedDeptPolicies to true and outputs message
        this.moveIntoCubicle(cubeId);             // Sets isMovedIn to ture and outputs message
    }
    
    // class added to format date. Remains public to allow formatting for other dates
    public void formatDate(Date orientationDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);
    }
    
    // Public class added to get date
    public String getFormattedDate () {
        return fmtDate;
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    //////////  updated to private - shold not be done again after this is done /////
    private void meetWithHrForBenefitAndSalryInfo() {
        setMetWithHr(true);
        System.out.println(firstName + " " + lastName + " met with Hr on "
            + fmtDate);
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.:
    //////////  updated to private - shold not be done again after occurance /////
    private void meetDepartmentStaff() {
        setMetDeptStaff(true);      
        System.out.println(firstName + " " + lastName + " met with Dept. Staff on "
            + fmtDate);
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    //// no change as this method shoudl be accesbile outside of constructor //////
    public void reviewDeptPolicies() {
        setReviewedDeptPolicies(true); 
        System.out.println(firstName + " " + lastName + " reviewed Dept policies on "
            + fmtDate);
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    //// no change as this method should be accesbile outside of constructor //////
    public void moveIntoCubicle(String cubeId) {
        setCubeId(cubeId);
        setMovedIn(true);  
        System.out.println(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + fmtDate);
    }

    // no change. firstName shoudl be available for public access
    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation.
    
    // Validation added. Stays public to update first name at later date. Alex vs Alexander
    public void setFirstName(String firstName) {
       if (firstName == null || firstName.isEmpty() || firstName.length() < 2) {
           System.out.println("name format is invalid.");
       }
       else
       {
       this.firstName = firstName;
       }
    }

    // No change. last name should be available for public access
    public String getLastName() {
        return lastName;
    }

    // Validation added. Remains public for name change at a later date via wedding etc.
    public void setLastName(String lastName) {
       if (lastName == null || lastName.isEmpty() || lastName.length() < 2)
       {
         System.out.println("Last Name is an invalid format.");
       }
       else
       {
       this.lastName = lastName;
       }
    }

    // Stays public. SSN could be accessed again at a later date.
    public String getSsn() {
        return ssn;
    }
    
    /// updated to private as ssn is set in parent method and should not be changed after
    private void setSsn(String ssn) {
        if (ssn.length() != 9)
        {
            System.out.println("SSN is wrong fomat.");
        }
        else
        {
        this.ssn = ssn;
        }
    }

    // no change. can be called to verify that employee met with hr
    public boolean isMetWithHr() {
        return metWithHr;
    }

    // boolean parameters need no validation
    // set to private as this done only once when employee is created
    // code is reduntant as this is set during new parent method in meetWithHrForBenefitAndSalryInfo()
    // and is only done once.
    private void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    // keep as public so this can be validated.
    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }
    
    // set to private as this is only done once when employee is created
    // code is redundant as it is done during paretn method in meetDepartmentStaff()
    // and is not done again
    private void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    // no change as this should be called to verify if this is done
    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }
  
    // this remains public. If new policies are created that need to be reviewed.
    // This must be set to false, even after initial orientation done in parent method.
    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    // no change. this method should be public to veify that employee has moved
    // into cube.
    public boolean isMovedIn() {
        return movedIn;
    }

    // no change. Stays public to set to false if employee is moving, or ture if 
    // move to new cube is complete.
    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    // no change. Stays public to allow return of cube location
    public String getCubeId() {
        return cubeId;
    }

    // no change. as employees can change location. cube ids will need to be udpated.
    public void setCubeId(String cubeId) {
         if (cubeId == null) 
        {
            System.out.println("Cube ID can not be empty.");
        }
        else
        {
        this.cubeId = cubeId;
        }
    }

    // no change. orientation date can be returned as reference.
    public Date getOrientationDate() {
        return orientationDate;
    }

    // This stays public. Based on code, it can be updaed and called again.
    // I would think this program woudl benefit from a initialOrientation variable for the first day
    // and then an orientationDate variable that can be used to catalog subsequent policy reviews
    public void setOrientationDate(Date orientationDate) {
        if (orientationDate == null)
        {
            System.out.println("Orientation Date can not be empty.");
        }
        else
        {
        this.orientationDate = orientationDate;
        }
    }
}
