package ar.edu.unlam

class Categoria {
	
	Integer idCategoria
	String nombre
	
	static constraints = {
		nombre blank:false, nullable: false
	}

}
