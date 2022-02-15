package com.logicalproblems;

public class DayOfWeek {

    public static void main(String[] args) {
	double m = Double.parseDouble(args[0]);// enter month
	double d = Double.parseDouble(args[1]);// enter day
	double y = Double.parseDouble(args[2]);// enter year

	double y0 = y - (14.0 - m) / 12.0;
	double x = y0 + y0 / 4.0 - y0 / 100.0 + y0 / 400.0;
	double m0 = m + 12.0 * ((14.0 - m) / 12.0) - 2;
	double d0 = (d + x + 31.0 * m0 / 12.0) % 7.0;

	System.out.println("day is " + (int) d0);

	switch ((int) d0) {
	case 0 -> System.out.println("sunday");
	case 1 -> System.out.println("monday");
	case 2 -> System.out.println("tuesday");
	case 3 -> System.out.println("wednesday");
	case 4 -> System.out.println("thursday");
	case 5 -> System.out.println("friday");
	case 6 -> System.out.println("saturday");
	default -> System.out.println("invalid day or answer");

	}
    }

}
