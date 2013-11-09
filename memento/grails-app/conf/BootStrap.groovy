import ar.edu.unlam.Objetivo
import ar.edu.unlam.Paso

class BootStrap {
	
	
    def init = { servletContext ->
		
		 new Objetivo( titulo: "Leer Un Libro"
			,descripcion: "Leer Un Libro" ,categoria: "Leer Un Libro", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		 new Objetivo( titulo: "Mirar una serie"
			,descripcion: "Mirar una serie" ,categoria: "Mirar una serie", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		new Objetivo( titulo: "Escribir un libro"
			,descripcion: "Escribir un libro" ,categoria: "Escribir un libro", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		new Objetivo( titulo: "Preparar un cuatrimestre"
			,descripcion: "Preparar un cuatrimestre" ,categoria: "Preparar un cuatrimestre", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		new Objetivo( titulo: "Correr 40KM"
			,descripcion: "Correr 40KM" ,categoria: "Correr 40KM", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		new Paso(idObjetivo: 1, titulo: "Pasos 1", objetivo: "Leer 50 páginas", estado: 1).save()
		
		new Paso(idObjetivo: 1, titulo: "Pasos 2", objetivo: "Leer 50 páginas", estado: 1).save()
		
		new Paso(idObjetivo: 1, titulo: "Pasos 3", objetivo: "Leer 50 páginas", estado: 1).save()
		
		new Paso(idObjetivo: 1, titulo: "Pasos 4", objetivo: "Leer 50 páginas", estado: 1).save()
		
		new Paso(idObjetivo: 1, titulo: "Pasos 5", objetivo: "Leer 50 páginas", estado: 1).save()
	}
	
	
	
	
	
}
