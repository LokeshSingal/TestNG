package com.sayem.testng.tutorials;

public class EmpBusinessLogic {

    public double calculateYearlySalary(EmployeeDetails employeeDetails){

        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    public double calculateAppraisal(){
        return 0;
    }
}
