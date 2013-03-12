<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/content/css/bootstrap.min.css" />
        <script type="text/javascript" src="${pageContext.request.contextPath}/content/js/jquery-1.9.1.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/content/js/bootstrap.min.js"></script>
        <style>
            body {
                padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
            }
        </style>
    </head>
    <body>
        <div class="navbar navbar-inner navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="brand" href="#">OpenColegio</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active"><a href="#">Mantenedores</a></li>
                            <li><a href="#about">Gestión Academica</a></li>
                            <li><a href="#contact">Recaudación</a></li>
                        </ul>
                        <p class="navbar-text pull-right">
                            <a href="#" class="navbar-link">Username</a>
                        </p>
                    </div><!--/.nav-collapse -->
                </div>
            </div>
        </div>
        <div class="container">
            <jsp:include page="/WEB-INF/jsp/${view}.jsp"></jsp:include>
        </div>
    </body>
</html>