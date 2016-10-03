package com.esprit.afficheur.afficheurs;

import com.esprit.afficheur.core.Document;

public class AfficheurTxt {
	
	public void display(Document document){
		String template = "********\t %s *********\n content : \n %s";
		System.out.println(String.format(template, document.getTitle(),document.getContent()));
		
	
	}

}
