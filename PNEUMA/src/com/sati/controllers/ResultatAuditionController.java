/**
 * 
 */
package com.sati.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sati.dto.ObjetRecap;
import com.sati.model.Audition;
import com.sati.model.Genre;
import com.sati.model.Personne;
import com.sati.requettes.RequeteAudition;
import com.sati.requettes.RequetePersonne;
import com.sati.service.Iservice;

/**
 * @author A.Lekerand
 *
 */
@Component
@Scope("session")
public class ResultatAuditionController {
	@Autowired
	Iservice service;
	@Autowired
	RequetePersonne requetePersonne;
	@Autowired
	RequeteAudition requeteAudition;
	private String numeroPers;
	private Personne personne = new Personne();;
	private List<Audition> listAudition = new ArrayList<>();
	private List listObjetRecap = new ArrayList<>();
	
	
	
	public void rechercher() {
	// Recuper la prsonne par son numero
		personne = requetePersonne.recupPersonneByNum(numeroPers);
		System.out.println("==== Information sur la personne==== : "+personne.getIdPers());//Clean after
		if (personne != null ) {
			listAudition = requeteAudition.recupAudionByPersonne(personne.getIdPers());	
			chargerTableauDecision();
		}
	}
	
	
	public void annuler() {
		numeroPers = "";
		
		//Detruire l'objet personne et en creer un autre
		personne = null;
		personne = new Personne();
		
		//Vider la liste
		listAudition.clear();
		listObjetRecap.clear();
		
	}
	
	
	
	public void chargerTableauDecision() {
		System.out.println("==== Méthode de  Décision==== : ");//Clean after
		char tableauLettre[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q'};
		String tableauDon[] = {"Apôtre","Encouragement","Enseignant","Prophétie","Connaissance","Sagesse","Aide","Libéralité","Leadership","Miséricode","Foi","Discernement des esprits","Service","Miracle","Don de guérison","Langue","Interprètation langues"};
		int i;
		//int positionLigne = 0;
		int positionColonne = 1;
		
		
		for (i = 0; i < 17; i++) {
			System.out.println("==== Valeur de l'itération ==== : "+i);//Clean after
			
			/*
			 * if(positionLigne != 0) { positionLigne = positionLigne+1; }
			 */
			
			positionColonne = i;
			int totalLigne = 0;
			//Constitution de la ligne X
			ObjetRecap objetRecapLigneX = new ObjetRecap();
			objetRecapLigneX.setLettreLigne(tableauLettre[i]);
			
				//Colonne 1
			System.out.println("==== Ligne: "+i);//Clean after
			System.out.println("==== Colonne: "+positionColonne);//Clean after
			
			objetRecapLigneX.setAuditionC1(listAudition.get(positionColonne));
			totalLigne = totalLigne + listAudition.get(positionColonne).getReponse().getValeur();
			
			//Colonne 2
			positionColonne = positionColonne+17;
			
			System.out.println("==== Colonne: "+positionColonne);//Clean after
			objetRecapLigneX.setAuditionC2(listAudition.get(positionColonne));
			totalLigne = totalLigne + listAudition.get(positionColonne).getReponse().getValeur();
			
			//Colonne 3
			positionColonne = positionColonne+17;
			
			System.out.println("==== Colonne: "+positionColonne);//Clean after
			objetRecapLigneX.setAuditionC3(listAudition.get(positionColonne));
			totalLigne = totalLigne + listAudition.get(positionColonne).getReponse().getValeur();
			
			//Colonne 4
			positionColonne = positionColonne+17;
			
			System.out.println("==== Colonne: "+positionColonne);//Clean after
			objetRecapLigneX.setLettreLigne(tableauLettre[i]);
			objetRecapLigneX.setAuditionC4(listAudition.get(positionColonne));
			totalLigne = totalLigne + listAudition.get(positionColonne).getReponse().getValeur();
			
			//Colonne 5
			positionColonne = positionColonne+17;
			
			System.out.println("==== Colonne: "+positionColonne);//Clean after
			objetRecapLigneX.setAuditionC5(listAudition.get(positionColonne));
			totalLigne = totalLigne + listAudition.get(positionColonne).getReponse().getValeur();
			
			//Ajout du totat de la ligne et du libellé 
			objetRecapLigneX.setTotalLigne(totalLigne);
			objetRecapLigneX.setLibelleDon(tableauDon[i]);
			
			//Ajout des éléments dans la liste d'objetRecap
			listObjetRecap.add(objetRecapLigneX);
			
			//Passage à la ligne suivante;
			
			positionColonne = 0;
			
			System.out.println("==== Fin ligne ==== : "+i);//Clean after
			
		}
		
		
	}
	
	
	public void info(String monMessage) {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", monMessage));
	    }
	
	 public void error() {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Contact admin."));
	    }
	 
	public String getNumeroPers() {
		return numeroPers;
	}
	
	public void setNumeroPers(String numeroPers) {
		this.numeroPers = numeroPers;
	}
	
	public List getListAudition() {
		return listAudition;
	}
	
	public void setListAudition(List listAudition) {
		this.listAudition = listAudition;
	}



	public List getListObjetRecap() {
		return listObjetRecap;
	}


	public void setListObjetRecap(List listObjetRecap) {
		this.listObjetRecap = listObjetRecap;
	}
	
	}
