package com.Day1;
import java.util.*;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println(a+" is greater");
		else if(b>a&&b>c)
			System.out.println(b+" is greater");
		else
			System.out.println(c+" is greater");
	}

		
					
		

	}


