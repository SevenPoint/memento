import ar.edu.unlam.Objetivo
import ar.edu.unlam.Paso
import ar.edu.unlam.Usuario
import ar.edu.unlam.SecUsuario
import ar.edu.unlam.ConsejosExpertos

class BootStrap {
	
	
    def init = { servletContext ->
		
		 new Objetivo( titulo: "Leer Un Libro"
			,descripcion: "Leer Un Libro" ,categoria: "Leer Un Libro", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "20").save()
				
		 new Objetivo( titulo: "Mirar una serie"
			,descripcion: "Mirar una serie" ,categoria: "Mirar una serie", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "20").save()
				
		new Objetivo( titulo: "Escribir un libro"
			,descripcion: "Escribir un libro" ,categoria: "Escribir un libro", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "20").save()
				
		new Objetivo( titulo: "Preparar un cuatrimestre"
			,descripcion: "Preparar un cuatrimestre" ,categoria: "Preparar un cuatrimestre", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "0").save()
				
		new Objetivo( titulo: "Correr 40KM"
			,descripcion: "Correr 40KM" ,categoria: "Correr 40KM", idusuario: "Diegarcho"
				,cantPasos: 5, cantDias: 5,estado: "0").save()

		new Objetivo( titulo: "Leer Un ALgO"
			,descripcion: "Leer Un ALgoooooo" ,categoria: "Leer Un Libro", idusuario: "Ezequiel"
				,cantPasos: 5, cantDias: 5,estado: "0").save()
						
		new Objetivo( titulo: "Leer Un ALgoooooo2"
			,descripcion: "Leer Un Libro" ,categoria: "Leer Un Libro", idusuario: "Ezequiel"
				,cantPasos: 5, cantDias: 5,estado: "0").save()
				
		new Usuario(idUsuario:'Ezequiel',nombre:'eze',apellido:'af',edad:24,sexo:'M',email:'eze.af@gmail.com').save()
		
		new SecUsuario(nombre:'Ezequiel',apellido:'Falleau',edad:22,sexo:'m',email:'ezequiel.falleau@gmail.com',username:'ezeaf',password:'eze',enabled:true,accountExpired:false,accountLocked:false,passwordExpired:false).save()
		
		new Paso(idObjetivo: 1,fechaInicio: new Date().parse("dd/MM/yyyy", '06/12/2013'),fechaFin: new Date().parse("dd/MM/yyyy", '07/12/2013'), titulo: "Pasos 1", objetivo: "Leer 50 páginas", estado: 1).save()
		
		new Paso(idObjetivo: 1,fechaInicio: new Date().parse("dd/MM/yyyy", '06/12/2013'),fechaFin: new Date().parse("dd/MM/yyyy", '07/12/2013'), titulo: "Pasos 2", objetivo: "Leer 50 páginas", estado: 2).save()
		
		new Paso(idObjetivo: 1,fechaInicio: new Date().parse("dd/MM/yyyy", '06/12/2013'),fechaFin: new Date().parse("dd/MM/yyyy", '07/12/2013'), titulo: "Pasos 3", objetivo: "Leer 50 páginas", estado: 2).save()
		
		new Paso(idObjetivo: 1,fechaInicio: new Date().parse("dd/MM/yyyy", '06/12/2013'),fechaFin: new Date().parse("dd/MM/yyyy", '07/12/2013'), titulo: "Pasos 4", objetivo: "Leer 50 páginas", estado: 2).save()
		
		new Paso(idObjetivo: 1,fechaInicio: new Date().parse("dd/MM/yyyy", '06/12/2013'),fechaFin: new Date().parse("dd/MM/yyyy", '08/12/2013'), titulo: "Pasos 5", objetivo: "Leer 50 páginas", estado: 2).save()
	
		new ConsejosExpertos( consejo:"Antes de correr, deberias hacerte una revision medica.",firma:"Dra. Marcela Gomez").save()
		
		new ConsejosExpertos(consejo:"Te recomiendo leer algo de tu interes, sino jamas terminaras",firma:"Lic. Angel Conde").save()
		
		new ConsejosExpertos(consejo:"Deberias intentar estudiar en tu tiempo libre, deja el facebook",firma:"Lic. Gustavo Angel").save()
		
		}
	
	
	
	
	
}
