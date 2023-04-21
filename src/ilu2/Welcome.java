package ilu2;

import java.util.Objects;

public class Welcome {
	
	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty()) return "Hello, my friend";
		
		
		StringBuilder chaine = new StringBuilder();
		StringBuilder minuscule = new StringBuilder();
		StringBuilder majuscule = new StringBuilder();
		
		String[] liste = input.split(",");
		
		
		for (int i = 0;i<liste.length; i++) {
			if (Objects.equals(liste[i].toUpperCase(), liste[i])) 
				majuscule.append(", " + liste[i]);
			else 
				minuscule.append(", " + liste[i].substring(0, 1).toUpperCase() + liste[i].substring(1));
		}
		
		if (!minuscule.isEmpty())
			chaine.append("Hello" + minuscule + ".");
		
		if (!majuscule.isEmpty()) {
			if (!minuscule.isEmpty()) chaine.append(" AND ");
			chaine.append("HELLO" + majuscule + " !");
		}
		
		
		return chaine.toString();
	}

}
