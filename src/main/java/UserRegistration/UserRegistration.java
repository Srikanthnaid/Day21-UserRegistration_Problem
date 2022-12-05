package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void nameCheck(String FirstName) {
		
		Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher m = p.matcher(FirstName);
		
		if(m.matches()) {
			System.out.println("\n\tFirstname Valid");
		}else {
			System.out.println("! Not-Valid FirstName  \nPlease Enter proper one");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to UserRegistration------------");
		nameCheck("Srikanth");
	}
}
