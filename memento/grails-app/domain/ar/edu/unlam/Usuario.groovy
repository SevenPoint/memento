package ar.edu.unlam

class Usuario extends SecUsuario{

	String idUsuario
	String nombre
	String apellido
	Integer edad
	String sexo
	String email
	
    static constraints = {
		nombre blank:false, nullable: false
		apellido blank:false, nullable: false
        edad min:18, max:90
		sexo blank:false
		email blank:false
    }
}
