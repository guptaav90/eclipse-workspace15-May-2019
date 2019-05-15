package Programs;

public class RemoveJunkSpecialCharsinString {

	public static void main(String[] args) {


		
		String Test1="$$%(0233424( %Automation #*$_#_@ -Selenium #$&*#$}}{$#&*$ @Java";
		String Test2=Test1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(Test2);
		
		
		
		String Test3="@!1$*( Window Handling )(+2$$*)";
		String Test4=Test3.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(Test4);
		
		
		
	/*	String Test5=Test3.replace("Window", "Alert");
		System.out.println(Test5);
		
		
		String Test6=Test3.replace("Wi", "w");
		System.out.println(Test6);
		
		
		String Test7=Test3.replaceFirst("Window", "");
		System.out.println(Test7);
		*/
		
	}

}
