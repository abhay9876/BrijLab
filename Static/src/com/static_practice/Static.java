package com.static_practice;

//class Student {
//	static int  totalnumbers = 0 ; 
//	String name;
//	Student(String name){
//		this.name = name;
//		totalnumbers++;
//	}
//}
//
//
//
//
//
//public class Static {
//
//	public static void main(String[] args) {
//		Student s1 = new Student("john");
//		Student s2 = new Student("jane");
//		
//		System.out.print(Student.totalnumbers);
//	}
//
//}


// Static Method 

//class Mathutility{
//	static int add(int a , int b) {
//		return a+b;
//	}
//}
//
//
//public class Static{
//	public static void main(String[] args) {
//		int sum = Mathutility.add(5, 10);
//		System.out.print(sum);
//	}
//}


// Static Blocks

//class DatabaseConfig {
//	static String url;
//	static String username;
//	
//	static {
//		url="jdbc:mysql://localhost:3306/mydb";
//		username = "admin";
//		System.out.println("Static block excutedd");
//		
//	}
//}
//
//public class Static{
//	
//	public static void main(String[] args) {
//		System.out.println(DatabaseConfig.url);
//	}
//}




// static sub class


//class Outerclass{
//	static class StaticNested{
//		void display() {
//			System.out.println("Inside static nested class");
//		}
//	}
//}
//
//
//public class Static{
//	public static void main(String[] args) {
//		Outerclass.StaticNested nested = new Outerclass.StaticNested();
//		nested.display();
//	}
//}
//







































