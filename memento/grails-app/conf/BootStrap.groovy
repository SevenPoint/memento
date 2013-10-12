import ar.edu.unlam.Objetivo

class BootStrap {
	
	
    def init = { servletContext ->
		
		100.times{
			 new Objetivo(idobjetivo: "{it}",titulo: "titulo{it}"
				,descripcion: "Objetivo{it}" ,categoria: "categoria{it}", idusuario: "{it}"
				,cantPasos: "CantidadDePasos{it}", cantDias: "CantDias{it}",estado: "Estado{it}").save()
			
		}
    }
}
