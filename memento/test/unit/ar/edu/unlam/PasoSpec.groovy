package ar.edu.unlam

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Paso)
class PasoSpec extends Specification {
	
	def paso = new Paso();
	

    def setup() {
    }

    def cleanup() {
    }

    void testContraintTitulo() {
		paso.titulo = ""
		assert !paso.validate()
    }
	
	void testContrainstFechaRecordatorio(){
	
		paso.fechaInicio = 15/02/2013
		paso.fechaFin = 19/02/2013
		paso.fechaRecordatorio = 20/02/2013
		assert !paso.validate()
	}
	
	void testConstrinstFechaFin(){
		paso.fechaInicio = 01/04/2013
		paso.fechaFin = 03/02/2013
		assert !paso.validate()
	}
	
}
