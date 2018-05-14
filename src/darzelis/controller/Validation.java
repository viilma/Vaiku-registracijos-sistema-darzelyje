package darzelis.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	private static final String VALID_CREDENTIALS_REGEX ="^[A-Za-z0-9.-]{5,16}$";
	private static final String VALID_EMAIL_ADDRESS_REGEX = "^[A-Za-z0-9._%+-]+@+[A-Za-z0-9.-]+[.]+[A-Za-z]{2,6}$";
	private static final String VALID_ID_REGEX ="^[0-9]{1,7}$";
	private static final String VALID_NAME_SURNAME_ADD_REGEX ="^[A-Za-z ąčęėįšųūžĄČĘĖĮŠŲŪŽ]{3,50}$";
	private static final String VALID_AK_REGEX = "^[0-9]{11}$";

	public static boolean isValidCredentials(String credentials){
		Pattern credentialsPattern = Pattern.compile(VALID_CREDENTIALS_REGEX);
		Matcher credentialsMatcher = credentialsPattern.matcher(credentials);
		return credentialsMatcher.find();
	}
	
	public static boolean isValidEmail(String email){
		Pattern emailPattern = Pattern.compile(VALID_EMAIL_ADDRESS_REGEX);
		Matcher emailMatcher = emailPattern.matcher(email);
		return emailMatcher.find();
	}
	
	public static boolean isValidId(String id){		
		Pattern idPattern = Pattern.compile(VALID_ID_REGEX);
		Matcher idMatcher = idPattern.matcher(id);
		return idMatcher.find();
	}
	
	public static boolean isValidNameSurnameForAdd(String name){
		Pattern namePattern = Pattern.compile(VALID_NAME_SURNAME_ADD_REGEX);
		Matcher nameMatcher = namePattern.matcher(name);
		return nameMatcher.find();
	}

	public static boolean isValidAk(String ak) {
		Pattern akPattern = Pattern.compile(VALID_AK_REGEX);
		Matcher akMatcher = akPattern.matcher(ak);
		return akMatcher.find();
	}


}
