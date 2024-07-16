package com.Day1;
import java.util.*;

public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n= sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
	sum+=i;
	
}
	System.out.println("sum of naturalnumbers upto "+n+"is" + sum);

}
}
