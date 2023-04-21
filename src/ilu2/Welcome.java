package ilu2;

import java.util.Objects;

public class Welcome {
	
	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty()) return "Hello, my friend";
		
		
		StringBuilder chaine = new StringBuilder();
		
		String[] liste = input.split(",");
		

		if (Objects.equals(input, input.toUpperCase())) {
			chaine.append("HELLO, ");
			chaine.append(input);
			chaine.append(" !");
		}
		else {
			chaine.append("Hello, ");
			for (int i = 0; i < liste.length;i++) {
				chaine.append(liste[i].substring(0, 1).toUpperCase() + liste[i].substring(1));
				if (i<liste.length -1) chaine.append(", ");
			}
		}
		return chaine.toString();
	}

}
