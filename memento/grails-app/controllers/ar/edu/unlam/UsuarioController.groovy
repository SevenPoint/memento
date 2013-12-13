package ar.edu.unlam

class UsuarioController {

    def index() { 
		def tmp = new Objetivo().findAllWhere(idusuario: params.idusuario)
		def utmp = new Usuario().findAllWhere(params.nombre)
		def map = [ tmp : tmp , utmp : utmp]
		
		render(view:"perfil", model:map)
	}
	
	def guardarUsuario(){
		
		   def usuario =  new SecUsuario(idUsuario:params.Nombre,username:params.Nombre,password:params.password,
			nombre:params.Nombre,apellido:params.Nombre,edad:24,sexo:'M',email:params.email,
			enabled:true,accountExpired:false,accountLocked:false,passwordExpired:false).save()
			
			//Es temporal deberia ir a una pagina de se creo exitosamente.
			def tmp = new Objetivo().findAllWhere(idusuario: params.idusuario)
			def utmp = new Usuario().findAllWhere(params.nombre)
			def map = [ tmp : tmp , utmp : utmp]
			render(view:"perfil", model:map)
	}
}
