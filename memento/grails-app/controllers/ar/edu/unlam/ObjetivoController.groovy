package ar.edu.unlam

import org.grails.datastore.mapping.annotation.Id;


class ObjetivoController {

    def index() { 
			
		
		 def tmp = new Objetivo().findAll()
		
		 def map = [ tmp : tmp ]
		 render(view:"objetivo", model:map)
		
	}
	
	def crearObjetivo() {
		
		render(view:"crearobjetivo", model:"")
	}

	def VerDetallesObjetivo() {
		
		def objt = params.obj.toLong()
		
		def tem = new Paso().findAllWhere(idObjetivo : objt)
		def tmp = new Objetivo().findAll()
		def tmpobj = new Objetivo().findWhere(id : objt)
		def map = [ tmpp : tem , tmp :tmp , tmpo : tmpobj]
		render(view:"VerDetallesObjetivo", model:map)
	}
	
	def guardarObjetivo() {
		
				def asd = new Objetivo( titulo: params.tituloObjetivo
			,descripcion: params.DescripcionObjetivo ,categoria: "Escribir un libro", idusuario: "Diegarcho"
				,cantPasos: Integer.parseInt(params.CantPasos), cantDias: 5,estado: "En Progreso").save()
				
				def tmp = new Objetivo().findAll()
				
				 def map = [ tmp : tmp.last() ]
				 
				render(view:"Paso", model:map)
	}
	
	def guardarPaso() {
		
				def asd = new Paso(idObjetivo: params.idO, titulo: params.tituloPaso
			,objetivo: params.descripcionPaso ,estado: "2").save()
				
				def tmp = new Objetivo().findAll()
				
				 def map = [ tmp : tmp ]
				 
				render(view:"objetivo", model:map)
	}
	
	def finalizarPaso() {
		
		def idPaso = params.idO.toLong()
			
		def paso = new Paso().findWhere(id : idPaso)
		paso.estado = '1'
		paso.save()
		
				
				
				def tmp = new Objetivo().findAll()
				
				 def map = [ tmp : tmp ]
				 
				render(view:"objetivo", model:map)
	}
	
}
