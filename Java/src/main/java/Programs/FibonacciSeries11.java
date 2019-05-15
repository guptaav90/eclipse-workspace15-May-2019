package Programs;

public class FibonacciSeries11 {
	
	
	public static void main(String []args) {
		
		
		int a=0;
		int b=1;
		
		for(int i=0;i<=5;i++)//0,1,2,3,4,5
		{
			
			System.out.println(a);//0,1,1,2,3,5,
			
			a=a+b;//1,1,2,3,5,8
			b=a-b;//0,1,1,2,3,5
		}
		
		
	}
	

}
