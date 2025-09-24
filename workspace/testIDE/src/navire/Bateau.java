package navire;

import java.util.Arrays;

public class Bateau {
	private String nom;
	private int taille;
	private Element[] element;

	public Bateau(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}

	public String getNom() {
		return nom;
	}
	
	public void attaquer(int numElement) {
		element[numElement - 1].toucher();
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public String toString() {
		return "Bateau [nom=" + nom + ", taille=" + taille + ", element=" + Arrays.toString(element) + "]";
	}
}
