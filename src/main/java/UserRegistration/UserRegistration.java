package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void emailCheck(String Email) {// taken a Parameter

		// UC3 ->Valid E-mail
		Pattern p = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
		Matcher m = p.matcher(Email);

		if (m.matches()) {// true
			System.out.println("\n\tLastName Valid");
		} else { // false
			System.out.println("! Not-Valid LastName  \nPlease Enter proper one");
		}

	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to UserRegistration------------");
		emailCheck("abc.xyz@bl.co.in");// call the method
	}
}
