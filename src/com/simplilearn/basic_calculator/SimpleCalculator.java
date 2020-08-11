package com.simplilearn.basic_calculator;

import java.util.*;

public class SimpleCalculator {

//add method
public static double add(double x, double y) {
double result = x+y;
System.out.println("Sum of "+x+" and "+y+" is :");
return result;
}

//subtract method
public static double subtract(double x, double y) {
double result = x-y;
System.out.println("Difference between "+x+" and "+y+" is :");
return result;
}

//multiply method
public static double multiply(double x,double y) {
double result = x*y;
System.out.println("Product of "+x+" and "+y+" is :");
return result;
}

//divide method
public static double divide(double x, double y) {
double result = x/y;
System.out.println("Quotient of "+x+" and "+y+" is :");
return result;
}

public static void main(String[] args) {

double num1, num2;
System.out.println("--------Calculator For Decimal Value Input--------");
System.out.println("1: Add");
System.out.println("2: Subtract");
System.out.println("3: Multiply");
System.out.println("4: Divide");

//User input
Scanner scan = new Scanner(System.in);
System.out.println("Enter two numbers :");
num1 = scan.nextDouble();
num2 = scan.nextDouble();

System.out.println("Enter your choice to perform specific operation");
int result = scan.nextInt();

//Arithmetic operations based on user input
switch(result) {
case 1:
System.out.println(add(num1, num2));
break;
case 2:
System.out.println(subtract(num1, num2));
break;
case 3:
System.out.println(multiply(num1, num2));
break;
case 4:
System.out.println(divide(num1, num2));
break;
default:
System.out.println("Invalid Input");

}
scan.close();
}

}