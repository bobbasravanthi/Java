package com.primasolv.vehiclemanufactuer.utilities;

import java.util.regex.Pattern;

public class Utility {
	public static boolean isValidManufacturer(String mfr) {
		if(mfr == null || mfr.trim().equals("") || mfr.trim().length() < 1) {
			return false;
		} else if (containsNumber(mfr)) {
			return false;
		} else {
			return true;
		}
	}
	public static boolean containsNumber(String textToCheck) {
		Pattern textPattern = Pattern.compile("(.)*\\\\d(.)*");
		return textPattern.matcher(textToCheck).matches();
	}
}
