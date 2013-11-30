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
  	                <a class="navbar-brand" href="perfil.html">memento</a>
  	            </div>
  	
  	            <!-- Collect the nav links, forms, and other content for toggling -->
  	            <div class="collapse navbar-collapse navbar-ex1-collapse">
                        <ul class="nav nav-pills">
                          <li><a href="objetivos.html">objetivos</a></li>
                          <!--li><a href="#">logros</a></li-->
                          <li><a href="amigos.html">amigos</a></li>                     
  	                    
						<ul class="nav navbar-nav navbar-right">                        
  	                        <li class="dropdown" action="">
  	                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">NombreUsuario <b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="perfil.html">Perfil</a></li>
                                    
                                    <li><a href="">Salir</a></li>
  	                            </ul>
  	                        </li>
  	                    </ul>
						</ul>
  	                </div><!-- /.navbar-collapse -->
  		</div>            
  	</nav>
	 <div class="row">
    <div class="navbarCenter">
	        <div class="col-xs-12 col-md-8">
			
<div class="page-header">
  <ul class="nav nav-pills nav-stacked">
          
					    <li class="active">
					    
			<span class="glyphicon glyphicon-dashboard"></span> ${utmp.apellido} </li>
					
					</ul>
  </div>
  <button type="button" class="btn btn-info">Agregar como amigo</button>

  <h1><small>Logros alcanzados</small></h1>


      
	  <div class="panel panel-default">
			<div class="panel-heading"><h4><b><span class="glyphicon glyphicon-ok"></span>&nbsp;Objetivos generales</b></h4></div>
			<br/>
			<div class="panel-body">
			<h6>Desde el comienzo</h6>
			<div class="progress progress-striped">
				  <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
					<span class="sr-only">40% Complete (success)</span>
				  </div>
			</div>
			<h6>En el mes</h6>
			<div class="progress progress-striped">
				  <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
					<span class="sr-only">20% Complete</span>
				  </div>
			</div>
			</div>
		</div>
			<div class="panel panel-default">
			<div class="panel-heading"><h4><b><span class="glyphicon glyphicon-ok"></span>&nbsp;Logros alcanzados</b></h4></div>
			<div class="panel-body">
			<br/>
			<h6>Desde el comienzo</h6>
			<div class="progress progress-striped">
			  <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
				<span class="sr-only">60% Complete (warning)</span>
			  </div>
			</div>
			<h6>En el mes</h6>
			<div class="progress progress-striped">
			  <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
				<span class="sr-only">80% Complete (danger)</span>
			  </div>
			</div>
			</div>
		</div>
	  	</div>
     
        <div class="col-xs-6 col-md-4">
            <div class="panel panel-default">
                <div class="panel-body">
                    Objetivos actuales
                </div>
            </div>
                <ul class="nav nav-pills nav-stacked">
          <g:each var="obj" in="${tmp}">
					    <li class="active">
					    <g:link action="VerDetallesObjetivo" params="[obj:obj.id]">
			<span class="glyphicon glyphicon-dashboard"></span> ${obj.titulo} </g:link></li>
					</g:each>
          
           </ul>
		 
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