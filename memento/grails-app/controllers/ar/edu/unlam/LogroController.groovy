package ar.edu.unlam

class LogroController {

    def index() { 
		
		def tmp = new Logro().findAllWhere(idUsuario: "Diegarcho")

		def tmpp = new Objetivo().findAll()
		
		
		 def map = [ tmp : tmp , tmpp : tmpp ]
		 render(view:"verLogro", model:map)
	}
}
