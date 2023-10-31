package maven_java;

public class details {
	private static final String predefinedUsername = "Ram"; 
	private static final String predefinedID = "3025"; 
	public static boolean validate(String inputUsername, String inputPassword) { 
		return inputUsername.equals(predefinedUsername) && inputPassword.equals(predefinedID); 
	}


}

