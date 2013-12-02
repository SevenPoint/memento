import ar.edu.unlam.Objetivo
import ar.edu.unlam.Paso
import ar.edu.unlam.Usuario
import ar.edu.unlam.SecUsuario

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

		new Objetivo( titulo: "Leer Un ALgO"
			,descripcion: "Leer Un ALgoooooo" ,categoria: "Leer Un Libro", idusuario: "Ezequiel"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
						
		new Objetivo( titulo: "Leer Un ALgoooooo2"
			,descripcion: "Leer Un Libro" ,categoria: "Leer Un Libro", idusuario: "Ezequiel"
				,cantPasos: 5, cantDias: 5,estado: "En Progreso").save()
				
		new Usuario(idUsuario:'Ezequiel',nombre:'eze',apellido:'af',edad:24,sexo:'M',email:'eze.af@gmail.com').save()
		
		new SecUsuario(nombre:'Ezequiel',apellido:'Falleau',edad:22,sexo:'m',email:'ezequiel.falleau@gmail.com',username:'ezeaf',password:'eze',enabled:true,accountExpired:false,accountLocked:false,passwordExpired:false).save()
		new Paso(idObjetivo: 1, titulo: "Pasos 1", objetivo: "Leer 50 p�ginas", estado: 1).save()
		
		new Paso(idObjetivo: 1, titulo: "Pasos 2", objetivo: "Leer 50 p�ginas", estado: 1).save()
		
		new Paso(idObjetivo: 1, titulo: "Pasos 3", objetivo: "Leer 50 p�ginas", estado: 1).save()
		
		new Paso(idObjetivo: 1, titulo: "Pasos 4", objetivo: "Leer 50 p�ginas", estado: 1).save()
		
		new Paso(idObjetivo: 1, titulo: "Pasos 5", objetivo: "Leer 50 p�ginas", estado: 1).save()
	}
	
	
	
	
	
}
