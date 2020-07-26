package com.simplilearn.typecasting;
import java.util.Scanner ;

public class Ex2 {

private static Scanner input;

public static void main(String[] args) {
// WAP for taking user Input as string
// Integer Byte Float and Double

input = new Scanner(System.in);
System.out.print("User Input as String :");

String userNumber = input.nextLine();

int userIntValue = Integer.parseInt(userNumber);
byte userByteValue = Byte.parseByte(userNumber);

float userFloatValue = Float.parseFloat(userNumber);

double userDoubleValue = Double.parseDouble(userNumber);

System.out.println("User Input as Interger : "+userIntValue);
System.out.println("User Input as Byte : "+userByteValue);
System.out.println("User Input as Float : "+userFloatValue);
System.out.println("User Input as Double : "+userDoubleValue);



}

}