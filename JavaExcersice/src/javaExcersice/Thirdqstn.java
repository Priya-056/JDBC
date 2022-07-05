/*
 * Write a program that takes as input a four-digit number in format abcd (e.g. 2011) and 
performs the following actions:
– Calculates the sum of the digits (in our example 2+0+1+1 = 4).
 
 */

package javaExcersice;

import java.util.Scanner;

public class Thirdqstn {
	int sum,rev=0;
	int digit;
	public int sumOfDigits(int num) {
		
		while(num > 0)  
		{  
			
		//finds the last digit of the given number    
		digit = num % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		num = num / 10;  
		}
		
		return sum;  
		
	}
	
	public int reverse(int num) {
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		
		Thirdqstn ob=new Thirdqstn(); //object creation
		
		System.out.println("Sum of Digits of "+num+" is: "+ob.sumOfDigits(num));
		System.out.println("Reverse of "+num+" is: "+ob.reverse(num));

	}

}
