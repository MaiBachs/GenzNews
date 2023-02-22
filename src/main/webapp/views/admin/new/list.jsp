<%@include file = "/common/taglib.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách bài viết</title>
</head>
<body>
	<form action="<c:url value="/admin-new"/>" id="formSubmit" method="get">
		<div class="main-content">
			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
								chu</a></li>
					</ul>
					<!-- /.breadcrumbs -->
				</div>
				<div class="page-content">
					<div class="row">
						<div class="col-xs-12">
						    <a flag="info"
                               class="dt-button buttons-colvis btn btn-white btn-primary btn-bold" data-toggle="tooltip"
                               title='Thêm bài viết' >
                                        <span>
                                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus" viewBox="0 0 16 16">
                                              <path d="M7 4V7H4v2h3v3h2V9h3V7H9V4H7z"/>
                                            </svg>
                                        </span>
                            </a>
                            <button id="btnDelete" type="button"
                                    class="dt-button buttons-html5 btn btn-white btn-primary btn-bold" data-toggle="tooltip" title='Xóa bài viết'>
                                            <span>
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
                                                  <path d="M10.5 5.5a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-.5.5h-5a.5.5 0 0 1-.5-.5v-6a.5.5 0 0 1 .5-.5h5zm-1.414-1a.5.5 0 0 0-.5-.5h-2.172a.5.5 0 0 0-.5.5v1H4.5a.5.5 0 0 0-.5.5v1a.5.5 0 0 0 .5.5h.828l.518 5.181A.5.5 0 0 0 6.346 14h3.308a.5.5 0 0 0 .5-.319l.518-5.18H11.5a.5.5 0 0 0 .5-.5v-1a.5.5 0 0 0-.5-.5h-2v-1z"/>
                                                </svg>
                                            </span>
                            </button>
							<div class="row">
								<div class="col-xs-12">
									<div class="table-reponsive">
										<table class="table table-bordered">
											<thead>
												<tr>
													<th>Id</th>
													<th>Title</th>
													<th>CategoryName</th>
													<th>Edit</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="item" items="${model.listResult}">
													<tr>
														<td>${item.id}</td>
														<td>${item.title}</td>
														<td>${item.category.name}</td>
														<td>
                                                            <a href='<c:url value="/admin-new?type=edit"></c:url>'>Edit</a>
														</td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
										<ul class="pagination" id="pagination"></ul>
										<input type="hidden" value="" id="page" name="page">
										<input type="hidden" value="" id="maxPageItem" name="maxPageItem">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
	<script type="text/javascript">
		var currentPage=${model.page};
		var totalPages = ${model.totalPage};
		var limit=2;
 		$(function() {
 			window.pagObj = $('#pagination').twbsPagination({
 				totalPages : totalPages,
 				visiblePages : 5,
 				startPage: currentPage,
 				onPageClick : function(event, page) {	
 					console.info(page + ' (from options)');
 					if(page != currentPage){
 						$("#maxPageItem").val(limit);
 	 					$("#page").val(page);
 	 					$("#formSubmit").submit();
 					}
 				}
 			}).on('page', function(event, page) {
 				console.info(page + ' (from event listening)');
 			});
 		});
 	</script>
</body>
</html>