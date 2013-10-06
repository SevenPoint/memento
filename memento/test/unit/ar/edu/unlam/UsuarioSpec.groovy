package ar.edu.unlam

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */

/**ESTE TEST EXPLOTAAAAA***/
@TestFor(Usuario)
class UsuarioSpec {
	
	def user = new Usuario(nombre:"Jissus",apellido:"Tissera",edad:45,sexo:"m",email:"jisus@jisus.com");
	
	def setup(){
		
	}
	
	void testSomething(){
		def us = new Usuario(nombre:"marcos")
		assertEquals "marcos", us.nombre
	}
	void testConstraintNombre(){
		
		user.nombre = ""
		assert !user.validate()
		
	}
	
	void testConstraintEdad(){
		user.edad = 17;
		assert !user.validate()
		
	}
	
	void testConstraintSexo(){
		user.sexo = ""
		assert !user.validate()
		
	}
	void testConstraintEmail(){
		user.email = ""
		assert !user.validate()
		
	}
	
	
}
