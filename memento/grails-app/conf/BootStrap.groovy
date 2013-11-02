import ar.edu.unlam.Objetivo
import ar.edu.unlam.Paso

class BootStrap {
	
	
    def init = { servletContext ->
		
		 new Objetivo(idobjetivo: 1, titulo: "Leer Un Libro"
			,descripcion: "Leer Un Libro" ,categoria: "Leer Un Libro", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		 new Objetivo(idobjetivo: 2, titulo: "Mirar una serie"
			,descripcion: "Mirar una serie" ,categoria: "Mirar una serie", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		new Objetivo(idobjetivo: 3, titulo: "Escribir un libro"
			,descripcion: "Escribir un libro" ,categoria: "Escribir un libro", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		new Objetivo(idobjetivo: 4, titulo: "Preparar un cuatrimestre"
			,descripcion: "Preparar un cuatrimestre" ,categoria: "Preparar un cuatrimestre", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		new Objetivo(idobjetivo: 5, titulo: "Correr 40KM"
			,descripcion: "Correr 40KM" ,categoria: "Correr 40KM", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
	}
	
	
	
	
	
}
