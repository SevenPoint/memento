package ar.edu.unlam

class SecUsuario {

	transient springSecurityService

	String username
	String password
	String nombre
	String apellido
	Integer edad
	String sexo
	String email
	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	static constraints = {
		username blank: false, unique: true
		password blank: false
		nombre blank:false, nullable: false
		apellido blank:false, nullable: false
		edad min:18, max:90
		sexo blank:false
		email blank:false
	}

	static mapping = {
		password column: '`password`'
	}

	Set<SecRol> getAuthorities() {
		SecUsuarioSecRol.findAllBySecUsuario(this).collect { it.secRol } as Set
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService.encodePassword(password)
	}
}
