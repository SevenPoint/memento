package ar.edu.unlam


class ObjetivoController {

    def index() { 
			
		
		 def tmp = new Objetivo().findAll()
		
		 def map = [ tmp : tmp ]
		 render(view:"objetivo", model:map)
		
	}
	
	def crearObjetivo() {
		
		render(view:"crearobjetivo", model:"")
	}
	
	def guardarObjetivo() {
		
				def asd = new Objetivo(idobjetivo: 3, titulo: params.tituloObjetivo
			,descripcion: params.DescripcionObjetivo ,categoria: "Escribir un libro", idusuario: "Diegarcho"
				,cantPasos: Integer.parseInt(params.CantPasos), cantDias: 5,estado: "En Progreso").save()
				
				def tmp = new Objetivo().findAll()
				
				 def map = [ tmp : tmp ]
				 
				render(view:"objetivo", model:map)
	}
	
}
