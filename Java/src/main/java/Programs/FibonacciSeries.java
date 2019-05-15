package Programs;

public class FibonacciSeries {

	public static void main(String[] args) {

		
		int a=0;
		int b=1;
		
		
		for(int i=0;i<=7;i++) {
			
			System.out.println(a);
			
			a=a+b;
			b=a-b;
		}

		
		System.out.println("--------------------------");
		
		
		
		int x=0;
		int z=1;
		
		
		for(int i=1;i<=7;i++) {
			
			System.out.println(x);
			
			x=x+z;
			z=x-z;
		}
		
		System.out.println("--------------------------");
		
		
		int c=1;
		int d=1;
		
		
		for(int i=0;i<=7;i++) {
			
			System.out.println(c);
			
			c=c+d;
			d=c-d;
		}
		
	}

}
