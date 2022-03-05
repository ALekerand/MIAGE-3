package com.sati.dto;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.SessionScoped;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sati.model.Audition;

@Component
@Scope("session")
public class ObjetRecap {
	private char lettreLigne;
	private Audition auditionC1 = new Audition();
	private Audition auditionC2 = new Audition();
	private Audition auditionC3 = new Audition();
	private Audition auditionC4 = new Audition();
	private Audition auditionC5 = new Audition();
	//private List listAudition = new ArrayList<>();
	private int totalLigne;
	private String libelleDon;
	
	
	//Accesseur mutateur
	public char getLettreLigne() {
		return lettreLigne;
	}
	public void setLettreLigne(char lettreLigne) {
		this.lettreLigne = lettreLigne;
	}
	
	public int getTotalLigne() {
		return totalLigne;
	}
	public void setTotalLigne(int totalLigne) {
		this.totalLigne = totalLigne;
	}
	public String getLibelleDon() {
		return libelleDon;
	}
	public void setLibelleDon(String libelleDon) {
		this.libelleDon = libelleDon;
	}
	public Audition getAuditionC1() {
		return auditionC1;
	}
	public void setAuditionC1(Audition auditionC1) {
		this.auditionC1 = auditionC1;
	}
	public Audition getAuditionC2() {
		return auditionC2;
	}
	public void setAuditionC2(Audition auditionC2) {
		this.auditionC2 = auditionC2;
	}
	public Audition getAuditionC3() {
		return auditionC3;
	}
	public void setAuditionC3(Audition auditionC3) {
		this.auditionC3 = auditionC3;
	}
	public Audition getAuditionC4() {
		return auditionC4;
	}
	public void setAuditionC4(Audition auditionC4) {
		this.auditionC4 = auditionC4;
	}
	public Audition getAuditionC5() {
		return auditionC5;
	}
	public void setAuditionC5(Audition auditionC5) {
		this.auditionC5 = auditionC5;
	}
	
}
