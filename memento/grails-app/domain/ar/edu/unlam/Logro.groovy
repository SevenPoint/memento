package ar.edu.unlam

class Logro {
	
	Integer idLogro
	String nombre
	String descripcion
	String categoria
	Integer idUsuario

    static constraints = {
		nombre blank:false,size:5..50
		descripcion blank:false,size:1..256
		categoria blank:false
		idUsuario blank:false
    }
}
