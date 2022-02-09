package com.logicalproblems;

import java.util.Scanner;

public class TemperatureConversion {

	public static void fahrenheitCheck(double celsius) {
//		double fahrenheit = 0;
		double fahrenheit = celsius * 9 / 5 + 32;
		System.out.println(fahrenheit);
	}

	public static void celsiusCheck(double fahrenheit) {
//		double celsius = 0;
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println(celsius);
	}

	public static void main(String[] args) {
		System.out.println("selection\r\t1)fahrenheit to celsious \r\t" + "2)celsious to fahrenheit");
		Scanner scanner = new Scanner(System.in);

		int selection = scanner.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Enter the fahrenheit value to convert to celsious");
			double fahrenheit = scanner.nextInt();
			celsiusCheck(fahrenheit);
			break;
		case 2:
			System.out.println("Enter the celsious value to convert to fahrenheit");
			double celsious = scanner.nextInt();
			fahrenheitCheck(celsious);
			break;
		default:
			System.out.println("invalid input");
			break;
		}

	}

}
