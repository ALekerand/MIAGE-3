/**
 * 
 */
package com.sati.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.component.commandbutton.CommandButton;
import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sati.model.Audition;
import com.sati.model.Genre;
import com.sati.model.Personne;
import com.sati.model.Question;
import com.sati.model.Reponse;
import com.sati.requettes.RequetePersonne;
import com.sati.service.Iservice;

/**
 * @author A.Lekerand
 *
 */
@Component
@Scope("session")
public class AuditionController {
	
	
	@Autowired
	Iservice service;
	@Autowired
	RequetePersonne requetePersonne;
	
	//private Audition audition = new Audition();
	private List<Reponse> listeReponse = new  ArrayList<Reponse>();
	List<Reponse>	listeChoixReponse  = new ArrayList<Reponse>();
	List<Audition> listAudition = new ArrayList<Audition>();
	private boolean skip;
	private Personne personne = new Personne();
	private int idGenre;
	private List listeGenre = new ArrayList<>();
	private String mot = "Q ";
	private String numeroPersonne;
	
	private int idRep1,idRep2,idRep3,idRep4,idRep5,idRep6,idRep7,idRep8,idRep9,idRep10,idRep11,idRep12,idRep13,idRep14,
		    idRep15,idRep16,idRep17,idRep18,idRep19,idRep20,idRep21,idRep22,idRep23,idRep24,idRep25,idRep26,idRep27,idRep28,
	        idRep29,idRep30,idRep31,idRep32,idRep33,idRep34,idRep35,idRep36,idRep37,idRep38,idRep39,idRep40,idRep41,idRep42,
	        idRep43,idRep44,idRep45,idRep46,idRep47,idRep48,idRep49,idRep50,idRep51,idRep52,idRep53,idRep54,idRep55,idRep56,
	        idRep57,idRep58,idRep59,idRep60,idRep61,idRep62,idRep63,idRep64,idRep65,idRep66,idRep67,idRep68,idRep69,idRep70,
	idRep71,idRep72,idRep73,idRep74,idRep75,idRep76,idRep77,idRep78,idRep79,idRep80,idRep81,idRep82,idRep83,idRep84,idRep85;
	
	
	private Reponse proposition1 = new Reponse();
	private Reponse proposition2 = new Reponse();
	private Reponse proposition3 = new Reponse();
	private Reponse proposition4 = new Reponse();
	
	private Question question1  =new Question();
	private Question question2 =new Question();
	private Question question3 =new Question();
	private Question question4 =new Question();
	private Question question5 =new Question();
	private Question question6 =new Question();
	private Question question7 =new Question();
	private Question question8 =new Question();
	private Question question9 =new Question();
	private Question question10 =new Question();
	private Question question11 =new Question();
	private Question question12 =new Question();
	private Question question13 =new Question();
	private Question question14 =new Question();
	private Question question15 =new Question();
	private Question question16 =new Question();
	private Question question17 =new Question();
	private Question question18 =new Question();
	private Question question19 =new Question();
	private Question question20 =new Question();
	private Question question21 =new Question();
	private Question question22 =new Question();
	private Question question23 =new Question();
	private Question question24 =new Question();
	private Question question25 =new Question();
	private Question question26 =new Question();
	private Question question27 =new Question();
	private Question question28 =new Question();
	private Question question29 =new Question();
	private Question question30 =new Question();
	private Question question31 =new Question();
	private Question question32 =new Question();
	private Question question33 =new Question();
	private Question question34 =new Question();
	private Question question35 =new Question();
	private Question question36 =new Question();
	private Question question37 =new Question();
	private Question question38 =new Question();
	private Question question39 =new Question();
	private Question question40 =new Question();
	private Question question41 =new Question();
	private Question question42 =new Question();
	private Question question43 =new Question();
	private Question question44 =new Question();
	private Question question45 =new Question();
	private Question question46 =new Question();
	private Question question47 =new Question();
	private Question question48 =new Question();
	private Question question49 =new Question();
	private Question question50 =new Question();
	private Question question51 =new Question();
	private Question question52 =new Question();
	private Question question53 =new Question();
	private Question question54 =new Question();
	private Question question55 =new Question();
	private Question question56 =new Question();
	private Question question57 =new Question();
	private Question question58 =new Question();
	private Question question59 =new Question();
	private Question question60 =new Question();
	private Question question61 =new Question();
	private Question question62 =new Question();
	private Question question63 =new Question();
	private Question question64 =new Question();
	private Question question65 =new Question();
	private Question question66 =new Question();
	private Question question67 =new Question();
	private Question question68 =new Question();
	private Question question69 =new Question();
	private Question question70 =new Question();
	private Question question71 =new Question();
	private Question question72 =new Question();
	private Question question73 =new Question();
	private Question question74 =new Question();
	private Question question75 =new Question();
	private Question question76 =new Question();
	private Question question77 =new Question();
	private Question question78 =new Question();
	private Question question79 =new Question();
	private Question question80 =new Question();
	private Question question81 =new Question();
	private Question question82 =new Question();
	private Question question83 =new Question();
	private Question question84 =new Question();
	private Question question85 =new Question();
	
	
	private Reponse reponse1 = new Reponse();
	private Reponse reponse2 = new Reponse();
	private Reponse reponse3 = new Reponse();
	private Reponse reponse4 = new Reponse();
	private Reponse reponse5 = new Reponse();
	private Reponse reponse6 = new Reponse();
	private Reponse reponse7 = new Reponse();
	private Reponse reponse8 = new Reponse();
	private Reponse reponse9 = new Reponse();
	private Reponse reponse10 = new Reponse();
	private Reponse reponse11 = new Reponse();
	private Reponse reponse12 = new Reponse();
	private Reponse reponse13 = new Reponse();
	private Reponse reponse14 = new Reponse();
	private Reponse reponse15 = new Reponse();
	private Reponse reponse16 = new Reponse();
	private Reponse reponse17 = new Reponse();
	private Reponse reponse18 = new Reponse();
	private Reponse reponse19 = new Reponse();
	private Reponse reponse20 = new Reponse();
	private Reponse reponse21 = new Reponse();
	private Reponse reponse22 = new Reponse();
	private Reponse reponse23 = new Reponse();
	private Reponse reponse24 = new Reponse();
	private Reponse reponse25 = new Reponse();
	private Reponse reponse26 = new Reponse();
	private Reponse reponse27 = new Reponse();
	private Reponse reponse28 = new Reponse();
	private Reponse reponse29 = new Reponse();
	private Reponse reponse30 = new Reponse();
	private Reponse reponse31 = new Reponse();
	private Reponse reponse32 = new Reponse();
	private Reponse reponse33 = new Reponse();
	private Reponse reponse34 = new Reponse();
	private Reponse reponse35 = new Reponse();
	private Reponse reponse36 = new Reponse();
	private Reponse reponse37 = new Reponse();
	private Reponse reponse38 = new Reponse();
	private Reponse reponse39 = new Reponse();
	private Reponse reponse40 = new Reponse();
	private Reponse reponse41 = new Reponse();
	private Reponse reponse42 = new Reponse();
	private Reponse reponse43 = new Reponse();
	private Reponse reponse44 = new Reponse();
	private Reponse reponse45 = new Reponse();
	private Reponse reponse46 = new Reponse();
	private Reponse reponse47 = new Reponse();
	private Reponse reponse48 = new Reponse();
	private Reponse reponse49 = new Reponse();
	private Reponse reponse50 = new Reponse();
	private Reponse reponse51 = new Reponse();
	private Reponse reponse52 = new Reponse();
	private Reponse reponse53 = new Reponse();
	private Reponse reponse54 = new Reponse();
	private Reponse reponse55 = new Reponse();
	private Reponse reponse56 = new Reponse();
	private Reponse reponse57 = new Reponse();
	private Reponse reponse58 = new Reponse();
	private Reponse reponse59 = new Reponse();
	private Reponse reponse60 = new Reponse();
	private Reponse reponse61 = new Reponse();
	private Reponse reponse62 = new Reponse();
	private Reponse reponse63 = new Reponse();
	private Reponse reponse64 = new Reponse();
	private Reponse reponse65 = new Reponse();
	private Reponse reponse66 = new Reponse();
	private Reponse reponse67 = new Reponse();
	private Reponse reponse68 = new Reponse();
	private Reponse reponse69 = new Reponse();
	private Reponse reponse70 = new Reponse();
	private Reponse reponse71 = new Reponse();
	private Reponse reponse72 = new Reponse();
	private Reponse reponse73 = new Reponse();
	private Reponse reponse74 = new Reponse();
	private Reponse reponse75 = new Reponse();
	private Reponse reponse76 = new Reponse();
	private Reponse reponse77 = new Reponse();
	private Reponse reponse78 = new Reponse();
	private Reponse reponse79 = new Reponse();
	private Reponse reponse80 = new Reponse();
	private Reponse reponse81 = new Reponse();
	private Reponse reponse82 = new Reponse();
	private Reponse reponse83 = new Reponse();
	private Reponse reponse84 = new Reponse();
	private Reponse reponse85 = new Reponse();

	private List<Question> listQuestion = new ArrayList<>();

	private CommandButton btnEnregistrer = new CommandButton();
	private CommandButton btnAnnuler = new CommandButton();
	private CommandButton btnModifier = new CommandButton();
	
	@PostConstruct
	public void initialiser() {
		btnModifier.setDisabled(true);
		getListQuestion();
		chargerQuestion();
		genererNumeroPersonne();
	}
	
	
	public void genererNumeroPersonne() {
		numeroPersonne = "P"+service.getObjects("Personne").size();
	}
	
	
	public void chargerQuestion() {
		  
		  question1 = listQuestion.get(0);
		  question2 = listQuestion.get(1);
		  question3 = listQuestion.get(2);
		  question4 = listQuestion.get(3);
		  question5 = listQuestion.get(4); 
		  question6 = listQuestion.get(5); 
		  question7 = listQuestion.get(6);
		  question8 =listQuestion.get(7); 
		  question9 = listQuestion.get(8); 
		  question10 = listQuestion.get(9); 
		  question11 = listQuestion.get(10); 
		  question12 = listQuestion.get(11); 
		  question13 = listQuestion.get(12); 
		  question14 = listQuestion.get(13); 
		  question15 = listQuestion.get(14); 
		  question16 = listQuestion.get(15);
		  question17 = listQuestion.get(16); 
		  question18 = listQuestion.get(17); 
		  question19 = listQuestion.get(18); 
		  question20 = listQuestion.get(19);
		  question21 = listQuestion.get(20); 
		  question22 = listQuestion.get(21); 
		  question23 = listQuestion.get(22); 
		  question24 = listQuestion.get(23); 
		  question25 = listQuestion.get(24); 
		  question26 = listQuestion.get(25); 
		  question27 = listQuestion.get(26); 
		  question28 = listQuestion.get(27);
		  question29 = listQuestion.get(28);
		  question30 = listQuestion.get(29);
		  question31 = listQuestion.get(30);
		  question32 = listQuestion.get(31);
		  question33 = listQuestion.get(32);
		  question34 = listQuestion.get(33);
		  question35 = listQuestion.get(34);
		  question36 = listQuestion.get(35);
		  question37 = listQuestion.get(36);
		  question38 = listQuestion.get(37);
		  question39 = listQuestion.get(38);
		  question40 = listQuestion.get(39);
		  question41 = listQuestion.get(40);
		  question42 = listQuestion.get(41);
		  question43 = listQuestion.get(42);
		  question44 = listQuestion.get(43);
		  question45 = listQuestion.get(44);
		  question46 = listQuestion.get(45);
		  question47 = listQuestion.get(46);
		  question48 = listQuestion.get(47);
		  question49 = listQuestion.get(48);
		  question50 = listQuestion.get(49);
		  question51 = listQuestion.get(50);
		  question52 = listQuestion.get(51);
		  question53 = listQuestion.get(52);
		  question54 = listQuestion.get(53);
		  question55 = listQuestion.get(54);
		  question56 = listQuestion.get(55);
		  question57 = listQuestion.get(56);
		  question58 = listQuestion.get(57);
		  question59 = listQuestion.get(58);
		  question60 = listQuestion.get(59);
		  question61 = listQuestion.get(60);
		  question62 = listQuestion.get(61);
		  question63 = listQuestion.get(62);
		  question64 = listQuestion.get(63);
		  question65 = listQuestion.get(64);
		  question66 = listQuestion.get(65);
		  question67 = listQuestion.get(66);
		  question68 = listQuestion.get(67);
		  question69 = listQuestion.get(68);
		  question70 = listQuestion.get(69);
		  question71 = listQuestion.get(70);
		  question72 = listQuestion.get(71);
		  question73 = listQuestion.get(72);
		  question74 = listQuestion.get(73);
		  question75 = listQuestion.get(74);
		  question76 = listQuestion.get(75);
		  question77 = listQuestion.get(76);
		  question78 = listQuestion.get(77);
		  question79 = listQuestion.get(78);
		  question80 = listQuestion.get(79);
		  question81 = listQuestion.get(80);
		  question82 = listQuestion.get(81);
		  question83 = listQuestion.get(82);
		  question84 = listQuestion.get(83);
		  question85 = listQuestion.get(84);

	}
	
		
	
	public String onFlowProcess(FlowEvent event) {
        if (skip) {
            skip = false; //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
	
	public void chargerProposition() {
		proposition1 = listeReponse.get(0);
		proposition2 = listeReponse.get(1);
		proposition3 = listeReponse.get(2);
		proposition4 = listeReponse.get(3);
		
	}
	
	
	
	public void enregistrer() {
		
		//Charger les reponses choisies
	listeChoixReponse.add((Reponse) service.getObjectById(idRep1, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep2, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep3, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep4, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep5, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep6, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep7, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep8, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep9, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep10, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep11, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep12, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep13, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep14, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep15, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep16, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep17, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep18, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep19, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep20, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep21, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep22, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep23, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep24, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep25, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep26, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep27, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep28, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep29, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep30, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep31, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep32, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep33, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep34, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep35, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep36, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep37, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep38, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep39, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep40, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep41, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep42, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep43, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep44, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep45, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep46, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep47, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep48, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep49, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep50, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep51, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep52, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep53, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep54, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep55, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep56, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep57, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep58, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep59, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep60, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep61, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep62, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep63, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep64, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep65, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep66, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep67, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep68, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep69, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep70, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep71, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep72, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep73, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep74, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep75, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep76, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep77, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep78, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep79, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep80, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep81, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep82, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep83, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep84, "Reponse"));
	listeChoixReponse.add((Reponse) service.getObjectById(idRep85, "Reponse"));
	  
	//Constituer les objets audition à enregistrer
	
	for (int i = 0; i < 85; i++) {
		Audition audition = new Audition();
		audition.setPersonne(personne);
		audition.setQuestion(listQuestion.get(i));
		audition.setReponse(listeChoixReponse.get(i));
		listAudition.add(audition);
	}
	
	//Enregistrer la personne
	personne.setNumeroPers(numeroPersonne);
	personne.setGenre((Genre)service.getObjectById(idGenre, "Genre"));
	service.addObject(personne);

	

	
	//Ajout des audition en base de données
	for (Audition objAudition : listAudition) {
		service.addObject(objAudition);
	}	
	System.out.println("================= FIN METHODE D'ENREGISTREMENT ==================");
	
		//("Eneregistrement éffectué avec succès!");
		annuler();
	}
	
	
	
	
	public void info(String monMessage) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", monMessage));
    }

 public void error() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Contact admin."));
    }
 
 public void annuler() {
		/*
		 * genre.setCodeGenre(0); genre.setLibelleGenre(null);
		 */
	btnModifier.setDisabled(true);
	btnEnregistrer.setDisabled(false);
 }

 
 public void modifier() {
	// service.updateObject(genre);
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



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
 * public Audition getAudition() { return audition; }
 * 
 * public void setAudition(Audition audition) { this.audition = audition; }
 */

public boolean isSkip() {
	return skip;
}

public void setSkip(boolean skip) {
	this.skip = skip;
}

public Personne getPersonne() {
	return personne;
}

public void setPersonne(Personne personne) {
	this.personne = personne;
}

public List<Question> getListQuestion() {
	listQuestion = service.getObjects("Question");
	return listQuestion;
}

public void setListQuestion(List<Question> listQuestion) {
	this.listQuestion = listQuestion;
}


public Question getQuestion1() {
	return question1;
}


public void setQuestion1(Question question1) {
	this.question1 = question1;
}


public Question getQuestion2() {
	return question2;
}


public void setQuestion2(Question question2) {
	this.question2 = question2;
}


public Question getQuestion3() {
	return question3;
}


public void setQuestion3(Question question3) {
	this.question3 = question3;
}


public Question getQuestion4() {
	return question4;
}


public void setQuestion4(Question question4) {
	this.question4 = question4;
}


public Question getQuestion5() {
	return question5;
}


public void setQuestion5(Question question5) {
	this.question5 = question5;
}


public Question getQuestion6() {
	return question6;
}


public void setQuestion6(Question question6) {
	this.question6 = question6;
}


public Question getQuestion7() {
	return question7;
}


public void setQuestion7(Question question7) {
	this.question7 = question7;
}


public Question getQuestion8() {
	return question8;
}


public void setQuestion8(Question question8) {
	this.question8 = question8;
}


public Question getQuestion9() {
	return question9;
}


public void setQuestion9(Question question9) {
	this.question9 = question9;
}


public Question getQuestion10() {
	return question10;
}


public void setQuestion10(Question question10) {
	this.question10 = question10;
}


public Question getQuestion11() {
	return question11;
}


public void setQuestion11(Question question11) {
	this.question11 = question11;
}


public Question getQuestion12() {
	return question12;
}


public void setQuestion12(Question question12) {
	this.question12 = question12;
}


public Question getQuestion13() {
	return question13;
}


public void setQuestion13(Question question13) {
	this.question13 = question13;
}


public Question getQuestion14() {
	return question14;
}


public void setQuestion14(Question question14) {
	this.question14 = question14;
}


public Question getQuestion15() {
	return question15;
}


public void setQuestion15(Question question15) {
	this.question15 = question15;
}


public Question getQuestion16() {
	return question16;
}


public void setQuestion16(Question question16) {
	this.question16 = question16;
}


public Question getQuestion17() {
	return question17;
}


public void setQuestion17(Question question17) {
	this.question17 = question17;
}


public Question getQuestion18() {
	return question18;
}


public void setQuestion18(Question question18) {
	this.question18 = question18;
}


public Question getQuestion19() {
	return question19;
}


public void setQuestion19(Question question19) {
	this.question19 = question19;
}


public Question getQuestion20() {
	return question20;
}


public void setQuestion20(Question question20) {
	this.question20 = question20;
}


public Question getQuestion21() {
	return question21;
}


public void setQuestion21(Question question21) {
	this.question21 = question21;
}


public Question getQuestion22() {
	return question22;
}


public void setQuestion22(Question question22) {
	this.question22 = question22;
}


public Question getQuestion23() {
	return question23;
}


public void setQuestion23(Question question23) {
	this.question23 = question23;
}


public Question getQuestion24() {
	return question24;
}


public void setQuestion24(Question question24) {
	this.question24 = question24;
}


public Question getQuestion25() {
	return question25;
}


public void setQuestion25(Question question25) {
	this.question25 = question25;
}


public Question getQuestion26() {
	return question26;
}


public void setQuestion26(Question question26) {
	this.question26 = question26;
}


public Question getQuestion27() {
	return question27;
}


public void setQuestion27(Question question27) {
	this.question27 = question27;
}


public Question getQuestion28() {
	return question28;
}


public void setQuestion28(Question question28) {
	this.question28 = question28;
}


public Question getQuestion29() {
	return question29;
}


public void setQuestion29(Question question29) {
	this.question29 = question29;
}


public Question getQuestion30() {
	return question30;
}


public void setQuestion30(Question question30) {
	this.question30 = question30;
}


public Question getQuestion31() {
	return question31;
}


public void setQuestion31(Question question31) {
	this.question31 = question31;
}


public Question getQuestion32() {
	return question32;
}


public void setQuestion32(Question question32) {
	this.question32 = question32;
}


public Question getQuestion33() {
	return question33;
}


public void setQuestion33(Question question33) {
	this.question33 = question33;
}


public Question getQuestion34() {
	return question34;
}


public void setQuestion34(Question question34) {
	this.question34 = question34;
}


public Question getQuestion35() {
	return question35;
}


public void setQuestion35(Question question35) {
	this.question35 = question35;
}


public Question getQuestion36() {
	return question36;
}


public void setQuestion36(Question question36) {
	this.question36 = question36;
}


public Question getQuestion37() {
	return question37;
}


public void setQuestion37(Question question37) {
	this.question37 = question37;
}


public Question getQuestion38() {
	return question38;
}


public void setQuestion38(Question question38) {
	this.question38 = question38;
}


public Question getQuestion39() {
	return question39;
}


public void setQuestion39(Question question39) {
	this.question39 = question39;
}


public Question getQuestion40() {
	return question40;
}


public void setQuestion40(Question question40) {
	this.question40 = question40;
}


public Question getQuestion41() {
	return question41;
}


public void setQuestion41(Question question41) {
	this.question41 = question41;
}


public Question getQuestion42() {
	return question42;
}


public void setQuestion42(Question question42) {
	this.question42 = question42;
}


public Question getQuestion43() {
	return question43;
}


public void setQuestion43(Question question43) {
	this.question43 = question43;
}


public Question getQuestion44() {
	return question44;
}


public void setQuestion44(Question question44) {
	this.question44 = question44;
}


public Question getQuestion45() {
	return question45;
}


public void setQuestion45(Question question45) {
	this.question45 = question45;
}


public Question getQuestion46() {
	return question46;
}


public void setQuestion46(Question question46) {
	this.question46 = question46;
}


public Question getQuestion47() {
	return question47;
}


public void setQuestion47(Question question47) {
	this.question47 = question47;
}


public Question getQuestion48() {
	return question48;
}


public void setQuestion48(Question question48) {
	this.question48 = question48;
}


public Question getQuestion49() {
	return question49;
}


public void setQuestion49(Question question49) {
	this.question49 = question49;
}


public Question getQuestion50() {
	return question50;
}


public void setQuestion50(Question question50) {
	this.question50 = question50;
}


public Question getQuestion51() {
	return question51;
}


public void setQuestion51(Question question51) {
	this.question51 = question51;
}


public Question getQuestion52() {
	return question52;
}


public void setQuestion52(Question question52) {
	this.question52 = question52;
}


public Question getQuestion53() {
	return question53;
}


public void setQuestion53(Question question53) {
	this.question53 = question53;
}


public Question getQuestion54() {
	return question54;
}


public void setQuestion54(Question question54) {
	this.question54 = question54;
}


public Question getQuestion55() {
	return question55;
}


public void setQuestion55(Question question55) {
	this.question55 = question55;
}


public Question getQuestion56() {
	return question56;
}


public void setQuestion56(Question question56) {
	this.question56 = question56;
}


public Question getQuestion57() {
	return question57;
}


public void setQuestion57(Question question57) {
	this.question57 = question57;
}


public Question getQuestion58() {
	return question58;
}


public void setQuestion58(Question question58) {
	this.question58 = question58;
}


public Question getQuestion59() {
	return question59;
}


public void setQuestion59(Question question59) {
	this.question59 = question59;
}


public Question getQuestion60() {
	return question60;
}


public void setQuestion60(Question question60) {
	this.question60 = question60;
}


public Question getQuestion61() {
	return question61;
}


public void setQuestion61(Question question61) {
	this.question61 = question61;
}


public Question getQuestion62() {
	return question62;
}


public void setQuestion62(Question question62) {
	this.question62 = question62;
}


public Question getQuestion63() {
	return question63;
}


public void setQuestion63(Question question63) {
	this.question63 = question63;
}


public Question getQuestion64() {
	return question64;
}


public void setQuestion64(Question question64) {
	this.question64 = question64;
}


public Question getQuestion65() {
	return question65;
}


public void setQuestion65(Question question65) {
	this.question65 = question65;
}


public Question getQuestion66() {
	return question66;
}


public void setQuestion66(Question question66) {
	this.question66 = question66;
}


public Question getQuestion67() {
	return question67;
}


public void setQuestion67(Question question67) {
	this.question67 = question67;
}


public Question getQuestion68() {
	return question68;
}


public void setQuestion68(Question question68) {
	this.question68 = question68;
}


public Question getQuestion69() {
	return question69;
}


public void setQuestion69(Question question69) {
	this.question69 = question69;
}


public Question getQuestion70() {
	return question70;
}


public void setQuestion70(Question question70) {
	this.question70 = question70;
}


public Question getQuestion71() {
	return question71;
}


public void setQuestion71(Question question71) {
	this.question71 = question71;
}


public Question getQuestion72() {
	return question72;
}


public void setQuestion72(Question question72) {
	this.question72 = question72;
}


public Question getQuestion73() {
	return question73;
}


public void setQuestion73(Question question73) {
	this.question73 = question73;
}


public Question getQuestion74() {
	return question74;
}


public void setQuestion74(Question question74) {
	this.question74 = question74;
}


public Question getQuestion75() {
	return question75;
}


public void setQuestion75(Question question75) {
	this.question75 = question75;
}


public Question getQuestion76() {
	return question76;
}


public void setQuestion76(Question question76) {
	this.question76 = question76;
}


public Question getQuestion77() {
	return question77;
}


public void setQuestion77(Question question77) {
	this.question77 = question77;
}


public Question getQuestion78() {
	return question78;
}


public void setQuestion78(Question question78) {
	this.question78 = question78;
}


public Question getQuestion79() {
	return question79;
}


public void setQuestion79(Question question79) {
	this.question79 = question79;
}


public Question getQuestion80() {
	return question80;
}


public void setQuestion80(Question question80) {
	this.question80 = question80;
}


public Question getQuestion81() {
	return question81;
}


public void setQuestion81(Question question81) {
	this.question81 = question81;
}


public Question getQuestion82() {
	return question82;
}


public void setQuestion82(Question question82) {
	this.question82 = question82;
}


public Question getQuestion83() {
	return question83;
}


public void setQuestion83(Question question83) {
	this.question83 = question83;
}


public Question getQuestion84() {
	return question84;
}


public void setQuestion84(Question question84) {
	this.question84 = question84;
}


public Question getQuestion85() {
	return question85;
}


public void setQuestion85(Question question85) {
	this.question85 = question85;
}


public Reponse getReponse1() {
	return reponse1;
}


public void setReponse1(Reponse reponse1) {
	this.reponse1 = reponse1;
}





public Reponse getReponse2() {
	return reponse2;
}


public void setReponse2(Reponse reponse2) {
	this.reponse2 = reponse2;
}


public Reponse getReponse3() {
	return reponse3;
}


public void setReponse3(Reponse reponse3) {
	this.reponse3 = reponse3;
}


public Reponse getReponse4() {
	return reponse4;
}


public void setReponse4(Reponse reponse4) {
	this.reponse4 = reponse4;
}


public Reponse getReponse5() {
	return reponse5;
}


public void setReponse5(Reponse reponse5) {
	this.reponse5 = reponse5;
}


public Reponse getReponse6() {
	return reponse6;
}


public void setReponse6(Reponse reponse6) {
	this.reponse6 = reponse6;
}


public Reponse getReponse7() {
	return reponse7;
}


public void setReponse7(Reponse reponse7) {
	this.reponse7 = reponse7;
}


public Reponse getReponse8() {
	return reponse8;
}


public void setReponse8(Reponse reponse8) {
	this.reponse8 = reponse8;
}


public Reponse getReponse9() {
	return reponse9;
}


public void setReponse9(Reponse reponse9) {
	this.reponse9 = reponse9;
}


public Reponse getReponse10() {
	return reponse10;
}


public void setReponse10(Reponse reponse10) {
	this.reponse10 = reponse10;
}


public Reponse getReponse11() {
	return reponse11;
}


public void setReponse11(Reponse reponse11) {
	this.reponse11 = reponse11;
}


public Reponse getReponse12() {
	return reponse12;
}


public void setReponse12(Reponse reponse12) {
	this.reponse12 = reponse12;
}


public Reponse getReponse13() {
	return reponse13;
}


public void setReponse13(Reponse reponse13) {
	this.reponse13 = reponse13;
}


public Reponse getReponse14() {
	return reponse14;
}


public void setReponse14(Reponse reponse14) {
	this.reponse14 = reponse14;
}


public Reponse getReponse15() {
	return reponse15;
}


public void setReponse15(Reponse reponse15) {
	this.reponse15 = reponse15;
}


public Reponse getReponse16() {
	return reponse16;
}


public void setReponse16(Reponse reponse16) {
	this.reponse16 = reponse16;
}


public Reponse getReponse17() {
	return reponse17;
}


public void setReponse17(Reponse reponse17) {
	this.reponse17 = reponse17;
}


public Reponse getReponse18() {
	return reponse18;
}


public void setReponse18(Reponse reponse18) {
	this.reponse18 = reponse18;
}


public Reponse getReponse19() {
	return reponse19;
}


public void setReponse19(Reponse reponse19) {
	this.reponse19 = reponse19;
}


public Reponse getReponse20() {
	return reponse20;
}


public void setReponse20(Reponse reponse20) {
	this.reponse20 = reponse20;
}


public Reponse getReponse21() {
	return reponse21;
}


public void setReponse21(Reponse reponse21) {
	this.reponse21 = reponse21;
}


public Reponse getReponse22() {
	return reponse22;
}


public void setReponse22(Reponse reponse22) {
	this.reponse22 = reponse22;
}


public Reponse getReponse23() {
	return reponse23;
}


public void setReponse23(Reponse reponse23) {
	this.reponse23 = reponse23;
}


public Reponse getReponse24() {
	return reponse24;
}


public void setReponse24(Reponse reponse24) {
	this.reponse24 = reponse24;
}


public Reponse getReponse25() {
	return reponse25;
}


public void setReponse25(Reponse reponse25) {
	this.reponse25 = reponse25;
}


public Reponse getReponse26() {
	return reponse26;
}


public void setReponse26(Reponse reponse26) {
	this.reponse26 = reponse26;
}


public Reponse getReponse27() {
	return reponse27;
}


public void setReponse27(Reponse reponse27) {
	this.reponse27 = reponse27;
}


public Reponse getReponse28() {
	return reponse28;
}


public void setReponse28(Reponse reponse28) {
	this.reponse28 = reponse28;
}


public Reponse getReponse29() {
	return reponse29;
}


public void setReponse29(Reponse reponse29) {
	this.reponse29 = reponse29;
}


public Reponse getReponse30() {
	return reponse30;
}


public void setReponse30(Reponse reponse30) {
	this.reponse30 = reponse30;
}


public Reponse getReponse31() {
	return reponse31;
}


public void setReponse31(Reponse reponse31) {
	this.reponse31 = reponse31;
}


public Reponse getReponse32() {
	return reponse32;
}


public void setReponse32(Reponse reponse32) {
	this.reponse32 = reponse32;
}


public Reponse getReponse33() {
	return reponse33;
}


public void setReponse33(Reponse reponse33) {
	this.reponse33 = reponse33;
}


public Reponse getReponse34() {
	return reponse34;
}


public void setReponse34(Reponse reponse34) {
	this.reponse34 = reponse34;
}


public Reponse getReponse35() {
	return reponse35;
}


public void setReponse35(Reponse reponse35) {
	this.reponse35 = reponse35;
}


public Reponse getReponse36() {
	return reponse36;
}


public void setReponse36(Reponse reponse36) {
	this.reponse36 = reponse36;
}


public Reponse getReponse37() {
	return reponse37;
}


public void setReponse37(Reponse reponse37) {
	this.reponse37 = reponse37;
}


public Reponse getReponse38() {
	return reponse38;
}


public void setReponse38(Reponse reponse38) {
	this.reponse38 = reponse38;
}


public Reponse getReponse39() {
	return reponse39;
}


public void setReponse39(Reponse reponse39) {
	this.reponse39 = reponse39;
}


public Reponse getReponse40() {
	return reponse40;
}


public void setReponse40(Reponse reponse40) {
	this.reponse40 = reponse40;
}


public Reponse getReponse41() {
	return reponse41;
}


public void setReponse41(Reponse reponse41) {
	this.reponse41 = reponse41;
}


public Reponse getReponse42() {
	return reponse42;
}


public void setReponse42(Reponse reponse42) {
	this.reponse42 = reponse42;
}


public Reponse getReponse43() {
	return reponse43;
}


public void setReponse43(Reponse reponse43) {
	this.reponse43 = reponse43;
}


public Reponse getReponse44() {
	return reponse44;
}


public void setReponse44(Reponse reponse44) {
	this.reponse44 = reponse44;
}


public Reponse getReponse45() {
	return reponse45;
}


public void setReponse45(Reponse reponse45) {
	this.reponse45 = reponse45;
}


public Reponse getReponse46() {
	return reponse46;
}


public void setReponse46(Reponse reponse46) {
	this.reponse46 = reponse46;
}


public Reponse getReponse47() {
	return reponse47;
}


public void setReponse47(Reponse reponse47) {
	this.reponse47 = reponse47;
}


public Reponse getReponse48() {
	return reponse48;
}


public void setReponse48(Reponse reponse48) {
	this.reponse48 = reponse48;
}


public Reponse getReponse49() {
	return reponse49;
}


public void setReponse49(Reponse reponse49) {
	this.reponse49 = reponse49;
}


public Reponse getReponse50() {
	return reponse50;
}


public void setReponse50(Reponse reponse50) {
	this.reponse50 = reponse50;
}


public Reponse getReponse51() {
	return reponse51;
}


public void setReponse51(Reponse reponse51) {
	this.reponse51 = reponse51;
}


public Reponse getReponse52() {
	return reponse52;
}


public void setReponse52(Reponse reponse52) {
	this.reponse52 = reponse52;
}


public Reponse getReponse53() {
	return reponse53;
}


public void setReponse53(Reponse reponse53) {
	this.reponse53 = reponse53;
}


public Reponse getReponse54() {
	return reponse54;
}


public void setReponse54(Reponse reponse54) {
	this.reponse54 = reponse54;
}


public Reponse getReponse55() {
	return reponse55;
}


public void setReponse55(Reponse reponse55) {
	this.reponse55 = reponse55;
}


public Reponse getReponse56() {
	return reponse56;
}


public void setReponse56(Reponse reponse56) {
	this.reponse56 = reponse56;
}


public Reponse getReponse57() {
	return reponse57;
}


public void setReponse57(Reponse reponse57) {
	this.reponse57 = reponse57;
}


public Reponse getReponse58() {
	return reponse58;
}


public void setReponse58(Reponse reponse58) {
	this.reponse58 = reponse58;
}


public Reponse getReponse59() {
	return reponse59;
}


public void setReponse59(Reponse reponse59) {
	this.reponse59 = reponse59;
}


public Reponse getReponse60() {
	return reponse60;
}


public void setReponse60(Reponse reponse60) {
	this.reponse60 = reponse60;
}


public Reponse getReponse61() {
	return reponse61;
}


public void setReponse61(Reponse reponse61) {
	this.reponse61 = reponse61;
}


public Reponse getReponse62() {
	return reponse62;
}


public void setReponse62(Reponse reponse62) {
	this.reponse62 = reponse62;
}


public Reponse getReponse63() {
	return reponse63;
}


public void setReponse63(Reponse reponse63) {
	this.reponse63 = reponse63;
}


public Reponse getReponse64() {
	return reponse64;
}


public void setReponse64(Reponse reponse64) {
	this.reponse64 = reponse64;
}


public Reponse getReponse65() {
	return reponse65;
}


public void setReponse65(Reponse reponse65) {
	this.reponse65 = reponse65;
}


public Reponse getReponse66() {
	return reponse66;
}


public void setReponse66(Reponse reponse66) {
	this.reponse66 = reponse66;
}


public Reponse getReponse67() {
	return reponse67;
}


public void setReponse67(Reponse reponse67) {
	this.reponse67 = reponse67;
}


public Reponse getReponse68() {
	return reponse68;
}


public void setReponse68(Reponse reponse68) {
	this.reponse68 = reponse68;
}


public Reponse getReponse69() {
	return reponse69;
}


public void setReponse69(Reponse reponse69) {
	this.reponse69 = reponse69;
}


public Reponse getReponse70() {
	return reponse70;
}


public void setReponse70(Reponse reponse70) {
	this.reponse70 = reponse70;
}


public Reponse getReponse71() {
	return reponse71;
}


public void setReponse71(Reponse reponse71) {
	this.reponse71 = reponse71;
}


public Reponse getReponse72() {
	return reponse72;
}


public void setReponse72(Reponse reponse72) {
	this.reponse72 = reponse72;
}


public Reponse getReponse73() {
	return reponse73;
}


public void setReponse73(Reponse reponse73) {
	this.reponse73 = reponse73;
}


public Reponse getReponse74() {
	return reponse74;
}


public void setReponse74(Reponse reponse74) {
	this.reponse74 = reponse74;
}


public Reponse getReponse75() {
	return reponse75;
}


public void setReponse75(Reponse reponse75) {
	this.reponse75 = reponse75;
}


public Reponse getReponse76() {
	return reponse76;
}


public void setReponse76(Reponse reponse76) {
	this.reponse76 = reponse76;
}


public Reponse getReponse77() {
	return reponse77;
}


public void setReponse77(Reponse reponse77) {
	this.reponse77 = reponse77;
}


public Reponse getReponse78() {
	return reponse78;
}


public void setReponse78(Reponse reponse78) {
	this.reponse78 = reponse78;
}


public Reponse getReponse79() {
	return reponse79;
}


public void setReponse79(Reponse reponse79) {
	this.reponse79 = reponse79;
}


public Reponse getReponse80() {
	return reponse80;
}



public Reponse getReponse81() {
	return reponse81;
}


public void setReponse81(Reponse reponse81) {
	this.reponse81 = reponse81;
}


public Reponse getReponse82() {
	return reponse82;
}


public void setReponse82(Reponse reponse82) {
	this.reponse82 = reponse82;
}


public Reponse getReponse83() {
	return reponse83;
}


public void setReponse83(Reponse reponse83) {
	this.reponse83 = reponse83;
}


public Reponse getReponse84() {
	return reponse84;
}


public void setReponse84(Reponse reponse84) {
	this.reponse84 = reponse84;
}


public Reponse getReponse85() {
	return reponse85;
}


public void setReponse85(Reponse reponse85) {
	this.reponse85 = reponse85;
}


public void setReponse80(Reponse reponse80) {
	this.reponse80 = reponse80;
}

public Reponse getProposition1() {
	return proposition1;
}


public void setProposition1(Reponse proposition1) {
	this.proposition1 = proposition1;
}


public Reponse getProposition2() {
	return proposition2;
}


public void setProposition2(Reponse proposition2) {
	this.proposition2 = proposition2;
}


public Reponse getProposition3() {
	return proposition3;
}


public void setProposition3(Reponse proposition3) {
	this.proposition3 = proposition3;
}


public Reponse getProposition4() {
	return proposition4;
}


public void setProposition4(Reponse proposition4) {
	this.proposition4 = proposition4;
}

public String getMot() {
	return mot;
}


public void setMot(String mot) {
	this.mot = mot;
}


public List<Reponse> getListeReponse() {
	listeReponse = service.getObjects("Reponse");
	return listeReponse;
}


public void setListeReponse(List<Reponse> listeReponse) {
	this.listeReponse = listeReponse;
}

public List getListeGenre() {
	listeGenre.clear();
	listeGenre = service.getObjects("Genre");
	return listeGenre;
}



public void setListeGenre(List listeGenre) {
	this.listeGenre = listeGenre;
}



public int getIdGenre() {
	return idGenre;
}



public void setIdGenre(int idGenre) {
	this.idGenre = idGenre;
}



public int getIdRep1() {
	return idRep1;
}



public void setIdRep1(int idRep1) {
	this.idRep1 = idRep1;
}



public int getIdRep2() {
	return idRep2;
}



public void setIdRep2(int idRep2) {
	this.idRep2 = idRep2;
}



public int getIdRep3() {
	return idRep3;
}



public void setIdRep3(int idRep3) {
	this.idRep3 = idRep3;
}



public int getIdRep4() {
	return idRep4;
}



public void setIdRep4(int idRep4) {
	this.idRep4 = idRep4;
}



public int getIdRep5() {
	return idRep5;
}



public void setIdRep5(int idRep5) {
	this.idRep5 = idRep5;
}



public int getIdRep6() {
	return idRep6;
}



public void setIdRep6(int idRep6) {
	this.idRep6 = idRep6;
}



public int getIdRep7() {
	return idRep7;
}



public void setIdRep7(int idRep7) {
	this.idRep7 = idRep7;
}



public int getIdRep8() {
	return idRep8;
}



public void setIdRep8(int idRep8) {
	this.idRep8 = idRep8;
}



public int getIdRep9() {
	return idRep9;
}



public void setIdRep9(int idRep9) {
	this.idRep9 = idRep9;
}



public int getIdRep10() {
	return idRep10;
}



public void setIdRep10(int idRep10) {
	this.idRep10 = idRep10;
}



public int getIdRep11() {
	return idRep11;
}



public void setIdRep11(int idRep11) {
	this.idRep11 = idRep11;
}



public int getIdRep12() {
	return idRep12;
}



public void setIdRep12(int idRep12) {
	this.idRep12 = idRep12;
}



public int getIdRep13() {
	return idRep13;
}



public void setIdRep13(int idRep13) {
	this.idRep13 = idRep13;
}



public int getIdRep14() {
	return idRep14;
}



public void setIdRep14(int idRep14) {
	this.idRep14 = idRep14;
}

public int getIdRep15() {
	return idRep15;
}



public void setIdRep15(int idRep15) {
	this.idRep15 = idRep15;
}



public int getIdRep16() {
	return idRep16;
}



public void setIdRep16(int idRep16) {
	this.idRep16 = idRep16;
}



public int getIdRep17() {
	return idRep17;
}



public void setIdRep17(int idRep17) {
	this.idRep17 = idRep17;
}



public int getIdRep18() {
	return idRep18;
}



public void setIdRep18(int idRep18) {
	this.idRep18 = idRep18;
}



public int getIdRep19() {
	return idRep19;
}



public void setIdRep19(int idRep19) {
	this.idRep19 = idRep19;
}



public int getIdRep20() {
	return idRep20;
}



public void setIdRep20(int idRep20) {
	this.idRep20 = idRep20;
}



public int getIdRep21() {
	return idRep21;
}



public void setIdRep21(int idRep21) {
	this.idRep21 = idRep21;
}



public int getIdRep22() {
	return idRep22;
}



public void setIdRep22(int idRep22) {
	this.idRep22 = idRep22;
}



public int getIdRep23() {
	return idRep23;
}



public void setIdRep23(int idRep23) {
	this.idRep23 = idRep23;
}



public int getIdRep24() {
	return idRep24;
}



public void setIdRep24(int idRep24) {
	this.idRep24 = idRep24;
}



public int getIdRep25() {
	return idRep25;
}



public void setIdRep25(int idRep25) {
	this.idRep25 = idRep25;
}



public int getIdRep26() {
	return idRep26;
}



public void setIdRep26(int idRep26) {
	this.idRep26 = idRep26;
}



public int getIdRep27() {
	return idRep27;
}



public void setIdRep27(int idRep27) {
	this.idRep27 = idRep27;
}



public int getIdRep28() {
	return idRep28;
}



public void setIdRep28(int idRep28) {
	this.idRep28 = idRep28;
}



public int getIdRep29() {
	return idRep29;
}



public void setIdRep29(int idRep29) {
	this.idRep29 = idRep29;
}



public int getIdRep30() {
	return idRep30;
}



public void setIdRep30(int idRep30) {
	this.idRep30 = idRep30;
}



public int getIdRep31() {
	return idRep31;
}



public void setIdRep31(int idRep31) {
	this.idRep31 = idRep31;
}



public int getIdRep32() {
	return idRep32;
}



public void setIdRep32(int idRep32) {
	this.idRep32 = idRep32;
}



public int getIdRep33() {
	return idRep33;
}



public void setIdRep33(int idRep33) {
	this.idRep33 = idRep33;
}



public int getIdRep34() {
	return idRep34;
}



public void setIdRep34(int idRep34) {
	this.idRep34 = idRep34;
}



public int getIdRep35() {
	return idRep35;
}



public void setIdRep35(int idRep35) {
	this.idRep35 = idRep35;
}



public int getIdRep36() {
	return idRep36;
}



public void setIdRep36(int idRep36) {
	this.idRep36 = idRep36;
}



public int getIdRep37() {
	return idRep37;
}



public void setIdRep37(int idRep37) {
	this.idRep37 = idRep37;
}



public int getIdRep38() {
	return idRep38;
}



public void setIdRep38(int idRep38) {
	this.idRep38 = idRep38;
}



public int getIdRep39() {
	return idRep39;
}



public void setIdRep39(int idRep39) {
	this.idRep39 = idRep39;
}



public int getIdRep40() {
	return idRep40;
}



public void setIdRep40(int idRep40) {
	this.idRep40 = idRep40;
}



public int getIdRep41() {
	return idRep41;
}



public void setIdRep41(int idRep41) {
	this.idRep41 = idRep41;
}



public int getIdRep42() {
	return idRep42;
}



public void setIdRep42(int idRep42) {
	this.idRep42 = idRep42;
}



public int getIdRep43() {
	return idRep43;
}



public void setIdRep43(int idRep43) {
	this.idRep43 = idRep43;
}



public int getIdRep44() {
	return idRep44;
}



public void setIdRep44(int idRep44) {
	this.idRep44 = idRep44;
}



public int getIdRep45() {
	return idRep45;
}



public void setIdRep45(int idRep45) {
	this.idRep45 = idRep45;
}



public int getIdRep46() {
	return idRep46;
}



public void setIdRep46(int idRep46) {
	this.idRep46 = idRep46;
}



public int getIdRep47() {
	return idRep47;
}



public void setIdRep47(int idRep47) {
	this.idRep47 = idRep47;
}



public int getIdRep48() {
	return idRep48;
}



public void setIdRep48(int idRep48) {
	this.idRep48 = idRep48;
}



public int getIdRep49() {
	return idRep49;
}



public void setIdRep49(int idRep49) {
	this.idRep49 = idRep49;
}



public int getIdRep50() {
	return idRep50;
}



public void setIdRep50(int idRep50) {
	this.idRep50 = idRep50;
}



public int getIdRep51() {
	return idRep51;
}



public void setIdRep51(int idRep51) {
	this.idRep51 = idRep51;
}



public int getIdRep52() {
	return idRep52;
}



public void setIdRep52(int idRep52) {
	this.idRep52 = idRep52;
}



public int getIdRep53() {
	return idRep53;
}



public void setIdRep53(int idRep53) {
	this.idRep53 = idRep53;
}



public int getIdRep54() {
	return idRep54;
}



public void setIdRep54(int idRep54) {
	this.idRep54 = idRep54;
}



public int getIdRep55() {
	return idRep55;
}



public void setIdRep55(int idRep55) {
	this.idRep55 = idRep55;
}



public int getIdRep56() {
	return idRep56;
}



public void setIdRep56(int idRep56) {
	this.idRep56 = idRep56;
}



public int getIdRep57() {
	return idRep57;
}



public void setIdRep57(int idRep57) {
	this.idRep57 = idRep57;
}



public int getIdRep58() {
	return idRep58;
}



public void setIdRep58(int idRep58) {
	this.idRep58 = idRep58;
}



public int getIdRep59() {
	return idRep59;
}



public void setIdRep59(int idRep59) {
	this.idRep59 = idRep59;
}



public int getIdRep60() {
	return idRep60;
}



public void setIdRep60(int idRep60) {
	this.idRep60 = idRep60;
}



public int getIdRep61() {
	return idRep61;
}



public void setIdRep61(int idRep61) {
	this.idRep61 = idRep61;
}



public int getIdRep62() {
	return idRep62;
}



public void setIdRep62(int idRep62) {
	this.idRep62 = idRep62;
}



public int getIdRep63() {
	return idRep63;
}



public void setIdRep63(int idRep63) {
	this.idRep63 = idRep63;
}



public int getIdRep64() {
	return idRep64;
}



public void setIdRep64(int idRep64) {
	this.idRep64 = idRep64;
}



public int getIdRep65() {
	return idRep65;
}



public void setIdRep65(int idRep65) {
	this.idRep65 = idRep65;
}



public int getIdRep66() {
	return idRep66;
}



public void setIdRep66(int idRep66) {
	this.idRep66 = idRep66;
}



public int getIdRep67() {
	return idRep67;
}



public void setIdRep67(int idRep67) {
	this.idRep67 = idRep67;
}



public int getIdRep68() {
	return idRep68;
}



public void setIdRep68(int idRep68) {
	this.idRep68 = idRep68;
}



public int getIdRep69() {
	return idRep69;
}



public void setIdRep69(int idRep69) {
	this.idRep69 = idRep69;
}



public int getIdRep70() {
	return idRep70;
}



public void setIdRep70(int idRep70) {
	this.idRep70 = idRep70;
}



public int getIdRep71() {
	return idRep71;
}



public void setIdRep71(int idRep71) {
	this.idRep71 = idRep71;
}



public int getIdRep72() {
	return idRep72;
}



public void setIdRep72(int idRep72) {
	this.idRep72 = idRep72;
}



public int getIdRep73() {
	return idRep73;
}



public void setIdRep73(int idRep73) {
	this.idRep73 = idRep73;
}



public int getIdRep74() {
	return idRep74;
}



public void setIdRep74(int idRep74) {
	this.idRep74 = idRep74;
}



public int getIdRep75() {
	return idRep75;
}



public void setIdRep75(int idRep75) {
	this.idRep75 = idRep75;
}



public int getIdRep76() {
	return idRep76;
}



public void setIdRep76(int idRep76) {
	this.idRep76 = idRep76;
}



public int getIdRep77() {
	return idRep77;
}



public void setIdRep77(int idRep77) {
	this.idRep77 = idRep77;
}



public int getIdRep78() {
	return idRep78;
}



public void setIdRep78(int idRep78) {
	this.idRep78 = idRep78;
}



public int getIdRep79() {
	return idRep79;
}



public void setIdRep79(int idRep79) {
	this.idRep79 = idRep79;
}



public int getIdRep80() {
	return idRep80;
}



public void setIdRep80(int idRep80) {
	this.idRep80 = idRep80;
}



public int getIdRep81() {
	return idRep81;
}



public void setIdRep81(int idRep81) {
	this.idRep81 = idRep81;
}



public int getIdRep82() {
	return idRep82;
}



public void setIdRep82(int idRep82) {
	this.idRep82 = idRep82;
}



public int getIdRep83() {
	return idRep83;
}



public void setIdRep83(int idRep83) {
	this.idRep83 = idRep83;
}



public int getIdRep84() {
	return idRep84;
}

public void setIdRep84(int idRep84) {
	this.idRep84 = idRep84;
}

public int getIdRep85() {
	return idRep85;
}

public void setIdRep85(int idRep85) {
	this.idRep85 = idRep85;
}

public List<Audition> getListAudition() {
	return listAudition;
}

public void setListAudition(List<Audition> listAudition) {
	this.listAudition = listAudition;
}

public List<Reponse> getListeChoixReponse() {
	return listeChoixReponse;
}

public void setListeChoixReponse(List<Reponse> listeChoixReponse) {
	this.listeChoixReponse = listeChoixReponse;
}

public String getNumeroPersonne() {
	return numeroPersonne;
}

public void setNumeroPersonne(String numeroPersonne) {
	this.numeroPersonne = numeroPersonne;
}

}
