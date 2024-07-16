package com.Day1;
import java.util.*;

public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
int number=sc.nextInt();
int n=0, originalNumber,rem,res=0;
originalNumber=number;
while(originalNumber!=0)
{
	originalNumber/=10;++n;
	
}
originalNumber=number;
while(originalNumber!=0)
{
	rem=originalNumber%10;
	res+=Math.pow(rem, n);
	originalNumber/=10;
}
if(res==number)
{
	System.out.println(number +"is an amstrong number");
}
	else
		System.out.println(number +"is not a amstrong number");
}
}
	


