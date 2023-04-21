package ilu2;

import java.util.Objects;

public class Welcome {
	
	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty()) return "Hello, my friend";
		
		
		StringBuilder chaine = new StringBuilder();
		StringBuilder minuscule = new StringBuilder();
		StringBuilder majuscule = new StringBuilder();
		
		String[] liste = input.split(",");
		
		int i;
		String dernierMaj = "",dernierMin = "";
		
		for (i = 0;i<liste.length; i++) {
			if (Objects.equals(liste[i].toUpperCase(), liste[i])) 
				majuscule.append(", " + (dernierMaj = liste[i]));
			else 
				minuscule.append(", " + (dernierMin = liste[i].substring(0, 1).toUpperCase() + liste[i].substring(1)));
		}
		

		if (!majuscule.isEmpty() && !Objects.equals(majuscule.toString(), ", " + dernierMaj)) majuscule.replace(majuscule.length()-dernierMaj.length()-2, majuscule.length()-dernierMaj.length(), " AND ");
		if (!minuscule.isEmpty() && !Objects.equals(minuscule.toString(), ", " + dernierMin)) minuscule.replace(minuscule.length()-dernierMin.length()-2, minuscule.length()-dernierMin.length(), " and ");

		
		if (!minuscule.isEmpty())
			chaine.append("Hello" + minuscule + ".");
		
		if (!majuscule.isEmpty()) {
			if (!minuscule.isEmpty()) chaine.append(" AND ");
			chaine.append("HELLO" + majuscule + " !");
		}
		
		
		return chaine.toString();
	}

}
