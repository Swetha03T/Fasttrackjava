package com.Day1;
import java.util.*;

public class Program4 {

	public static void main(String[] args) {
		int num,count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to find prime or not");
		 num=sc.nextInt();
		if(num==0||num==1) {
	
			System.out.println(num+"is not a prime number");
		}
		for(int i=2;i<=num;i++)
		{
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num+"is a prime number");
			
		}
		
	else {
		System.out.println( num+" is not a prime number");
	}
}

			
		
		// TODO Auto-generated method stub

	}


