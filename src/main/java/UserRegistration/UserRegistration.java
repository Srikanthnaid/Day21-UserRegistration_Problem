package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void mobileNumberCheck(String Mbnumber) {// taken a Parameter

		// UC3 ->Valid E-mail
		Pattern p = Pattern.compile("^[1-9]{2}\\s[6-9]{1}[0-9]{9}$");
		Matcher m = p.matcher(Mbnumber);

		if (m.matches()) {// true
			System.out.println("\n\tMobile number Valid");
		} else { // false
			System.out.println("! Not-Valid mobile number  \nPlease Enter proper one");
		}

	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to UserRegistration------------");
		mobileNumberCheck("91 9640604452");// call the method
	}
}
