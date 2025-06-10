package com.practice_set_1;
import java.util.*;
public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	float celsius = sc.nextFloat();
    	float fahrenheit = (celsius * 9/5)+32;
    	System.out.println(fahrenheit);
    }
}
