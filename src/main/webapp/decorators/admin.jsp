<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional/EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><dec:title default="Shop home page" /></title>
<link
	href="<c:url value="/template/admin/assets/css/bootstrap.min.css"/>"
	rel="stylesheet" type="text/css" media="all" />
<link
	href="<c:url value="/template/admin/assets/css/font-awesome.min.css"/>"
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/template/admin/assets/css/ace-fonts.css"/>"
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/template/admin/assets/css/ace.min.css"/>"
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value="/template/admin/assets/css/ace-rtl.min.css"/>"
	rel="stylesheet" type="text/css" media="all" />
<link
	href="<c:url value="/template/admin/assets/css/ace-skins.min.css"/>"
	rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript"
	src="<c:url value="/template/admin/assets/js/ace-extra.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js" />"></script>
</head>
<body>
	<!-- header -->
	<%@ include file="/common/admin/header.jsp"%>
	<!-- header -->

	<div class="main-container" id="main-container">
		<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
		</script>
		<!-- header -->
    	<%@ include file="/common/admin/menu.jsp" %>
    	<!-- header -->
		
		<dec:body/>
		
		<!-- footer -->
    	<%@ include file="/common/admin/footer.jsp" %>
    	<!-- footer -->
	</div>

	<!-- js -->
	<script type="text/javascript">
		window.jQuery
				|| document
						.write("<script src='https://cdnjs.cloudflare.com/ajax/libs/flat-ui/2.1.3/js/jquery-2.0.3.min.js'>"
								+ "<"+"/script>");
	</script>
	<script type="text/javascript">
		if ("ontouchend" in document)
			document
					.write("<script src='https://cdnjs.cloudflare.com/ajax/libs/gumby/2.6.0/js/libs/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<!-- Link online
		<script type="text/javascript"
		src="<c:url value="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/typeahead-bs2.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/x-editable/1.5.1/jquery-editable/jquery-ui-datepicker/js/jquery-ui-1.10.3.custom.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jqueryui-touch-punch/0.2.3/jquery.ui.touch-punch.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jQuery-slimScroll/1.3.8/jquery.slimscroll.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/easy-pie-chart/2.1.6/jquery.easypiechart.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/jquery-sparklines/2.1.2/jquery.sparkline.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/flot/0.8.3/jquery.flot.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/flot/0.8.3/jquery.flot.pie.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/flot/0.8.3/jquery.flot.resize.min.js" />"></script>
	 -->
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/ace-elements.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/ace.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/jquery-ui-1.10.3.custom.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/jquery.ui.touch-punch.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/jquery.slimscroll.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/jquery.easy-pie-chart.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/jquery.sparkline.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/flot/jquery.flot.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/flot/jquery.flot.pie.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/flot/jquery.flot.resize.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/bootstrap.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/admin/assets/js/typeahead-bs2.min.js" />"></script>
	<script type="text/javascript"
		src="<c:url value="/template/pagin/jquery.twbsPagination.js" />"></script>
	
	<!-- js -->
</body>
</html>