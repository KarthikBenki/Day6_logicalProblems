package com.logicalproblems;

import java.util.Scanner;

public class SqrtNewton {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the non negative number");
//	double c = scanner.nextDouble();
	double c = Double.parseDouble(args[0]);
	scanner.close();
	double t = c;
	double epsilon = 1e-15;

	while (Math.abs(t - c / t) > epsilon * t) {
	    t = (t + c / t) / 2;
	}
	System.out.printf("the sqrt of given number %1.3f is %1.3f ", c, t);

    }

}
