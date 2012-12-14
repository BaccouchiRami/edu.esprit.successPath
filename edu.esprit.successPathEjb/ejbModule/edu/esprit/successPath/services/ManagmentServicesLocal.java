package edu.esprit.successPath.services;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.successPath.persistence.Sos;
import edu.esprit.successPath.persistence.User;

@Local
public interface ManagmentServicesLocal {
	
	public void publishSos(Sos sos);

	public List<Sos> findAllSoss();
	public void deleteSos(Sos sos);
	public String identifyStudent(String login, String pwd);
	

}
