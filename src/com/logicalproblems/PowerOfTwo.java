package com.logicalproblems;

public class PowerOfTwo {
    public static int powerOfTwo(int num) {
	if ((num & (num - 1)) == 0) {
	    return 1;
	} else {
	    return 0;
	}
    }

}
