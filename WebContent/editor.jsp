<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="myTag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="import.html"%>
</head>
<body>
	<myTag:menubar />
	<!-- +++++ Projects Section +++++ -->
	<div id="page">
		<div class="container pt">
			<div class="row mt">
				<div class="col-lg-6 col-lg-offset-3 centered">
					<h3>MY EDITOR</h3>
					<hr>
					<p>Menu related to the developer</p>
				</div>
			</div>
			<div class="row mt centered">
				<div class="col-lg-4">
					<a class="zoom green" href="./editorUpload.jsp"><img
						class="img-responsive" src="./img/editor_register.png"
						alt="" /></a>
					<H3>REGISTER</H3>
				</div>
				<div class="col-lg-4">
					<a class="zoom green" href="./editor_searchAll"><img
						class="img-responsive" src="./img/editor_manage.png"
						alt="" /></a>
					<H3>MANAGE</H3>
				</div>
				<div class="col-lg-4">
					<a class="zoom green" href="./editorReview_searchAll?writer=${sessionScope.logInMember.id}"><img
						class="img-responsive" src="./img/editor_chart.png"
						alt="" /></a>
					<H3>REVIEW</H3>
				</div>
			</div>
		</div>
	</div>
	<!-- /grey -->
	<myTag:copyright />
</body>
</html>