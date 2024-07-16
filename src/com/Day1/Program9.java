package com.Day1;
import java.util.*;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
       System.out.println("enter 2 numbers");
       int a=sc.nextInt();
       int b=sc.nextInt();
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("after swapping :");
       System.out.println("a= "+a+"\n"+"b="+b);
       


	}

}
