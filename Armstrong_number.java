package logic_programs;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to cheak : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
		int temp,a;
		
		temp=num;
		while(num>0)
		{
			a=num%10;
			num = num/10;
			sum=sum+a*a*a;
			 
		}
		
		if(temp==sum)
		{
			System.out.println("NUmber is Armstrong number");
		}
		else
			System.out.println("NUmber is not Armstrong number");
		

	}

}
