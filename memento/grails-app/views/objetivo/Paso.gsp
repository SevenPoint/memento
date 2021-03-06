<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="path/assets/ico/favicon.png">

    <title>Configuracion de Pasos</title>

    <!-- Bootstrap core CSS -->
    <link href="../path/dist/css/bootstrap.css" rel="stylesheet">
	<link href="../css/css.css" rel="stylesheet">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="path/assets/js/html5shiv.js"></script>
      <script src="path/assets/js/respond.min.js"></script>
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
  	                <a class="navbar-brand" href="../objetivo/index">memento</a>
  	            </div>
  	
  	            <!-- Collect the nav links, forms, and other content for toggling -->
  	            <div class="collapse navbar-collapse navbar-ex1-collapse">
                        <ul class="nav nav-pills">
                           <li><a href="../objetivo/index">objetivos</a></li>
                          <li><a href="#">logros</a></li>
                          <li><a href="amigos.html">amigos</a></li>                    
  	                    
						<ul class="nav navbar-nav navbar-right">                        
  	                        <li class="dropdown" action="">
  	                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">${usuario}<b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="">Perfil</a></li>
                                    <li><a href="">Configuracion</a></li>
                                    <li><a href="">Salir</a></li>
  	                            </ul>
  	                        </li>
  	                    </ul>
						</ul>
  	                </div><!-- /.navbar-collapse -->
  		</div>            
  	</nav>
    <div class="navbarCenter">
      <div class="row">
        <div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
            
                <h2>Configurando</h2>   
                
		<h3>Primer paso</h3>
		
		<form action="../objetivo/guardarPaso" method="POST">
				   <ul class="nav nav-pills nav-stacked">
	                    <li>Titulo</li>
	                    <input type="text" name="tituloPaso" id="input" class="form-control" value="" required="required" title="" placeholder="Ingrese un título" ><br>
	                    <li>Descripcion</li>
	                    <textarea  type="text" name="descripcionPaso" id="input" class="form-control" value="" required="required" title="" placeholder="Ingrese una descripción" ></textarea><br>
	                    <li>Recordarme este paso</li>
	                    <input type="hidden" name="idO" value="${tmp.id}">
	                    <input type="hidden" name="cantPasos" value="${tmp.cantPasos}">
	                    <input type="hidden" name="cantDias" value="${tmp.cantDias}">
	                    <input type="hidden" name="fechain" value="${fechain}">
	                    fechain
			    <div class="row">
			      <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				<input type="number" name="" id="input" class="form-control" value="" required="required" title="" >
			      </div>
			      <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				  <select style="width:140px;" name="tiempoAtras" class="form-control">
				    <option selected>Horas antes</option>
				    <option>Días antes</option>
				  </select>
			      </div>
			    </div>
	                    
			    
	                </ul>
				
			
			
			<br>
	                    <input type="submit" value="Finalizar" id="boton" class="btn btn-primary"></input>
        </form>
        
		</div>
		
        <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
        
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="path/assets/js/jquery.js"></script>
    <script src="path/dist/js/bootstrap.min.js"></script>
  </body>
</html>