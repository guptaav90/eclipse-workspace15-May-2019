package Programs;

public class ReverseString11 {

	public static void main(String[] args) {


		String Name="AVI";
		
		int NameLength=Name.length();
		System.out.println(NameLength);
		
		for(int i=NameLength-1;i>=0;i--)
		{
			
			char rs= Name.charAt(i);
			System.out.println(rs);
			
		}
		
		for(int i=0;i<=NameLength-1;i++)
		{
			
			char rss= Name.charAt(i);
			System.out.println(rss);
			
		}
		
	}

}
