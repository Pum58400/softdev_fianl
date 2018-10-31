/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tang
 */
public class Job {
    String jobName;
    String jobType;
    String jobOwner;
    int jobAmount;
    int jobSalary;
    String jobDetail;
    String employeeProperty;
    String jobAddress;
    String jobProvince;
    String jobNote;
    
    Job (String jobName, String jobType, String jobOwner, int jobAmount, int jobSalary, String jobDetail,
            String employeeProperty, String jobAddress, String jobProvince, String jobNote) {
        this.jobName = jobName;
        this.jobType =  jobType;
        this.jobOwner = jobOwner;
        this.jobAmount = jobAmount;
        this.jobSalary = jobSalary;
        this.jobDetail = jobDetail;
        this.employeeProperty = employeeProperty;
        this.jobAddress = jobAddress;
        this.jobProvince = jobProvince;
        this.jobNote = jobNote;
    } 
    /*
    public String getJobName() {
        return this.jobName;
    }
    
    public String getJobType() {
        return this.jobType;
    }
    
    public String getJobOwner() {
        return this.jobOwner;
    }
    
    public int getJobAmount() {
        return this.jobAmount;
    }
    
    public int getJobSalary() {
        return this.jobSalary;
    }
    
    public String getJobDetail() {
        return this.jobDetail;
    }
    
    public String getEmployeeProperty() {
        return this.employeeProperty;
    }
    
    public String getJobAddress() {
        return this.jobAddress;
    }
    
    public String getJobProvince() {
        return this.jobProvince;
    }
    
    public String getJobNote() {
        return this.jobNote;
    }
    */
}
