<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sim Project</title>
    <!-- Angular Js -->
	
    <!-- Bootstrap core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
  </head>
  <body >
  	
  		
  	
  	
    <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	          <span class="sr-only">Toggle navigation</span>
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Sim Project</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Administration <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="adminInstitution.html">Administration Organisme de sante</a></li>
               
                
              </ul>
            </li>
           
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Intervention<span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
            
                 <li><a href="/sim-intervention-workflow/">Workflow d'intervention</a></li>
                
              </ul>
            </li>
           
          </ul>
          </div><!--/.nav-collapse -->
        </div>
      </nav>
      <!-- Begin page content -->
      <div class="container" >
        <div class="jumbotron" >
        	<img class="img-responsive" src="<c:url value="/resources/images/logo_sim.png" />">
        
      
        </div>
        <div>
        </div>
      </div>
      <footer class="footer">
        
      </footer>
      
      <script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.10/angular.min.js"></script>
      
  	
  </body>
</html>