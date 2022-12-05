package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void nameCheck(String LastName) {
		
		Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher m = p.matcher(LastName);
		
		if(m.matches()) {//true		
			System.out.println("\n\tLastName Valid");
		}else {				//false
			System.out.println("! Not-Valid LastName  \nPlease Enter proper one");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to UserRegistration------------");
		nameCheck("Naidu");
	}
}
