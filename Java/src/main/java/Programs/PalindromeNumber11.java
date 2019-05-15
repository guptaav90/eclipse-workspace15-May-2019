package Programs;

public class PalindromeNumber11 {

	public static void main(String[] args) {


		int rem=0;
		int sum=0;
		int num=91;
		int temp=num;
		
		while(0<num)
		{
			
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		
		if(temp==sum)
		{
			System.out.println(temp + " PalindromeNumber");
		}
		
		else
		{
			System.out.println(temp + " is not a PalindromeNumber");
		}
		
	}

}
