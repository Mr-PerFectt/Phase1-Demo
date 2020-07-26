package com.simplilearn.typecasting;

import java.util.Scanner;
public class Ex1{
private static Scanner myInput;

public static void main( String args[] ) {
myInput = new Scanner( System.in );
int a;

System.out.print( "Enter integer value: " );
a = myInput.nextInt();


float floata = a;
double doublea = floata;
byte bytea = (byte) doublea;



System.out.println("Float value :"+floata);
System.out.println("Double value :"+doublea);
System.out.println("Byte value :"+bytea);


}
}