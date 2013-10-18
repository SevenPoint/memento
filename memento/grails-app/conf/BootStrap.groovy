import ar.edu.unlam.Objetivo

class BootStrap {
	
	
    def init = { servletContext ->
		
		5.times{
			 new Objetivo(idobjetivo: it,titulo: "titulo"+it
				,descripcion: "Objetivo{it}" ,categoria: "categoria{it}", idusuario: "{it}"
				,cantPasos: it, cantDias: it,estado: "Estado{it}").save()
			
		}
    }
}
