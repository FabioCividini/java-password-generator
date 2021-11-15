package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		String firstNameUser = "Fabio";
		String lastNameUser = "Cividini";
		String favoriteColor = "Verde";
		
		int dayBirth = 22;
		int monthBirth = 3;
		int yearBirth = 1997;
		
		int sumBirth = dayBirth + monthBirth + yearBirth;
		
		String passwordUser = firstNameUser + "-" + lastNameUser + "-" + favoriteColor + "-" + sumBirth;
		System.out.println("La tua password è: " + passwordUser);
		
	}

}
