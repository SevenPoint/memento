package ar.edu.unlam

class Objetivo {

	Integer idobjetivo
	String titulo
	String descripcion
	String categoria
	String idusuario
	Integer cantPasos
	Integer cantDias //cambiar
	String estado
    
	static constraints = {
		titulo blank:false,size:5..50
		descripcion blank:false,size:1..256
		categoria blank:false
		idusuario blank:false
		cantPasos blank:false,minvalue:1,maxvalue:40
		
    }
}
