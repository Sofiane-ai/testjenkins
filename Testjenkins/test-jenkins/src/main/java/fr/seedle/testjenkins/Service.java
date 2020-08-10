package fr.seedle.testjenkins;

public class Service {
	private Membre membre;
	public Service() {
		membre= MembreDao.getMembre();
	}
	public Membre getMembre() {
		return membre;
	}
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
	@Override
	public String toString() {
		return "Ce service est desiné au [membre=" + membre + "]";
	}
	

}
