<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html lang="KR">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<title>Travel Mileage Project</title>

<!-- Font Awesome icons (free version)-->
<script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js" crossorigin="anonymous"></script>
<!-- Google fonts-->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
<link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="/resources/css/home.css" rel="stylesheet" />

<script src="/resources/js/jquery-3.6.0.min.js"></script>

</head>
<body id="page-top">
    <!-- Navigation-->
    <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
        <div class="container">
            <a class="navbar-brand" href="#page-top">Travel Mileage Project</a>
        </div>
    </nav>
    <form id="headForm">
    <!-- Masthead-->
    <header class="masthead bg-primary text-white text-center">
        <div class="container d-flex align-items-center flex-column" id="mainContent">
            <!-- Masthead Avatar Image-->
            <img class="masthead-avatar mb-5" id="imgEntBtn" src="/resources/image/avataaars.svg"  alt="" />
            <!-- Masthead Heading -->
            <a href="#" id="entBtn"><h1 class="masthead-heading text-uppercase mb-4" >Enter</h1></a>
        </div>
    </header>
    </form>

    <!-- Footer-->
    <footer class="footer text-center">
        <div class="container">
            <div class="row">
                <!-- Footer Location-->
                <div class="col-lg-4 mb-5 mb-lg-0">
                    <h4 class="text-uppercase mb-4">Location</h4>
                    <p class="lead mb-0">
                        경기도 안산시 상록구
                        <br />
                        오목로11길 13-1 301호
                    </p>
                </div>
                <!-- Footer Social Icons-->
                <div class="col-lg-4 mb-5 mb-lg-0">
                    <h4 class="text-uppercase mb-4">Around the Web</h4>
                    <a class="btn btn-outline-light btn-social mx-1" href="#!"><i class="fab fa-fw fa-facebook-f"></i></a>
                    <a class="btn btn-outline-light btn-social mx-1" href="#!"><i class="fab fa-fw fa-twitter"></i></a>
                    <a class="btn btn-outline-light btn-social mx-1" href="#!"><i class="fab fa-fw fa-linkedin-in"></i></a>
                    <a class="btn btn-outline-light btn-social mx-1" href="#!"><i class="fab fa-fw fa-dribbble"></i></a>
                </div>
                <!-- Footer About Text-->
                <div class="col-lg-4">
                    <h4 class="text-uppercase mb-4">About Project</h4>
                    <p class="lead mb-0">
                        Travel Mileage Project. Created by Daddy.
                    </p>
                </div>
            </div>
        </div>
    </footer>
    <!-- Copyright Section-->
    <div class="copyright py-4 text-center text-white">
        <div class="container"><small>Copyright &copy; Kyoogles 2021</small></div>
    </div>

<script>

$(document).ready(function() {

    $('#imgEntBtn').on('click', function(e) {
        e.preventDefault();

        var formData = {};

        location.href = '/ca/calenderView';
        //gfn_callServer('POST', '/ca/calenderView', true, formData, 'application/x-www-form-urlencoded', 'text', gfn_callMenuResult, 30000);
    });

    $('#entBtn').on('click', function(e) {
        e.preventDefault();

        var formData = {};

        location.href = '/ca/calenderView';
    });

});

</script>

</body>
</html>

