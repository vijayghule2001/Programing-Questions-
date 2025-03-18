package logic_programs;

import java.util.Scanner;

public class Even_odd {
	
	
	public static void main(String argss [])
	{
		Scanner sc = new Scanner(System.in);
		
	 System.out.println("Enter Any number : ");
	 var a = sc.nextInt();
	 
	 if(a%2==0)
	 {
		 System.out.println(a+" Number is Even");
	 }
	 else
	 {
		 System.out.println(a+ " number is odd");
	 }
	}

}
