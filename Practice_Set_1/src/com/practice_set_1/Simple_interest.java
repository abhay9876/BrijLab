package com.practice_set_1;

import java.util.Scanner;

public class Simple_interest {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int P = sc.nextInt();
    	float r= sc.nextFloat();
    	int t = sc.nextInt();
    	float SI = (P*r*t)/100;;
    	
    	System.out.println(SI);
    }
}



