package com.sati.requettes;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sati.model.Personne;

@Transactional
@Component
public class RequetePersonne {
	
	@Autowired
	SessionFactory sessionFactory;

	public Personne recupPersonneByNum(String numPersone){
		String query = "SELECT * FROM `personne` WHERE `NUMERO_PERS`='"+numPersone+"'";
		Personne personne = (Personne) getSessionFactory().getCurrentSession().createSQLQuery(query).addEntity(Personne.class).uniqueResult();
		return personne;
	}
	
	
	public int recupererNbrEnreg(){
		String query = "SELECT * FROM `personne`";
		List listPersonne = getSessionFactory().getCurrentSession().createSQLQuery(query).addEntity(Personne.class).list();
		return listPersonne.size();
	}
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}

