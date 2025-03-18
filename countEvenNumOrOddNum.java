package logic_programs;

public class countEvenNumOrOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 14563247;
		
		int evenCount =0;
		int oddCount = 0;
		
		while(num>0)
		{
			int a = num % 10;
			
			 num = num /10;
			 
			if(a%2==0)
			{
				evenCount ++;
			}
			else
			{
				oddCount ++;
			}
			
		}
		
		System.out.println("Even Count :"+ evenCount);
		System.out.println("Odd Count :"+ oddCount);
	}

}
