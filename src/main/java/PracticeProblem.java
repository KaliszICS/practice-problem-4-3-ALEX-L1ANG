/*
File Name: Lesson 4.3 - Do While Loops
Author: Alex Liang
Date Created: June 16, 2026
Date Last Modified June 16, 2026
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {

		Scanner scanner = new Scanner(System.in);
		int num;

		do {
        System.out.print("Input a positive integer: ");
        num = scanner.nextInt();
    } while (num < 0);
    
    System.out.println(num * 2);
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
		String pass;
		String conf;

		do {
        System.out.print("Input a password: ");
        pass = scanner.nextLine();
        
        System.out.print("Confirm the password: ");
        conf = scanner.nextLine();
    } while (!pass.equals(conf));

	System.out.println("success.");
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		int first;
		int second;

		do {
        System.out.print("Input an integer: ");
        first = scanner.nextInt();
        
        System.out.print("Input an integer that is a multiple of the first integer: ");
        second = scanner.nextInt();
    } while (second % first != 0);

	System.out.println("success.");
	}
}
