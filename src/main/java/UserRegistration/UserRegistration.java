package UserRegistration;

import java.util.regex.Pattern;

public class UserRegistration {

	// UC10 - > J Unit Test
	// uc1
	public boolean firstNameCheck(String FirstName) {// taken a Parameter
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}$", FirstName);
	}

	// uc2
	public boolean lasNameCheck(String LastName) {
		return Pattern.matches("^[A-Z]{1}[a-z]{2,}$", LastName);
	}

	// uc3
	public boolean emailCheck(String Email) {
		return Pattern.matches("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$", Email);
	}

	// uc4
	public boolean validMbnumber(String MbNumber) {
		return Pattern.matches("^[1-9]{2}\\s[6-9]{1}[0-9]{9}$", MbNumber);
	}

	// uc5
	public boolean passwordRule1Check(String password) {
		return Pattern.matches("^[A-Za-z0-9@#$_-]{8,}", password);
	}

	// UC6
	public boolean passwordrule2Check(String Password) {
		return Pattern.matches("^[A-Z]{1}[A-Za-z0-9@._-]{7,}$", Password);
	}

	// uc7
	public boolean passwordRule3Check(String Password) {
		return Pattern.matches("^[A-Za-z0-9]{8,}$", Password);
	}

	// uc8
	public boolean passwordRule4Check(String password) {
		return Pattern.matches("^[A-Za-z0-9!/$%#_=@]{8,}$", password);
	}

}
