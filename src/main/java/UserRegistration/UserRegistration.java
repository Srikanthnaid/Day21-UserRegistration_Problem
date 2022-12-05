package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void validEmailCheck(String emails) {// taken a Parameter

		// UC9 - >Valid E-Mails
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+[@][a-zA-Z]+[.][a-z]{2,3}$");
		Matcher m = p.matcher(emails);

		if (m.matches()) {// true
			System.out.println("\n\t Email Valid");
		} else { // false
			System.out.println("! Not-Valid Password  \nPlease Enter proper one");
		}

	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to UserRegistration------------");
		validEmailCheck("srikanth019@gmail.com");// call the method
	}
}
