<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="path/assets/ico/favicon.png">

    <title>Crear Objetivo</title>

    <!-- Bootstrap core CSS -->
    <link href="../path/dist/css/bootstrap.css" rel="stylesheet">
	<link href="../css/css.css" rel="stylesheet">
	<script type="text/javascript" src="js/jquery-1.6.4.js"></script>
	<script type="text/javascript" src="js/valida_fecha.js"></script>
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
  	                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">${usuario} <b class="caret"></b></a>
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

		<h2><span class="glyphicon glyphicon-dashboard"></span> Objetivo a crear</h2>
                  <br>
                   
                <form action="../objetivo/guardarObjetivo" method="POST">
                <ul class="nav nav-pills nav-stacked">
                    <li>Titulo</li>
                    <input type="text" name="tituloObjetivo" id="input" class="form-control" value="" required="required" title="" ><br>
                    <li>Descripción</li>
                    <textarea type="text" name="DescripcionObjetivo" id="input" class="form-control" value="" required="required" title="" ></textarea><br>
                    <li>Fecha de Inicio</li>
                    <!--<input type="date" name="FechaInicio" id="input" class="form-control" value="" required="required" title=""><br>-->
					<input  name="fecha_in" placeholder="Fecha Inicio" class="form-control" required="required" /><br>
                    
					<li>Cantidad de Pasos</li>
                    <input type="number" name="CantPasos" id="input" class="form-control" value="" required="required" title="" placeholder="Ingrese cantidad de pasos" >
                    <br>
                    <input type="submit" value="Siguiente" class="btn btn-primary">
                </ul>
		</form>
        </div>
        
      </div>
    </div>
    <br><br><br>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="path/assets/js/jquery.js"></script>
    <script src="path/dist/js/bootstrap.min.js"></script>
  </body>
</html>