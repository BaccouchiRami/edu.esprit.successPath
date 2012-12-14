package edu.esprit.successPath.client.tests;

import javax.naming.Context;
import javax.naming.InitialContext;

import edu.esprit.successPath.persistence.Sos;
import edu.esprit.successPath.services.ManagmentServicesRemote;

public class TestPublishSos {

	public static void main(String[] args) {

		try {
			// JNDI = annuaire
			Context context = new InitialContext();
			ManagmentServicesRemote managmentServicesRemote = (ManagmentServicesRemote) context
					.lookup("edu.esprit.successPath/edu.esprit.successPathEjb/ManagmentServices!edu.esprit.successPath.services.ManagmentServicesRemote");

			Sos sos = new Sos(1, "sos description");

			managmentServicesRemote.publishSos(sos);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
