package com.velocity.product;

import java.util.Scanner;

public class EcommerceHomePage {

	public static void main(String[] args) {

		System.out.println("**************WELCOME TO E-COMMERCE BASED APPLICAION**************");
		System.out.println("-----USER OPERTION--------");
		System.out.println("1.User Registration");
		System.out.println("2.User Login");
		System.out.println("3.User view product items as sorted order");
		
		
		System.out.println("Enter your choice:");
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
		
	System.out.println("Enter first Name>>");
	String firstname=sc.next();
	
	System.out.println("Enter last Name>>");
	String lastname=sc.next();
	
	System.out.println("Enter user Name>>");
	String username=sc.next();
	
	System.out.println("Enter password>>");
	String password=sc.next();
	
	System.out.println("Enter city>>");
	String city=sc.next();
	
	System.out.println("Enter Mobile number>>");
	int mobilenumber=sc.nextInt();
	
	
	userOperation user=new userOperation();
	user.insertUserRegistration(firstname, lastname, username, password, city, mobilenumber);
		}
}
}
