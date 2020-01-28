package utilities;

public class CountryCodeUtilities {
	public static boolean checkValidCountryCode(int countryCode) {
		if(countryCode > 0 && countryCode < 10) {
			return true;
		} else {
			return false;
		}
	}
}
