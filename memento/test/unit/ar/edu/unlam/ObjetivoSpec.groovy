package ar.edu.unlam

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Objetivo)
class ObjetivoSpec{

	def objetivo = new Objetivo(titulo:"Hola Chicos",descripcion:"Esto es un test",categoria:"Test de Test");
	
    def setup() {
    }

    def cleanup() {
    }

    void testConstraintTitulo() {
		objetivo.titulo = "Tengo mas de muchos mas caracteres de lo permitido...." //Tengo mas de 50 caracteres 
		assert !objetivo.validate();
    }
	
	void testConstraintDescripcion(){
		objetivo.descripcion = ""
		assert !objetivo.validate()
	}
	
}
