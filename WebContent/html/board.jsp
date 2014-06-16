<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="myTag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="import.html"%>
</head>
<body>
	<myTag:menubar />
	<!-- +++++ Posts Lists +++++ -->
	<!-- +++++ First Post +++++ -->
	<div id="boardPage">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<p>
						<img src="../assets/img/user.png" width="50px" height="50px">
						<ba>DOCKING</ba>
					</p>
					<p>
						<bd>January 18, 2014</bd>
					</p>
					<h4>The Amazing Spiderman</h4>
					<p>
						<b>Spider-Man</b> is a fictional character, a comic book superhero
						that appears in comic books published by Marvel Comics. Created by
						writer-editor Stan Lee and writer-artist Steve Ditko, he first
						appeared in Amazing Fantasy #15 (cover-dated Aug. 1962).
					</p>
					<p>Lee and Ditko conceived the character as an orphan being
						raised by his Aunt May and Uncle Ben, and as a teenager, having to
						deal with the normal struggles of adolescence in addition to those
						of a costumed crimefighter.</p>
					<p>
						<a href="../html/start.jsp">Continue Reading...</a>
					</p>
				</div>

			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /grey -->

	<!-- +++++ Second Post +++++ -->
	<div id="white">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<p>
						<img src="../assets/img/user.png" width="50px" height="50px">
						<ba>DOCKING</ba>
					</p>
					<p>
						<bd>January 3, 2014</bd>
					</p>
					<h4>An Image Post</h4>
					<p>
						<img class="img-responsive" src="../assets/img/blog01.jpg" alt="">
					</p>
					<p>Lorem Ipsum is simply dummy text of the printing and
						typesetting industry. Lorem Ipsum has been the industry's standard
						dummy text ever since the 1500s, when an unknown printer took a
						galley of type and scrambled it to make a type specimen book.</p>
					<p>
						<a href="../html/start.jsp">Continue Reading...</a>
					</p>
				</div>

			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /white -->

	<!-- +++++ Third Post +++++ -->
	<div id="grey">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
					<p>
						<img src="../assets/img/user.png" width="50px" height="50px">
						<ba>DOCKING</ba>
					</p>
					<p>
						<bd>January 01, 2014</bd>
					</p>
					<h4>Believe In Yourself</h4>
					<p class="bq">"A bird sitting on a tree is never afraid of the
						branch breaking, because her trust is not in the branch, but in
						her own wings."</p>
				</div>

			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /grey -->
	<myTag:copyright />
</body>
</html>