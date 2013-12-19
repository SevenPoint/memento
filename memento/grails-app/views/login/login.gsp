<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../path/assets/ico/favicon.png">

    <title>Titulo</title>

    <!-- Bootstrap core CSS -->
    <link href="../path/dist/css/bootstrap.css" rel="stylesheet">
	<link href="../css/css.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="../path/assets/js/html5shiv.js"></script>
      <script src="../path/assets/js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
  	<nav class="navbar navbar-default" role="navigation">
  	    <div class="navbarCenter">        
  	    	<!-- Brand and toggle get grouped for better mobile display -->
  	            <div class="navbar-header">
  	                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
  	                    <span class="sr-only">Toggle navigation</span>
  	                    <span class="icon-bar"></span>
  	                    <span class="icon-bar"></span>
  	                    <span class="icon-bar"></span>
  	                </button>
  	                <a class="navbar-brand" href="#">memento</a>
  	            </div>
  	
  	            <!-- Collect the nav links, forms, and other content for toggling -->
  	            <div class="collapse navbar-collapse navbar-ex1-collapse">
  	                    <ul class="nav navbar-nav navbar-right">
  	                        <li><g:if test='${flash.message}'>
								<div class='login_message'>${flash.message}</div>
								</g:if></li>
  	                        <li class="dropdown">
  	                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Ingresar <b class="caret"></b></a>
  	                            <ul class="dropdown-menu">
  	                            	<form class="ingresarIndex" method='POST' id='loginForm' action='${postUrl}' autocomplete='off'>
  	                            		<label for='username'><g:message code="springSecurity.login.username.label"/>:</label>
	  	                                <input type="text" name='j_username' id='username' class="form-control" value="" required="required" title="" placeholder="Ingrese su usuario"></li>
	  	                                <label for='password'><g:message code="springSecurity.login.password.label"/>:</label>
	  	                                <input type="password" name='j_password' id='password' class="form-control" required="required" title="" placeholder="Ingrese su clave">
	  	                                <button type='submit' id="submit" value='${message(code: "springSecurity.login.button")}' class="btn btn-primary ingresarIndex">Ingresar</button>
	  	                            </form>
  	                            </ul>
  	                        </li>
  	                    </ul>
  	                </div><!-- /.navbar-collapse -->
  		</div>            
  	</nav>

  	            <div class="jumbotron">
  	            	<div class="navbarCenter">
						<div class="row">
							<div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
								<div class="container">							
									<h1>Memento</h1>
									<p>Alcanza tu potencial</p>
				  	                  <!--div class="imageindex"><img src="images/imageindex.png"></div-->
								</div>				  	                    
				  	        	</div>									
							<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
							    <ul class="nav navbar-nav navbar-right">
							    	<form class="registrarIndex navbar-right" action="../usuario/guardarUsuario" method="POST">
										<input type="text" name="Nombre" id="input" class="form-control" value="" required="required"  title="" placeHolder="Ingrese su nombre">
										<input type="email" name="email" id="input" class="form-control" value="" required="required" title="" placeholder="Ingrese su E-mail">
										<input type="password" name="password" id="input" class="form-control" required="required" title="" placeholder="Ingrese un clave">
										<input type="password" name="repPassword" id="input" class="form-control" required="required" title="" placeholder="Reingrese la clave">
										<button type="submit" class="btn btn-primary">Registrarse</button>
									</form>
			  	                </ul>
							</div>
						</div>
  	            	</div>
  	            </div>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="../path/assets/js/jquery.js"></script>
    <script src="../path/dist/js/bootstrap.min.js"></script>
  </body>
</html>