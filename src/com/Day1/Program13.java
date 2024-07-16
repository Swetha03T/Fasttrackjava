package com.Day1;
import java.util.*;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year");
		int year=sc.nextInt();
		boolean isLeapYear=(year%4==0&&year%100!=0)||(year%400==0);
		if(isLeapYear) {
			System.out.println(year+"is  leap yaer");
			
		}
		else
			System.out.println(year +"is not a leap year");
	}
  
}
