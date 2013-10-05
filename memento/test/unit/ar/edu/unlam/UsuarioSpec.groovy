package ar.edu.unlam

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */

/**ESTE TEST EXPLOTAAAAA***/
@TestFor(Usuario)
class UsuarioSpec extends GroovyTestCase {
	
	void testSomething(){
		def us = new Usuario(nombre:"marcos")
		assertEquals "sarasa", us.nombre
	}
	
}
