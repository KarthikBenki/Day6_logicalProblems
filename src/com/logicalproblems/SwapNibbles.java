package com.logicalproblems;

import java.util.Scanner;

public class SwapNibbles {
    public static int swapNibbles(int num) {
	System.out.println("before swapping nibbles");
	System.out.printf("%d\n", num);
	ToBinary.printBinary(num);
	int m = 0x0000000f;
	int n = 0xf0000000;
	num = ((num & n) >> 28) | ((num & m) << 28);
	System.out.println(" after swapping nibbles");
	System.out.printf("%d\n", num);
	ToBinary.printBinary(num);
	return num;

    }

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scanner.nextInt();
	int num2 = swapNibbles(num);
	int ret = PowerOfTwo.powerOfTwo(num2);
	if (ret == 1) {
	    System.out.println("swapped number power of 2");
	} else {
	    System.out.println("swapped number is not a power of 2");
	}

    }

}
