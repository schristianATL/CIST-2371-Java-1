/*
 * Class: CIST 2371 Introduction to Java
 * Semester: Summer 2016
 * Instructor: Jianmin Wang
 * Description: Solution to Unit 03 Program 2
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
package unit03_prog2;

import java.util.Scanner;

public class Unit03_Prog2 {
	public static void main(String[] args) {

		showOutput(getInput());
	}

	public static int[] getInput() {
		Scanner s = new Scanner(System.in);
		int[] num = new int[10];
		int[] num2 = new int[10];
		int a = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter an integer: ");
			num[i] = s.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			boolean dup = false;
			for (int j = 0; j < i; j++)
				if (num[i] == num[j]) {
					dup = true;
					break;
				}
			if (!dup) {
				num2[a] = num[i];
				a++;
			}
		}
		System.out.println("The number of distinct values is " + a);
		return num2;
	}

	public static void showOutput(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean dup = false;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					dup = true;
					break;
				}
			}
			if (!dup && num[i] != 0) {
				System.out.print(" " + num[i]);
			}
		}
	}
}