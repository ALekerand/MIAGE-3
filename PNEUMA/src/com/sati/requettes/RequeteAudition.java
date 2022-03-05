package com.sati.requettes;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sati.model.Audition;
import com.sati.model.Personne;

@Transactional
@Component
public class RequeteAudition {
	
	@Autowired
	SessionFactory sessionFactory;

	public List recupAudionByPersonne(int idPersonne){
		String query = "SELECT * FROM `audition` WHERE `ID_PERS` ='"+idPersonne+"'";
		List list = getSessionFactory().getCurrentSession().createSQLQuery(query).addEntity(Audition.class).list();
		return  list;
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}

