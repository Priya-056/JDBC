//Write a program that reads your age from the console and prints your age after 10 
//years
package javaExcersice;

import java.util.Scanner;

public class Secondqstn {
	
	public int afterTenyears(int age) {
		
		return (age+10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		Secondqstn ob=new Secondqstn();
		int opt=ob.afterTenyears(age);
		System.out.print("This is your age after 10 years: "+opt);

	}

}
