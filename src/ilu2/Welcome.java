package ilu2;

import java.util.Objects;

public class Welcome {
	
	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty()) return "Hello, my friend";
		StringBuilder chaine = new StringBuilder();
		if (Objects.equals(input, input.toUpperCase())) {
			chaine.append("HELLO, ");
			chaine.append(input);
			chaine.append(" !");
		}
		else {
			chaine.append("Hello, ");
			input = input.substring(0, 1).toUpperCase() + input.substring(1);
			chaine.append(input);
		}
		return chaine.toString();
	}

}
