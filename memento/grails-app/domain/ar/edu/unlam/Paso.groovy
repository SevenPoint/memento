package ar.edu.unlam

class Paso {
	
	Long idObjetivo
	String titulo
	String objetivo
	Date fechaInicio
	Date fechaFin
	Date fechaRecordatorio
	String estado

    static constraints = {
		titulo blank:false,size:5..50
		objetivo blank:false,size:1..256
		idObjetivo blank:false
		estado blank:false
		fechaInicio nullable:true
		fechaFin nullable:true
		fechaRecordatorio nullable:true
    }
}
