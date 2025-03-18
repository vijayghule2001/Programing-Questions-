package logic_programs;

import java.util.Scanner;

public class Recursion_factorial {
	int fact=1;
	
	
	int calfact(int no)
	{
		
		if(no>1)
		{
			fact = fact*no;
			calfact(no-1);
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int no = sc.nextInt();
		
		Recursion_factorial Rf = new Recursion_factorial();
		
		int res = Rf.calfact(no);
		System.out.println(res);

	}

}
