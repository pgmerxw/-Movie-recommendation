<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>列表</title>
<link rel="stylesheet" href="/movie/css/list.css">
</head>
<body>
	欢迎用户: ${user.u_id}
	<br>
	<a href="/movie/logout.action" class="lgout">退出登录</a>
	<div id="warp">
		<div id="ser">
			<form action="/movie/findMovie.action" method="post">
				<input type="search" name="m_name" value="输入电影名搜索"><input
					type="submit" value="搜索">
			</form>
		</div>
		<span style="color: red;">${msg}</span>
		<div id="list">
			<c:forEach items="${movies}" var="movies" varStatus="sta">
				<div class="movie">
					<div class="pic">
						<img  src=" ${movies.imgurl}">
					</div>
					<div class="intd">
						<div class="mname">
							<a href="/movie/findInfo.action?m_id=${movies.m_id }">${movies.m_name}</a>
						</div>
						<div class="mrate">评分：${movies.rate}</div>
					</div>
				</div>
			</c:forEach>
		</div>
		<div id="pages">
				<!--文字信息-->
				<div class="xinxi">当前第 ${pageInfo.pageNum}页.总共
					${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录</div>

				<!--点击分页-->
				<div class="fenye">
					<nav aria-label="Page navigation">
						<ul class="pagination">

							<a href="${pageContext.request.contextPath}/findMovie.action?m_name=${m_name}&pageNum=1"><li>首页</li></a>
							<!--上一页-->
							<c:if test="${pageInfo.hasPreviousPage}">
									<a
										href="${pageContext.request.contextPath}/findMovie.action?m_name=${m_name}&pageNum=${pageInfo.pageNum-1}"
										aria-label="Previous"><li><span aria-hidden="true">上一页</span></li>
									</a>
								</c:if>

							<!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->
							<c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
								<c:if test="${page_num == pageInfo.pageNum}">
									<a href="#"><li class="active">${page_num}</li></a>
								</c:if>
								<c:if test="${page_num != pageInfo.pageNum}">
									<a
										href="${pageContext.request.contextPath}/findMovie.action?m_name=${m_name}&pageNum=${page_num}"><li>${page_num}</li></a>
								</c:if>
							</c:forEach>

							<!--下一页-->
							<c:if test="${pageInfo.hasNextPage}">
									<a
										href="${pageContext.request.contextPath}/findMovie.action?m_name=${m_name}&pageNum=${pageInfo.pageNum+1}"
										aria-label="Next"><li><span aria-hidden="true">下一页</span></li>
									</a>
								</c:if>

							<a href="${pageContext.request.contextPath}/findMovie.action?m_name=${m_name}&pageNum=${pageInfo.pages}"><li>尾页</li></a>
						</ul>
					</nav>
				</div>
			</div>
		</div>
</body>
</html>