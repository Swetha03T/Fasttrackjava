package com.Day1;
import java.util.*;

public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		System.out.println(" enter the range");
		int range=sc.nextInt();
		System.out.println("multiplication table for"+number+":");
		for(int i=1;i<=range;i++) {
			System.out.println(number +"*"+i+"="+(number*i));
		}
		

	}

}
