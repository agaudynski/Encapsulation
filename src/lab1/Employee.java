package lab1;

import java.util.Date;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a 
 * constructor to enforce that. Review the tips in the document 
 * "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    
    // Variables reformated for ecnapsilation
    // All properties set to private
    private String firstName;  
    private String lastName;   
    private String ssn;        
    private String cubeID;     
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private Date orientationDate;


    // Constructor to create mandatory employee inforation
    public Employee (String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    
    // Getters
    
    public String getFirstName () {
        return firstName;
    }
    
    public String getLastName () {
        return lastName;
    }
    
    public String getSsn () {
        return ssn;
    }
    
    public String getCubeID () {
        return cubeID;
    }
    
    public boolean getMetWithHr () {
        return metWithHr;
    }
    
    public boolean getMetDeptStaff () {
        return metDeptStaff;
    }
    
    public boolean getReviewedDeptPolicies () {
        return reviewedDeptPolicies;
    }
    
    public boolean getMovedIn () {
        return movedIn;
    }
    
    public Date getOrientationDate () {
        return orientationDate;
    }

    // Setters
    
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    
    public void setSsn (String ssn) {
        this.ssn = ssn;
    }
    
    public void setCubeID (String cubeID) {
        this.cubeID = cubeID;
    }
    
    public void setMetWithHr (boolean metWithHr) {
        this.metWithHr = metWithHr;
    }
    
    public void setMetDeptStaff (boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }
    
    public void setReviewedDeptPolicies (boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }
    
    public void setMovedIn (boolean movedIn) {
        this.movedIn = movedIn;
    }
    
    public void setOrientationDate (Date orientationDate) {
        this.orientationDate = orientationDate;
    }

}
