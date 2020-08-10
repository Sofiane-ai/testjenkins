package fr.seedle.testjenkins;

public class MembreDao {
	public static Membre getMembre() {
		Membre membre = new Membre();
		membre.setPrenom("Sofiane");
		membre.setNom("F");
		return membre; 
	}
}
