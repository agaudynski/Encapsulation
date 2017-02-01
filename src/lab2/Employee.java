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

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    ///////////////////////////////////// updated ////////////////////////////////////
    // Create parent method to update Orientation Information in order of operation and update info
    public void recordEmployeeOrientation (Date orientationDate, String firstName, String lastname, String ssn, String cubeID) {
        Employee employee1 = new Employee(firstName, lastName, ssn);
        employee1.meetWithHrForBenefitAndSalryInfo();
        employee1.meetDepartmentStaff();
        employee1.reviewDeptPolicies();
        employee1.moveIntoCubicle(cubeId);     
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    //////////  updated to private - shold not be done again after constructor /////
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);        
        System.out.println(firstName + " " + lastName + " met with Hr on "
            + fmtDate);
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.:
    //////////  updated to private - shold not be done again after constructor /////
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);        
        System.out.println(firstName + " " + lastName + " met with Dept. Staff on "
            + fmtDate);
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    //// no change as this method shoudl be accesbile outside of constructor //////
    public void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);        
        System.out.println(firstName + " " + lastName + " reviewed Dept policies on "
            + fmtDate);
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    //// no change as this method shoudl be accesbile outside of constructor //////
    public void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(orientationDate);        
        System.out.println(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + fmtDate);
    }

    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation.
    
    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
       this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }
    
    /// updated to private as ssn is set in new method and should not be set again
    private void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    // boolean parameters need no validation
    // set to private as this done only once when employee is created
    private void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }
    
    // set to private as this is only done once when employee is created
    private void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    // kept as public since method will be needed if an employee moves cubes
    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    
    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    private void setOrientationDate(Date orientationDate) {
        this.orientationDate = orientationDate;
    }
}
