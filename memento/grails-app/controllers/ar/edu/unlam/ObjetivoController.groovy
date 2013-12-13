package ar.edu.unlam

import org.grails.datastore.mapping.annotation.Id;


class ObjetivoController {
	
	def springSecurityService
	
    def index() { 
		
		def usuario = springSecurityService.principal.username
		
		def tmp = new Objetivo().findAllWhere(idusuario: usuario)
		
		 def map = [ tmp : tmp , usuario : usuario]
		 render(view:"objetivo", model:map)
		
	}
	
	def crearObjetivo() {
		
		def usuario = springSecurityService.principal.username
		def map = [usuario : usuario]
		
		render(view:"crearobjetivo", model: map)
	}

	def VerDetallesObjetivo() {
		
		def usuario = springSecurityService.principal.username
		
		def objt = params.obj.toLong()
		
		def tem = new Paso().findAllWhere(idObjetivo : objt)
		def tmp = new Objetivo().findAll()
		def tmpobj = new Objetivo().findWhere(id : objt)
		
		
		def rand = new Random()
		
		def idConj = rand.nextInt(3).toLong()
		def conj = new ConsejosExpertos().findWhere(id : idConj )
		
		
		def map = [ tmpp : tem , tmp :tmp , tmpo : tmpobj, conj : conj, usuario : usuario]
		render(view:"VerDetallesObjetivo", model:map)
	}
	
	def guardarObjetivo() {
		
		def usuario = springSecurityService.principal.username
		
				def asd = new Objetivo( titulo: params.tituloObjetivo
			,descripcion: params.DescripcionObjetivo ,categoria: "Escribir un libro", idusuario: usuario
				,cantPasos: Integer.parseInt(params.CantPasos), cantDias: 5,estado: "0").save()
				
				def tmp = new Objetivo().findAll()
				
				 def map = [ tmp : tmp.last(), fechain : params.fecha_in ,  usuario : usuario ]
				 
				render(view:"Paso", model:map)
	}
	
	def guardarPaso() {
		
		Integer i =0;
		Integer cant = params.cantPasos.toInteger()
		Integer cantd = params.cantDias.toInteger()//deberia agregarse un input para cantidad de dias por pasos
		def idObj = params.idO.toLong()
		
		
		def d = new Date().parse("dd/MM/yyyy", params.fechain)
		Integer diasrest = (cantd/cant)
		def dIni = d ;
		def dFin;
		
		for(i=0;i<cant;i++){
			
			dFin = (dIni+diasrest)
			
			def aa = new Paso(idObjetivo: idObj,fechaFin:dFin,fechaInicio:dIni, titulo: params.tituloPaso.toString(), objetivo: params.descripcionPaso.toString(), estado: 2).save()
			
			dIni = dFin;
				
		}
				def tmp = new Objetivo().findAll()
				
				 def map = [ tmp : tmp ,  usuario : usuario]
				 
				render(view:"objetivo", model:map)
	}
	
	def finalizarPaso() {
		
		
		def usuario = springSecurityService.principal.username
		
		def idPaso = params.idO.toLong()
			
		def paso = new Paso().findWhere(id : idPaso)
		paso.estado = '1'
		paso.save()
		
		
		
		def obj = new Objetivo().findWhere(id : paso.idObjetivo) 
		def cantPasos = obj.cantPasos.toInteger()
		def est = obj.estado.toInteger()	 
		obj.estado = (est + (100/cantPasos)).toString(); 
		obj.save()
		
		
		def logroPaso  = new Logro();
		def logr = 0;
		def logroObj = new Logro();
		//Logros paso
		def objetivos = new Objetivo().findAllWhere(idusuario : usuario)
		
		def aa = Paso.createCriteria()
		def ae = aa {
			'in' ("idObjetivo",objetivos.id)
			and {
					eq("estado","1")
				}
			}
		
		def cantPa = ae.size()+1;
		
		switch (true)
		{
			case (cantPa ==1):
				logroPaso.nombre = "Primer Paso"
				logroPaso.descripcion = "Usted ha logrado exitmosamento su primer Paso"
				logroPaso.categoria = obj.categoria
				logroPaso.imagenAsociada = "medalla_bronce"
				logroPaso.idUsuario = usuario
				logroPaso.save()
				logr = 1
			break
			
			case (cantPa == 10):
			logroPaso.nombre = "Decimo Paso"
			logroPaso.descripcion = "Usted ha logrado exitmosamento su decimo Paso"
			logroPaso.categoria = obj.categoria
			logroPaso.imagenAsociada = "medalla_plata"
			logroPaso.idUsuario = usuario
			logroPaso.save()
			logr = 1
			break
			
			case(cantPa == 20):
			logroPaso.nombre = "Vigesimo Paso"
			logroPaso.descripcion = "Usted ha logrado exitmosamento su vigesimo Paso"
			logroPaso.categoria = obj.categoria
			logroPaso.imagenAsociada = "medalla_oro"
			logroPaso.idUsuario = usuario
			logroPaso.save()
			logr = 1
			break
			
			default:
			break
		}
		
		
		
		
		//Logros por cantidad de objetivos realizados
		def cantObjetivos = new Objetivo().findAllWhere(idusuario : usuario,estado : "100").size();
		
		if((est + (100/cantPasos)) == 100){
			cantObjetivos++
		}
		
		
		switch (true)
		{
			case (cantObjetivos ==1):
				logroObj.nombre = "Primer Objetivo"
				logroObj.descripcion = "Usted ha logrado exitmosamento su primer Objetivo"
				logroObj.categoria = obj.categoria
				logroObj.imagenAsociada = "copa_bronce"
				logroObj.idUsuario = usuario
				logroObj.save()
				logr = 1
			break
			
			case (cantObjetivos == 10):
			logroObj.nombre = "Decimo Objetivo"
			logroObj.descripcion = "Usted ha logrado exitmosamento su decimo Objetivo"
			logroObj.categoria = obj.categoria
			logroObj.imagenAsociada = "copa_plata"
			logroObj.idUsuario = usuario
			logroObj.save()
			logr = 1
			break
			
			case(cantObjetivos == 20):
			logroObj.nombre = "Vigesimo Objetivo"
			logroObj.descripcion = "Usted ha logrado exitmosamento su vigesimo Objetivo"
			logroObj.categoria = obj.categoria
			logroObj.imagenAsociada = "copa_oro"
			logroObj.idUsuario = usuario
			logroObj.save()
			logr = 1
			break
			
			default:
			break
		}	
				def tmp = new Objetivo().findAll()
				
				if(logr == 1)
				{
					
					def map = [ tmp : tmp , logroObj : logroObj, logroPaso : logroPaso , usuario : usuario]
					render(view:"../logro/ganaLogro", model:map)
					
					
				}
				else
				{
				def map = [ tmp : tmp ,  usuario : usuario ]
				render(view:"objetivo", model:map)
				}
	}
	
}
