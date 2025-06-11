package com.practice_set_1;
import java.util.*;
public class AreaOfCircle {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double pi = 3.14; 
    	double radius = sc.nextFloat();
    	double Area = pi * Math.pow(radius,2);
    	System.out.println(Area);
    }
}


