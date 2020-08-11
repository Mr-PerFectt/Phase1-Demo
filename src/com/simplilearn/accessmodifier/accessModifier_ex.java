package com.simplilearn.accessmodifier;

import java.util.Scanner;

public class accessModifier_ex {
private int empID = 808808;
public String empName = "Suvam Mohapatra";
protected double empSalary = 79800.90;
public int getID() {
return empID;
}

public String getEmployeeName() {
return empName;
}

//protected void showSalary() {
//System.out.println("Employee Salary is : "+empSalary);
//}
public void showSalary() {
System.out.println("Employee Salary is : "+empSalary);}
//showSalary() can be accessed in other packages if its visibility is changed to public removing comment.

public static void main(String[] args) {
accessModifier_ex empdata = new accessModifier_ex();
System.out.println("Employee ID is: "+empdata.getID());
System.out.println("Employee Name is: "+empdata.getEmployeeName());
empdata.showSalary();
}
}