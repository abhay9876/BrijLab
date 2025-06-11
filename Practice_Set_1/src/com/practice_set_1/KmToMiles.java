package com.practice_set_1;

import java.util.Scanner;

public class KmToMiles {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	float km = sc.nextInt();
    	
        double m = km * 0.621371;
    	
    	System.out.println(m);
    	
    }
}

