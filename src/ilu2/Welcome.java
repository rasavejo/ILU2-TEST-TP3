package ilu2;

import java.util.Objects;

public class Welcome {
	
	private static int index(String[] l, String elt) {
		for (int i=0;i<l.length;i++) if (Objects.equals(l[i], elt)) return i;
		return -1;
	}
	
	private static String affichage(String[] liste,int[] count) {
		
		StringBuilder chaine = new StringBuilder(),majuscule = new StringBuilder(),minuscule = new StringBuilder();
		String dernierMaj = "",dernierMin = "";

		boolean yodaMaj = false,yodaMin = false;
		
		for (int i = 0;i<liste.length; i++) {
			if (liste[i] != null) {
				if (Objects.equals(liste[i].toUpperCase(), liste[i])) {
					yodaMaj = yodaMaj ||("YODA".equals(liste[i]));
					majuscule.append(", " + (dernierMaj = liste[i]));
					if (count[i] > 1) majuscule.append(" (x" + count[i] + ")");
				}
				else {
					yodaMin = yodaMin || ("Yoda".equals(liste[i]));
					minuscule.append(", " + (dernierMin = liste[i].substring(0, 1).toUpperCase() + liste[i].substring(1)));
					if (count[i] > 1) minuscule.append(" (x" + count[i] + ")");
				}
			}
		}
		
		int decMaj = (!dernierMaj.isEmpty() && count[index(liste,dernierMaj)] > 1 ? 7 : 0);
		int decMin = (!dernierMin.isEmpty() && count[index(liste,dernierMin)] > 1 ? 7 : 0);
		
		
		if (!majuscule.isEmpty() && !Objects.equals(majuscule.toString().substring(0,dernierMaj.length() + 2), ", " + dernierMaj)) majuscule.replace(majuscule.length()-dernierMaj.length()-2-decMaj, majuscule.length()-dernierMaj.length()-decMaj, " AND ");
		if (!minuscule.isEmpty() && !Objects.equals(minuscule.toString().substring(0,dernierMin.length() + 2), ", " + dernierMin)) minuscule.replace(minuscule.length()-dernierMin.length()-2-decMin, minuscule.length()-dernierMin.length()-decMin, " and ");

		
		if (!minuscule.isEmpty()) {
			if (yodaMin)
				chaine.append(minuscule.substring(2) + ", Hello.");
			else
				chaine.append("Hello" + minuscule + ".");
				
		}
		
		if (!majuscule.isEmpty()) {
			if (!minuscule.isEmpty()) chaine.append(" AND ");
			if (yodaMaj)
				chaine.append(majuscule.substring(2) + ", HELLO !");
			else
				chaine.append("HELLO" + majuscule + " !");
		}
		return chaine.toString();
	}
	
	public static String welcome(String input) {
		if (input == null || input.trim().isEmpty()) return "Hello, my friend";
				
		String[] liste = input.split(",");
		
		int n = liste.length;
		
		String[] distinct = new String[n];
		int[] count = new int[n];
		
		for (int i = 0;i<n;i++) {
			liste[i] = liste[i].trim();
			if (!Objects.equals(liste[i].toUpperCase(), liste[i])) liste[i] = liste[i].substring(0, 1).toUpperCase() + liste[i].substring(1);
			int pos = index(distinct,liste[i]);
			if (pos == -1) {
				distinct[i] = liste[i];
				count[i] = 0;
				pos = i;
			}
			count[pos] += 1;
		}

		
		
		return affichage(distinct,count);
	}

}
