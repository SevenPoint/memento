package ar.edu.unlam

class UsuarioController {

    def index() { 
		def tmp = new Objetivo().findAllWhere(idusuario : "Ezequiel")
		def utmp = new Usuario().findWhere(nombre : "eze")
		def map = [ tmp : tmp , utmp : utmp]
		
		render(view:"perfil", model:map)
	}
}
