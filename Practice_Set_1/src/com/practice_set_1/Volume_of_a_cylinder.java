package com.practice_set_1;

import java.util.Scanner;

public class Volume_of_a_cylinder {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double pi = 3.14; 
    	double radius = sc.nextDouble();
    	double height = sc.nextDouble();
    	double Volume = pi * Math.pow(radius,2)*height;
    	
    	System.out.println(Volume);
    }
}

