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

import com.sati.model.Genre;
import com.sati.model.Reponse;
import com.sati.service.Iservice;

/**
 * @author A.Lekerand
 *
 */
@Component
@Scope("session")
public class ReponseController {
	@Autowired
	Iservice service;
	private Reponse reponse = new Reponse();
	private List<Reponse> listReponse = new ArrayList<Reponse>();
	private Reponse selectedReponse = new Reponse();
	
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnAnnuler = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	
	
	
	
	//@PostConstruct
	public void initialiser() {
		btnModifier.setDisabled(true);
	}
	
	public void enregistrer() {
		service.addObject(reponse);
		info("Eneregistrement �ffectu� avec succ�s!");
		annuler();
	}
	
	public void selectionnerLigne() {
		 reponse = selectedReponse;
		 btnEnregistrer.setDisabled(true);
		 btnModifier.setDisabled(false);
	}
	
	
	
	public void info(String monMessage) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", monMessage));
    }

 public void error() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Contact admin."));
    }
 
 public void annuler() {
	reponse.setNumeroRep(null);
	reponse.setLibelleRep(null);
	btnModifier.setDisabled(true);
	btnEnregistrer.setDisabled(false);
 }

 
 public void modifier() {
	 service.updateObject(reponse);
	 annuler();
	 info("Modification effectu� avec succ�s!");
 }
 
 
//SETTERS & GETTERS 
public Reponse getReponse() {
	return reponse;
}

public void setReponse(Reponse reponse) {
	this.reponse = reponse;
}

public List<Reponse> getListReponse() {
	listReponse = service.getObjects("Reponse");
	return listReponse;
}

public void setListReponse(List<Reponse> listReponse) {
	this.listReponse = listReponse;
}

public Reponse getSelectedReponse() {
	return selectedReponse;
}

public void setSelectedReponse(Reponse selectedReponse) {
	this.selectedReponse = selectedReponse;
}

public CommandButton getBtnEnregistrer() {
	return btnEnregistrer;
}

public void setBtnEnregistrer(CommandButton btnEnregistrer) {
	this.btnEnregistrer = btnEnregistrer;
}

public CommandButton getBtnAnnuler() {
	return btnAnnuler;
}

public void setBtnAnnuler(CommandButton btnAnnuler) {
	this.btnAnnuler = btnAnnuler;
}

public CommandButton getBtnModifier() {
	return btnModifier;
}

public void setBtnModifier(CommandButton btnModifier) {
	this.btnModifier = btnModifier;
}
 

}
