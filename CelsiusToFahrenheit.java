/**
 * Class: CIST 2371 Introduction to Java
 * Semester: Summer 2016
 * Instructor: Jianmin Wang
 * Description: Solution to Unit 01 Program 1
 * Due: 6/13/2016
 * @author Scott Christian
 * @version 1.0
 *
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 *
 */
package celsiustofahrenheit; 

import java.util.Scanner;
public class CelsiusToFahrenheit {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a degree in Celsius: ");
double celsius = input.nextDouble();
// Convert Celsius to Fahrenheit
double fahrenheit = (9.0 / 5) * celsius + 32;
System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");
}
}