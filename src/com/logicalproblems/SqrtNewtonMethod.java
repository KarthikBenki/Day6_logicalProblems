package com.logicalproblems;

/*
 *  Computes the square root of a nonnegative number c using
 *  http://en.wikipedia.org/wiki/Newton's_method
 *  Newton's method:
 *     - initialize t = c
 *     - replace t with the average of c/t and t
 *     - repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t
where epsilon = 1e-15;
 *
 *  % java Sqrt 2
 *  1.414213562373095
 */
public class SqrtNewtonMethod {
	public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);// converting string to double
		double t = c;// initialize t = c
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {// repeat until desired accuracy reached
			t = (c / t + t) / 2.0;// replace t with the average of c/t and t
		}
		System.out.println("Square root of " + c + " is " + t);

	}
}
