package UserRegistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.firstNameCheck("Srikanth");
		assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.firstNameCheck("srikanth");
		assertFalse(result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.lasNameCheck("Naidu");
		assertTrue(result);
	}

	@Test
	public void givenLastName_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.lasNameCheck("naidu");
		assertFalse(result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.emailCheck("abc.xyz@bl.co.in");
		assertTrue(result);
	}

	@Test
	public void givenEmail_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.emailCheck("srikanth@gmail.com");
		assertFalse(result);
	}

	@Test
	public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.validMbnumber("91 9640604452");
		assertTrue(result);
	}

	@Test
	public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.validMbnumber("919640604452");
		assertFalse(result);
	}

	@Test
	public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.passwordRule1Check("Srikanth9640@");
		assertTrue(result);
	}

	@Test
	public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.passwordRule1Check("srikanth)");
		assertFalse(result);
	}

	@Test
	public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.passwordrule2Check("Sri@ka96");
		assertTrue(result);
	}

	@Test
	public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.passwordrule2Check("srika.9640@");
		assertFalse(result);
	}

	@Test
	public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.passwordRule3Check("Srikanth640");
		assertTrue(result);
	}

	@Test
	public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.passwordRule3Check("Sri.@96");
		assertFalse(result);
	}

	@Test
	public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
		boolean result = userRegistration.passwordRule4Check("Srikan@9640");
		assertTrue(result);
	}

	@Test
	public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
		boolean result = userRegistration.passwordRule4Check("srik015gmail.com");
		assertFalse(result);
	}
}
