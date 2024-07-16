package com.Day1;
import java.util.*;

public class Program3 {

	public static void main(String[] args) {
		int num,fact=1;
		int i;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=1;i<=num;i++)
			fact=fact*i;
	
	System.out.println("factorial of"+num+"is:"+fact);
	
}
}
