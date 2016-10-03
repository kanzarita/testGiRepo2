package com.esprit.afficheur.core;



import com.esprit.afficheur.afficheurs.AfficheurHtml;
import com.esprit.afficheur.core.Document;

public class Main {

	public static void main(String[] args) {
	
		
		Document document = new Document();
		document.setTitle("dotNet");
		document.setContent("blabala");
		
AfficheurHtml afficheur = new AfficheurHtml();
		afficheur.render(document);
	
		
	}

}
