package ar.edu.unlam

import java.awt.List;

import javax.swing.text.View;

import ar.edu.unlam.Objetivo;

import org.springframework.ui.Model;

class ObjetivoController {

    def objetivos() { 
			
		
		 def tmp = new Objetivo(idobjetivo: "1",titulo: "Objetivo 1"
			,descripcion: "Descripcion 1" ,categoria: "Categoria 1", idusuario: "1"
			,cantPasos: "Cantidad de Pasos 1", cantDias: "Cantidad de Dias 1",estado: "Estado 1")
		 
			
		
		
		 def map = [ tmp : tmp ]
		 render(view:"objetivo", model:map)
		
	}
}
