/**
 * 
 */
package com.sati.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sati.model.Question;
import com.sati.service.Iservice;

/**
 * @author A.Lekerand
 *
 */
@Component
@Scope("session")
public class QuestionController {
	@Autowired
	Iservice service;
	private Question question = new Question();
	private List<Question> listQuestion = new ArrayList<Question>();
	private Question selectedQuestion = new Question();
	
	
	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnAnnuler = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	
	
	@PostConstruct
	public void initialiser() {
		btnModifier.setDisabled(true);
	}
	
	public void enregistrer() {
		service.addObject(question);
		info("Eneregistrement éffectué avec succès!");
		annuler();
	}
	
	public void selectionnerLigne() {
		 question = selectedQuestion;
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
	 question.setCodeQuest(null);
	 question.setLibelleQuest(null);
	 question.setNumeroQuest(null);
	btnModifier.setDisabled(true);
	btnEnregistrer.setDisabled(false);
 }

 
 public void modifier() {
	 service.updateObject(question);
	 annuler();
	 info("Modification effectué avec succés!");
 }
 
 
 // GETTERS & SETTERS 
 public CommandButton getBtnEnregistrer() {
		return btnEnregistrer;
	}

public Question getQuestion() {
	return question;
}

public void setQuestion(Question question) {
	this.question = question;
}

public List<Question> getListQuestion() {
	listQuestion = service.getObjects("Question");
	return listQuestion;
}

public void setListQuestion(List<Question> listQuestion) {
	this.listQuestion = listQuestion;
}

public Question getSelectedQuestion() {
	return selectedQuestion;
}

public void setSelectedQuestion(Question selectedQuestion) {
	this.selectedQuestion = selectedQuestion;
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

public void setBtnEnregistrer(CommandButton btnEnregistrer) {
	this.btnEnregistrer = btnEnregistrer;
}
	
}
