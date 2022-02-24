package org.icici;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Name, Age, Salary");
		
		String name = sc.nextLine();
		int Age = sc.nextInt();
		double salary = sc.nextDouble();
		
		System.out.println("Name is:" +name);
		System.out.println("Age is:" +Age);
		System.out.println("Salaey is:" +salary);
	}

}
