<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>Blueprint: Slide and Push Menus</title>
		<meta name="description" content="Blueprint: Slide and Push Menus" />
		<meta name="keywords" content="sliding menu, pushing menu, navigation, responsive, menu, css, jquery" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/default.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<script src="js/modernizr.custom.js"></script>
		<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
		
		<!-- Bootstrap core CSS -->
		<!-- <link href="css/bootstrap_chat.css" rel="stylesheet"> -->
		<link href="css/chat.css" rel="stylesheet">
		<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
		<script src="js/chart.js"></script>
		<script src="js/bootstrap_chat.js"></script>

	</head>
	<body class="cbp-spmenu-push">
		<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-right" id="cbp-spmenu-s2">
			<h3>DOCKING CHAT</h3>
				<div class="container">
				<div class="row">
					<div class="col-md-5">
						<div class="panel panel-primary">
							
							<div class="panel-collapse collapse" id="collapseOne">
								<div class="panel-body">
									<ul id="chat_area" class="chat">
										
									</ul>
								</div>
								
								<div class="panel-footer">
									<div class="input-group">
										<input id="btn-input" type="text" class="form-control input-sm"
											placeholder="Type your message here..." /> <span
											class="input-group-btn">
											<button class="btn btn-warning btn-sm" id="btn-chat">
												Send</button>
										</span>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</nav>

		<nav class="cbp-spmenu cbp-spmenu-horizontal cbp-spmenu-bottom" id="cbp-spmenu-s4">
			<h3>Invite</h3>
			
			<p><input type="text" id="invite_member" placeholder="Email" /></p>
			<p id="memberSearch">Search Member!</p>
			
			<p><input type="text" id="search_result" placeholder="Search Result" readonly /></p>
			<p id="memberInvite">Invite Member!</p>
		</nav>
		
		<nav class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left" id="cbp-spmenu-s1">
			<h3>BackUpList</h3>
			<div class="container">
				<div class="row">
					<div class="col-md-5">
						<div class="panel panel-primary">	
							<div class="panel-collapse collapse" id="collapseOne">
								<div class="panel-body">
									<ul id="backUp_area" class="chat">
										<c:forEach items="${requestScope.tempList}" var="con" varStatus="status">
											<li><a href="./temp_searchAll?docId=${con.docId }&lastDate=${con.checkLast}">${con.buDate }</a></li>
										</c:forEach>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</nav>
		
		<div class="container">
			<div class="main">
				<section>
					<div class="chatting_menu"><button id="showRight">Chatting</button></div>
					<div class="invite_menu"><button id="showBottom">Invite</button></div>
					<div class="backUp_menu"><button id="showLeft">BackUpList</button></div>
				</section>
			</div>
		</div>
		
		<script src="js/classie.js"></script>
		
		<script>
		$('#memberSearch').click(function(event)
	      {
	         var memberId = $("#invite_member").val();
	         
	         $.post("member_search", 
	               { 
	                  memberId: memberId,
	               },
	               
	               function(result) 
	               {   
	                  $("#search_result").val(result);
	               }
	         );
	      });   
	      
	      $('#memberInvite').click(function(event)
	      {
	         var memberId = $("#search_result").val();
	         var docId = $("#docId").val();
	         var portNum = $("#portNum").val();
	         
	         $.post("inviteEmail", 
	               { 
	                  memberId: memberId,
	                  docId : docId,
	                  portNum : portNum
	               },
	               
	               function(result) 
	               {   
	            	   var	chk = result.split("|");
						
						if(chk[0] == "0")
						{
							alert(chk[1]);
						}	
						
						else
						{
							alert(chk[1]);
						}
						
						$("#search_result").val("");
						$("#invite_member").val("");
	               }
	         );
	      }); 
		</script>
		
		<script>			
			var menuRight = document.getElementById( 'cbp-spmenu-s2' );
			var menuBottom = document.getElementById( 'cbp-spmenu-s4' );
			var menuLeft = document.getElementById( 'cbp-spmenu-s1' );
			var showRight = document.getElementById( 'showRight' );
			var showBottom = document.getElementById( 'showBottom' );
			var showLeft = document.getElementById( 'showLeft' );
			
			showRight.onclick = function() 
			{
				classie.toggle( this, 'active' );
				classie.toggle( menuRight, 'cbp-spmenu-open' );
				disableOther( 'showRight' );
			};

			showBottom.onclick = function() 
			{
				classie.toggle( this, 'active' );
				classie.toggle( menuBottom, 'cbp-spmenu-open' );
				disableOther( 'showBottom' );
			};
			
			showLeft.onclick = function() 
			{
				classie.toggle( this, 'active' );
				classie.toggle( menuLeft, 'cbp-spmenu-open' );
				disableOther( 'showLeft' );
			};

			function disableOther( button ) 
			{
				if( button !== 'showRight' ) 
				{
					classie.toggle( showRight, 'disabled' );
				}

				if( button !== 'showBottom' ) 
				{
					classie.toggle( showBottom, 'disabled' );
				}
				
				if( button !== 'showLeft' ) 
				{
					classie.toggle( showLeft, 'disabled' );
				}
			}
		</script>
	</body>
</html>
