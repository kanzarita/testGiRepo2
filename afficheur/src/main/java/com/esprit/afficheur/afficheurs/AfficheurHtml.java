package com.esprit.afficheur.afficheurs;

import com.esprit.afficheur.core.Document;

public class AfficheurHtml {

	public void render(Document document){
		String template = "<HTML><HEAD><TITLE>%s</TITLE></HEAD><BODY>%s</BODY></HTML>";
		System.out.println(String.format(template, document.getTitle(),document.getContent()));
		
	}
	
	
}
