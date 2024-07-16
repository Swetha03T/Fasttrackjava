package com.Day1;
import java.util.*;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int reversedNumber=0;
		while(number!=0) {
			int digit=number%10;
			reversedNumber=reversedNumber*10+digit;
			number/=10;
		}
		System.out.println("reversed number:"+reversedNumber);
		}
	}


