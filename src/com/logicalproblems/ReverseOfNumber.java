package com.logicalproblems;

import java.util.Scanner;

/*
 * 4. Reverse a number
In Java, we can reverse a number either by using for loop, while loop, or using recursion.
The simplest way to reverse a number is by using for loop or while loop. In order to
reverse a number, we have to follow the following steps:
a. We need to calculate the remainder of the number using the modulo
b. After that, we need to multiply the variable reverse by 10 and add the remainder into
it.
c. We then divide the number by 10 and repeat steps until the number becomes 0.
 */

public class ReverseOfNumber {

	public static void reversePrint(int num) {
		int reverse = 0;
		int remainder = 0;
		int num1 = num;
		while (num1 != 0) {
			remainder = num1 % 10;
			reverse = reverse * 10 + remainder;
			num1 = num1 / 10;
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number to reverse");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("the reverse of given number is");
		reversePrint(num);
	}

}
