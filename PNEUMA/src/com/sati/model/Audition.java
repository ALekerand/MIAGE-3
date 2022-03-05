package com.sati.model;
// Generated 28 nov. 2021 � 14:09:32 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Audition generated by hbm2java
 */
@Entity
@Table(name = "audition", catalog = "pneuma_bd")
public class Audition implements java.io.Serializable {

	private int idAudition;
	private Personne personne;
	private Question question;
	private Reponse reponse;

	public Audition() {
	}

	public Audition(int idAudition, Personne personne, Question question, Reponse reponse) {
		this.idAudition = idAudition;
		this.personne = personne;
		this.question = question;
		this.reponse = reponse;
	}

	@Id
	@GenericGenerator(name="lekerand" , strategy="increment")
	@GeneratedValue(generator="lekerand")
	@Column(name = "ID_AUDITION", unique = true, nullable = false)
	public int getIdAudition() {
		return this.idAudition;
	}

	public void setIdAudition(int idAudition) {
		this.idAudition = idAudition;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERS", nullable = false)
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_QEST", nullable = false)
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_REP", nullable = false)
	public Reponse getReponse() {
		return this.reponse;
	}

	public void setReponse(Reponse reponse) {
		this.reponse = reponse;
	}

}
