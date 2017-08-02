/*
 * Class: CIST 2371 Introduction to Java
 * Semester: Summer 2016
 * Instructor: Jianmin Wang
 * Description: Solution to Unit 03 Program 3
 * Class: CIST 2371 Introduction to Java
 * Due: 6/27/2016
 * @author Scott Christian
 * @version 1.0
 * 
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student.
 * 


 * 
 */
package unit03_prog1;

/**
 *
 * @author CS118337
 */
public class Unit03_Prog1 {

    public static void main(String[] args) {
        char c1 = 'a';
	char c2 = 'z';
            System.out.println("Printing all characters between " + c1 + " and " + c2 + ".\n");
            printChars(c1, c2);
	}

	public static void printChars(char c1, char c2) {
		int count = 1;

		while (c1 <= c2) {
			if (count < 10) {
				System.out.print(c1 + " ");
				c1++;
			} else {
				System.out.println(c1 + " ");
				c1++;
				count = 0;
			}
			count++;
		}
	}

}