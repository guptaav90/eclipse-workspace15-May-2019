package Programs;

public class ReverseString {

	public static void main(String[] args) {


		String Name="AVIGUPTA";
		int Length=Name.length();
		
		
		for(int i=Length-1;i>=0;i--)
		{
			char Reverse=Name.charAt(i);// ATPUGIVA
			System.out.println(Reverse);
		}
		
	}

}
