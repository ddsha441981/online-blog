<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/> 


<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title> Online Blog ${tittle}</title>
  
  <script>
  
  	window.menu = "${tittle}";
  
  </script>
  
  <!-- User Profile Card css  -->
<!-- <style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  /* max-width: 300px; */
  margin: auto; 
  text-align: center;
  font-family: arial;
}

.title {
  color: grey;
  font-size: 18px;
}

button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}

a {
  text-decoration: none;
  font-size: 22px;
  color: black;
}

button:hover, a:hover {
  opacity: 0.7;
}
</style> -->

<!-- Add icon library for user profile -->
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> -->


  <!-- Bootstrap core CSS -->
  <link href="${css}/bootstrap1.min.css" rel="stylesheet">

<!-- Bootstrap readable theme -->
  <link href="${css}/theme-bootstrap.min.css" rel="stylesheet">


  <!-- Custom styles for this template -->
  <link href="${css}/blog-post.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->

		<%@ include file="./shared/navbar.jsp"%>


		<!-- Page Content -->
		<div class="content">
			<!-- ..........................Loading home content here............................... -->
			<c:if test="${userClickHome == true }">
				<%@ include file="home.jsp"%>
			</c:if>

			<!-- Load only when user clicks about -->
			<c:if test="${userClickAbout == true }">
				<%@ include file="about.jsp"%>
			</c:if>

			<!-- Load only when user clicks contact -->
			<c:if test="${userClickContact == true }">
				<%@ include file="contact.jsp"%>
			</c:if>
			
			<!-- Load only when user clicks allPost and category post -->
			<c:if test="${userClickAllPosts == true or userClickCategoryPosts == true}">
				<%@ include file="listPosts.jsp"%>
			</c:if>
			<!-- sidebar widgets  -->

			<%--  <%@ include file="./shared/sidebar.jsp" %> --%>


			<!-- /.container -->
		</div>
		<!-- Footer -->

		<%@ include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>

		<!-- self coded js file -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
