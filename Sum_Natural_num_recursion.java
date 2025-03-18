package logic_programs;

public class Sum_Natural_num_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 4;
		
		int sum = sumof(num);
		System.out.println(sum);

	}

	public static int sumof(int num) {
		// TODO Auto-generated method stub
	 
		if(num <=1)
		{
			return num;
		}
		
		return num + sumof(num-1);
	}

}
