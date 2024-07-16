package com.Day1;
import java.util.*;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String str=sc.nextLine();
String reversedStr="";
for(int i=str.length()-1;i>=0;i--) {

reversedStr+=str.charAt(i);
}
System.out.println("reversed string is "+reversedStr);
	}
	
} 

