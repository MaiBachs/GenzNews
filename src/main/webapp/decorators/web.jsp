<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file = "/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional/EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><dec:title default="Shop home page" /></title>
	<!-- css -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
	<link rel="icon" type="image/x-icon" href="<c:url value="/template/web/assets/favicon.ico"/>" />
	<link href="<c:url value="/template/web/bootstrap/css/styles.css"/>" rel="stylesheet" type="text/css" media="all"/>
	<link href="<c:url value="/template/web/bootstrap/css/bootstrap-icons.css"/>" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
	<!-- header -->
	<%@ include file="/common/web/header.jsp" %>
	<!-- header -->
	
	<div class="container px-4 px-lg-5 mt-5">
		<dec:body/>
	</div>
	
	<!-- footer -->
	<%@ include file="/common/web/footer.jsp" %>
	<!-- footer -->
	
	
	<!-- js -->
	<script type="text/javascript" src="<c:url value="http://code.jquery.com/jquery-2.1.1.min.js" />"></script>
	<script type="text/javascript" src="<c:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"/>"></script>
	<!-- js -->
</body>
</html>