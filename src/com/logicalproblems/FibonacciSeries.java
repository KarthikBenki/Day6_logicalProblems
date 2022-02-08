package com.logicalproblems;

import java.util.Scanner;

public class FibonacciSeries {

	public static void fibonacciSeries(int range) {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " " + b + " ");
		while (true) {
			c = a + b;
			if (c > range) {
				break;
			}
			System.out.print(c + " ");
			a = b;
			b = c;

		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = scanner.nextInt();
		System.out.println("the fibonacci series with in range are");
		fibonacciSeries(range);
		scanner.close();
	}

}
