<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="path/assets/ico/favicon.png">

    <title>Objetivos - Memento</title>

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
                        <ul class="nav navbar-nav">
                           <li><a href="../objetivo/index">objetivos</a></li>
                          <li><a href="#">logros</a></li>
                          <li><a href="amigos.html">amigos</a></li> 
                        </ul>
  	                    <ul class="nav navbar-nav navbar-right">
  	                        
  	                        <li class="dropdown" action="">
  	                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">NombreUsuario <b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="">Perfil</a></li>
                                    <li><a href="">Configuracion</a></li>
                                    <li><a href="">Salir</a></li>
  	                            </ul>
  	                        </li>
  	                    </ul>
  	                </div><!-- /.navbar-collapse -->
  		</div>            
  	</nav>
    <div class="navbarCenter">
      <div class="row">
        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
            <div class="panel panel-default">
                <div class="panel-body">
                    Objetivos
                </div>
            </div>
                <ul class="nav nav-pills nav-stacked">
                	<g:each var="obj" in="${tmp}">
					    <li class="active">
					    <g:link action="VerDetallesObjetivo" params="[obj:obj.id]">
							<span class="glyphicon glyphicon-dashboard"></span> ${obj.titulo} </g:link></li>
					</g:each>

                </ul>
		 <div class="panel-body">
                    <a href="../objetivo/crearObjetivo"> <span class="glyphicon glyphicon-plus"></span> Agregar un objetivo nuevo</a>
                </div>
        </div>
        <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
	 <!-- Aca empieza el medio --> 
	  <g:each var="logroP" in="${logroPaso}">
	  <div class="panel panel-default">
                <div class="panel-body">
                	
                  <span> ${logroP.nombre}</span>
                </div>
            </div>
	 		 <img alt="${logroP.imagenAsociada}" title="${logroP.descripcion}" src="../images/${logroP.imagenAsociada}.jpg">
              <label>${logroP.descripcion}</label>
          <br>
	  </g:each>
	  <g:each var="logro" in="${logroObj}">
	  <div class="panel panel-default">
                <div class="panel-body">
                	
                  <span >${logro.nombre}</span> 
                </div>
            </div>
	 		 <img alt="${logro.imagenAsociada}" title="${logro.descripcion}" src="../images/${logro.imagenAsociada}.jpg">
              <label>${logro.descripcion}</label>
          <br>
	  </g:each>
	  
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