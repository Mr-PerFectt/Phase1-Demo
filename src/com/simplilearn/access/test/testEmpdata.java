package com.simplilearn.access.test;

import com.simplilearn.accessmodifier.accessModifier_ex;

public class testEmpdata {

 

 

 

public static void main(String[] args) {
// TODO Auto-generated method stub
accessModifier_ex amtest = new accessModifier_ex();
System.out.println("Employee ID is: "+amtest.getID());
System.out.println("Employee Name is: "+amtest.getEmployeeName());
amtest.showSalary(); // this explains the accessibility of protected modifier
}
}