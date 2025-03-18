package logic_programs;

public class factors_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 13;
		
		FindFactor(num);

	}

	private static void FindFactor(int num) {
		// TODO Auto-generated method stub
		
		System.out.print("Factore of given number "+ num+ " : " );
		
		for(int i=1; i<=num; i++)
		{
			if(num % i == 0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
