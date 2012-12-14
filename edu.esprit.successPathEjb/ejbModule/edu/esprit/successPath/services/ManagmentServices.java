package edu.esprit.successPath.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.successPath.persistence.Sos;
import edu.esprit.successPath.persistence.Student;
import edu.esprit.successPath.persistence.User;

@Stateless
public class ManagmentServices implements ManagmentServicesRemote,
		ManagmentServicesLocal {
	@PersistenceContext
	EntityManager entityManager;

	public ManagmentServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void publishSos(Sos sos) {
		entityManager.persist(sos);

	}

	@Override
	public List<Sos> findAllSoss() {

		return entityManager.createQuery("select s from Sos s").getResultList();
	}

	@Override
	public void deleteSos(Sos sos) {
		entityManager.remove(entityManager.merge(sos));
		
	}

	@Override
	public String identifyStudent(String login, String pwd) {
		String result="" ;
		String jpql="select s from Student s where s.login=:param1 and s.pwd=:param2";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param1", login);
		query.setParameter("param2", pwd);
		try {
			Object object = query.getSingleResult();
			if (object instanceof Student)
			{
				result="OK";
				
				
			}
		} catch (Exception e) {
			 result="KO";
			
		}
		
		return result;
	}

}
