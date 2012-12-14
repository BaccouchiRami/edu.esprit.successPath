package edu.esprit.successPath.services;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.successPath.persistence.Sos;

@Remote
public interface ManagmentServicesRemote {

	public void publishSos(Sos sos);

	public List<Sos> findAllSoss();
	public void deleteSos(Sos sos);
	public String identifyStudent(String login, String pwd);
}
