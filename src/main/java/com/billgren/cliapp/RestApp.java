package com.billgren.cliapp;

import java.util.List;
import java.util.Scanner;

import com.billgren.bean.User;
import com.billgren.service.UserService;

public class RestApp {
	
	static UserService us = new UserService();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int selection = 0;
		System.out.println( "Please select service:" );
		
		while(true) {

		System.out.println( "1: Get all users from database: \n"
							+ "2: Create new user: \n "
							+ "ENTER 0 to quit \n");
		
		selection = sc.nextInt();
		//clear scanner
		sc.nextLine();
		
		switch(selection) {
			case 0:
				System.exit(0);
				break;
			case 1: 
				printUsers();
				break;
			case 2:
				createUser();
				break;	
		
			}
		

		}
	}

	private static void createUser() {
		System.out.println("Enter full name for user: ");
		String name = sc.nextLine();
		System.out.println("Enter profession for user: ");
		String profession = sc.nextLine();
		
		String status;
		
		status = us.addNewUser( new User(name, profession));
		if(status.startsWith("2")) {
			System.out.println("User created successfully");
		}
		else {
			System.out.println("User was not created");
		}
		
	}

	private static void printUsers() {
		List<User> users = us.getAllUsers();
		users.forEach(u -> System.out.println(u.toString()));
		
	}


}
