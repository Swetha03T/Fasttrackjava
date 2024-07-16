package com.Day1;
import java.util.*;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,i;
		System.out.println("enter a number to print fibanacci series");
		num=sc.nextInt();
		int a=0,b=1,c;
		for(i=1;i<=num;i++) {
			System.out.println(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
		
		
			
			

	}

}
