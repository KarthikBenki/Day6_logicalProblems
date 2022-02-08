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

	public static void stopWatch(int click) {
		final int START = 1;
		final int STOP = 0;
		int i = 0;

		if (click == START) {
			while (true) {
				System.out.println(i++);
				if (i > 9999) {
					break;
				}
			}

		}
		System.out.println(i / 60 + " minutes");

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to start 0 to stop");
			int num = scanner.nextInt();
			stopWatch(num);

		}
//		scanner.close();
	}

}
