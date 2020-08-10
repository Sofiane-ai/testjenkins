package fr.seedle.testjenkins.test;

import org.junit.Test;

import fr.seedle.testjenkins.Service;

public class TestMembre {
	
	@Test
	public void execute() {
		Service service = new Service();
		if (service.getMembre().getNom() == null) {
			throw new RuntimeException("Impossible de poursuivre sans le nom du membre");
		}
	}

}
