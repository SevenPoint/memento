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
  	                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">${usuario} <b class="caret"></b></a>
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
                 
          <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
            <div class="panel panel-default">
                <div class="panel-body">
                    Consejo
                </div>
            </div>
                <ul class="nav nav-pills nav-stacked">
                	<g:each var="con" in="${conj}">
					    <li class="active"><a href=""><span class="glyphicon glyphicon-dashboard"></span> ${con.consejo} </a></li>
					</g:each>
                  
                </ul>
        </div>        
                 
        
        <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
	  <g:each var="objt" in="${tmpo}">
	  <div class="panel panel-default">
                <div class="panel-body">
                  <span class="glyphicon glyphicon-hand-right"></span> ${objt.titulo}
                </div>
            </div>
	  
	  <div class="progress progress-striped" style="margin-bottom: 5px; height: 25px;"> 
              <div class="progress-bar progress-bar-info" style="width: ${objt.estado}%"><label>${objt.estado}%</label></div>
          </div><br>
	  </g:each>
	  <div class="alert alert-dismissable alert-info">
              <button type="button" class="close" data-dismiss="alert">×</button>
              <strong>Te falta muy poco!</strong> Estas a punto de finalizar tu objetivo.
          </div><br>
	  
	
	  
             <g:each var="paso" in="${tmpp}">
             	<g:if test="${paso.estado == "1"}">
               <div class="panel panel-success">
					<div class="panel-heading">
	                <h3 class="panel-title">${paso.titulo}  <span class="glyphicon glyphicon-ok"></span> </h3>
	              </div>
	              <div class="panel-body">
	              	${paso.objetivo}
	              </div>
	           </div>
	           </g:if>
	           <g:elseif test="${paso.estado == "2"}">
	            <form action="../objetivo/finalizarPaso" method="POST">
	            	<input type="hidden" name="idO" value="${paso.id}">
		           	<div class="panel panel-warning">
						<div class="panel-heading">
		                <h3 class="panel-title">${paso.titulo}  <span class="glyphicon glyphicon-dashboard"></span> </h3>
		              </div>
		              <div class="panel-body">
		              ${paso.objetivo}
		              </div>
		              <input type="submit" value="Finalizar" id="boton" class="btn btn-primary"></input>
		            </div>
	            </form>
	           </g:elseif>
	      		<g:else>
	      		<div class="panel panel-danger">
				  <div class="panel-heading">
	                <h3 class="panel-title">${paso.titulo}  <span class="glyphicon glyphicon-remove"></span> </h3>
	              </div>
	              <div class="panel-body">
	              	${paso.objetivo}
	              </div>
	            </div>
	           </g:else>
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