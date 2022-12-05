package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void passwordCheck(String Password) {// taken a Parameter

		// UC5 ->password Rule 1
		Pattern p = Pattern.compile("^[A-Za-z0-9@#$_-]{8,}$");
		Matcher m = p.matcher(Password);

		if (m.matches()) {// true
			System.out.println("\n\t Password Valid");
		} else { // false
			System.out.println("! Not-Valid Password  \nPlease Enter proper one");
		}

	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to UserRegistration------------");
		passwordCheck("Srikanth9640@");// call the method
	}
}
