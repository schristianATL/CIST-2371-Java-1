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
package convertfoottometer;
    import java.util.Scanner;
/**
 *
 * @author CS118337
 */
public class ConvertFootToMeter {



    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number of feet: ");
    double feet = input.nextDouble();
    double meter = feet * 0.305;
    System.out.println(feet + " feet is " + meter + " meters.");
           
    }
    
}

