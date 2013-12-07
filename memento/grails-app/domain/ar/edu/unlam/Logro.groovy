package ar.edu.unlam

class Logro {
	
	
	String nombre
	String descripcion
	String categoria
	String idUsuario
	String imagenAsociada

    static constraints = {
		nombre blank:false,size:5..50
		descripcion blank:false,size:1..256
		categoria blank:false
		idUsuario blank:false
    }
}
