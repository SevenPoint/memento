package ar.edu.unlam

import java.awt.List;

import javax.swing.text.View;

import ar.edu.unlam.Objetivo;

import org.springframework.ui.Model;

class ObjetivoController {

    def objetivos() { 
			
		
		 def tmp = new Objetivo().findAll()
		 
			
		
		
		 def map = [ tmp : tmp ]
		 render(view:"objetivo", model:map)
		
	}
}
