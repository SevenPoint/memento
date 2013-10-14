package ar.edu.unlam

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Logro)
class LogroSpec extends Specification {
	
	def logro = new Logro()

    def setup() {
    }

    def cleanup() {
    }

    void testContraintTitulo() {
		logro.nombre = "Nombre OK"
		assert logro.validate()
    }
}
