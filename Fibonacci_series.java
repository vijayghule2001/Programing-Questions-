package logic_programs;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want : ");
		int no = sc.nextInt();
		
		
		int f1, f2=0 , f3=1;
		
		for(int i=0; i<=no; i++)
		{
			if(i==0)
			{
				System.out.println(f2);
			}
			f1=f2;
			f2=f3;
			f3=f1+f2;
			System.out.println(f3);
		}
		 

	}

}
