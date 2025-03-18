package logic_programs;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number to cheak : ");
		int num = sc.nextInt();
		
		boolean flag = true;
		
		for(int i = 2; i<=num/2; i++)
		{
			if(num%2 ==0)
			{
				flag = false;
				break;
			}
		
		}
		
		if(flag)
		{
			System.out.println(num + " is a prime number");
			
		}
		else
			System.out.println(num + " Is not prime number");

	}

}
