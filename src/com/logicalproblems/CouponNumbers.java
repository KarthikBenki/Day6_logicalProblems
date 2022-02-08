package com.logicalproblems;

import java.util.Random;
import java.util.Scanner;

/*
 * 5. Coupon Numbers
a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random
process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.
 */
public class CouponNumbers {
	public static boolean isPresent(int a[], int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("how many random numbers do you\r\n" + "need to generate a distinct coupon number?");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int randomNum = 0;
		int arr[] = new int[size];
		Random coupon = new Random();
		boolean ret;

		for (int i = 0; i < arr.length; i++) {
			randomNum = coupon.nextInt(100);
			ret = isPresent(arr, randomNum);
			if (ret != true) {
				arr[i] = randomNum;
			} else {
				--i;
			}
		}

		/*
		 * arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
		 * System.out.println(isPresent(arr, 20));
		 */
		System.out.println("The random numbers generated are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

	}

}
