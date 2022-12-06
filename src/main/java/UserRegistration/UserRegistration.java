package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	// UC10 - > J Unit Test
	// uc1
	public boolean firstNameCheck(String FirstName) throws InvalidUserDetailsException {
		Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}&");
		Matcher m = p.matcher(FirstName);
		boolean result = m.matches();
		if (!result) {
			throw new InvalidUserDetailsException(
					"first Name should start with a Cap and should have minimum 3 characters");
		} else {
			return true;
		}
	}

	// uc2
	public boolean lasNameCheck(String LastName) throws InvalidUserDetailsException {
		Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher m = p.matcher(LastName);
		boolean result = m.matches();
		if (!result) {
			throw new InvalidUserDetailsException("Last Name should start with a Cap and should have minimum 3 chars");
		} else {
			return true;
		}
	}

	// uc3
	public boolean emailCheck(String Email) throws InvalidUserDetailsException {
		Pattern p = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
		Matcher m = p.matcher(Email);
		boolean result = m.matches();
		if (!result) {
			throw new InvalidUserDetailsException("Email has 3 mandatory parts(abc,bl,&co) and 2 optional(xyz & in");
		} else {
			return true;
		}

	}

	// uc4
	public boolean validMbnumber(String MbNumber) throws InvalidUserDetailsException {
		Pattern p = Pattern.compile("^[1-9]{2}\\s[6-9]{1}[0-9]{9}$");
		Matcher m = p.matcher(MbNumber);
		boolean result = m.matches();
		if (!result) {
			throw new InvalidUserDetailsException("country code foollows gy space and 10 digit number");
		} else {
			return true;
		}
		
	}

	// uc5
	public boolean passwordRule1Check(String password) throws InvalidUserDetailsException {
		Pattern p = Pattern.compile("^[A-Za-z0-9@#$_-]{8,}$");
		Matcher m = p.matcher(password);
		boolean result = m.matches();
		if (!result) {
			throw new InvalidUserDetailsException("password must having minimum 8 character");
		} else {
			return true;
		}
	}

	// UC6
	public boolean passwordrule2Check(String Password) throws InvalidUserDetailsException {
		Pattern p = Pattern.compile("^[A-Z]{1}[A-Za-z0-9@._-]{7,}$");
		Matcher m = p.matcher(Password);
		boolean result = m.matches();
		if (!result) {
			throw new InvalidUserDetailsException("password should have al least 1 upper case");
		} else {
			return true;
		}
		
	}

	// uc7
	public boolean passwordRule3Check(String Password) throws InvalidUserDetailsException {
		Pattern p = Pattern.compile("^[A-Za-z0-9]{8,}$");
		Matcher m = p.matcher(Password);
		boolean result = m.matches();
		if (!result) {
			throw new InvalidUserDetailsException("password should have at leat 1 numeric value");
		} else {
			return true;
		}
	
	}

	// uc8
	public boolean passwordRule4Check(String password) throws InvalidUserDetailsException {
		Pattern p = Pattern.compile("^[A-Za-z0-9!/$%#_=@]{8,}$");
		Matcher m = p.matcher(password);
		boolean result = m.matches();
		if (!result) {
			throw new InvalidUserDetailsException("p");
		} else {
			return true;
		}
		
	}

}
