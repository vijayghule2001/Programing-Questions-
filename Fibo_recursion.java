package logic_programs;

import java.util.Scanner;

public class Fibo_recursion {
	static int  prev=0, next = 1, temp =0;
	
	public static void Fibonassi(int input)
	{
		 
		
		if(input > 0)
		{
			
			System.out.println(prev+ " ");
			
			temp = prev + next;
			prev = next;
			next = temp;
			Fibonassi(input -1);
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter any number you want : ");
		
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		 Fibonassi(num);

	}

}
