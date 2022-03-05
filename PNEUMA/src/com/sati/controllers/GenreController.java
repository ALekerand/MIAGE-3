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
import com.sati.service.Iservice;

/**
 * @author A.Lekerand
 *
 */
@Component
@Scope("session")
public class GenreController {
	@Autowired
	Iservice service;
	private Genre genre = new Genre();
	private List<Genre> listGenre = new ArrayList<Genre>();
	private Genre selectedGenre = new Genre();
	
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnAnnuler = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	
	
	
	
	//@PostConstruct
	public void initialiser() {
		btnModifier.setDisabled(true);
	}
	
	public void enregistrer() {
		service.addObject(genre);
		info("Eneregistrement éffectué avec succès!");
		annuler();
	}
	
	public void selectionnerLigne() {
		 genre = selectedGenre;
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
	 genre.setCodeGenre(0);
	 genre.setLibelleGenre(null);
	btnModifier.setDisabled(true);
	btnEnregistrer.setDisabled(false);
 }

 
 public void modifier() {
	 service.updateObject(genre);
	 annuler();
	 info("Modification effectué avec succés!");
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

public List<Genre> getListGenre() {
	listGenre = service.getObjects("Genre");
	return listGenre;
}

public Genre getSelectedGenre() {
	return selectedGenre;
}

public void setGenre(Genre genre) {
	this.genre = genre;
}


public void setListGenre(List<Genre> listGenre) {
	this.listGenre = listGenre;
}

public void setSelectedGenre(Genre selectedGenre) {
	this.selectedGenre = selectedGenre;
}

public Genre getGenre() {
	return genre;
}



	
}
