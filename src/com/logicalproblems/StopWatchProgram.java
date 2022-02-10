package com.logicalproblems;

import java.util.Scanner;

/*
 * 6. Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.
 */

public class StopWatchProgram {
	public static double startWatch() {
		System.out.println("Enter 1 to start watch");
		Scanner scanner = new Scanner(System.in);
		double startWatch = scanner.nextDouble();
		startWatch = System.currentTimeMillis();
		return startWatch;

	}

	public static double stopWatch() {
		System.out.println("Enter 0 to stop watch");
		Scanner scanner = new Scanner(System.in);
		double stopWatch = scanner.nextDouble();
		stopWatch = System.currentTimeMillis();
		return stopWatch;

	}

	public static void main(String[] args) {
		double timeInSec = Math.abs((startWatch() - stopWatch())) / 1000;
		System.out.println("time in sec is " + timeInSec);

	}

}
