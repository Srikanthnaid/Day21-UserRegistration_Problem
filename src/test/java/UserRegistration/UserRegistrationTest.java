package UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnsTrue()  {
		try {
			assertTrue(userRegistration.firstNameCheck("Srikanth"));
			System.out.println("FirstName Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Invalid FirstName  " + ex);
		}
	}

	@Test
	public void givenFirstName_WhenInValid_ShouldReturnsFalse()  {
		//here we assume exception takes
		//so we can use try catch block to handle the exception
		try {
			assertFalse(userRegistration.firstNameCheck("srikanth"));
			System.out.println("First name is valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("Invalid First Name because :- " + ex);
		}
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnsTrue() {
		try {
			assertTrue(userRegistration.lasNameCheck("Naidu"));
			System.out.println("LastName valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("!Invalid lastname " + ex);
		}

	}

	@Test
	public void givenLastName_WhenInValid_ShouldReturnsFalse() {
		try {
			assertFalse(userRegistration.lasNameCheck("naidu"));
			System.out.println("LastName valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("!Invalid lastname " + ex);
		}
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnsTrue() {

		try {
			assertTrue(userRegistration.emailCheck("abc.xyz@bl.co.in"));
			System.out.println("Valid mail");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Invalid email"+ex);
		}

	}

	@Test
	public void givenEmail_WhenInValid_ShouldReturnsFalse() {
		
		try {
			 assertFalse(userRegistration.emailCheck("srikanth@gmail.com"));
			 System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Invalid Email"+ex);
		}
		
	}

	@Test
	public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
		
		try {
			assertTrue(userRegistration.validMbnumber("91 9640604452"));
			System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Not Valid "+ex);
		}
	}

	@Test
	public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
		
		try {
			 assertFalse(userRegistration.validMbnumber("919640604452"));
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Invalid "+ex);
		}
		
	}

	@Test
	public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
		
		try {
			assertTrue(userRegistration.passwordRule1Check("Srikanth9640@"));
			System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Invalid "+ex);
		}
		
	}

	@Test
	public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
		
		try {
			assertFalse(userRegistration.passwordRule1Check("srikanth)"));
			System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Invalid "+ex);
		}
		
	}

	@Test
	public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
		
		try {
			assertTrue(userRegistration.passwordrule2Check("Sri@ka96"));
			System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Invalid "+ex);
		}
		
	}

	@Test
	public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
		
		try {
			assertFalse(userRegistration.passwordrule2Check("srika.9640@"));
			System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Not Valid "+ex);
		}
		
	}

	@Test
	public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
		
		try {
			assertTrue(userRegistration.passwordRule3Check("Srikanth640"));
			System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Not Valid "+ex);
		}
		
	}

	@Test
	public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
		
		try {
			assertFalse(userRegistration.passwordRule3Check("Sri.@96"));
			System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("\n! NotValid "+ex);
		}
		
	}

	@Test
	public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
		
		try {
			assertTrue(userRegistration.passwordRule4Check("Srikan@9640"));
			System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Not valid "+ex);
		}
		
	}

	@Test
	public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
		
		try {
			assertFalse(userRegistration.passwordRule4Check("srik015gmail.com"));
			System.out.println("Valid");
		} catch (InvalidUserDetailsException ex) {
			System.out.println("! Invalid "+ex);
		}
		
	}
}
