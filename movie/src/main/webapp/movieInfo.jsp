<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>电影简介</title>
<script src="${pageContext.request.contextPath }/js/echarts.common.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath }/js/box.js"></script>
<link rel="stylesheet" href="/movie/css/info.css">
</head>
<body>
	<div id="warp">
		<div class="m_name">
			<h1>${movie.m_name}</h1><br>
			<a href="/movie/login.action?u_id=${user.u_id }&u_passwd=${user.u_passwd}">返回搜索页</a>
		</div>
		<div id="center">
			<div class="pic">
				<img alt="无图片" src="${movie.imgurl}">
				<div class="box">
				评分：
					<ul class="comment">
						<li value="1">☆</li>
						<li value="2">☆</li>
						<li value="3">☆</li>
						<li value="4">☆</li>
						<li value="5">☆</li>
					</ul>
					<input type="hidden" value="" id="aaa">
				</div>
			</div>
			<div class="info">
				<div class="infoname">导演：</div>
				<div class="infos">${movie.director}</div>
				<div class="infoname">编剧：</div>
				<div class="infos">${movie.screenwriter}</div>
				<div class="infoname">演员：</div>
				<div class="infos">${movie.actor}</div>
				<div class="infoname">类型：</div>
				<div class="infos">${movie.type}</div>
				<div class="infoname">地区：</div>
				<div class="infos">${movie.area}</div>
				<div class="infoname">语言：</div>
				<div class="infos">${movie.language}</div>
				<div class="infoname">时长：</div>
				<div class="infos">${movie.length}分钟</div>
			</div>
			<div class="rate" id="rate"></div>
		</div>
		<span>看过该电影的人还看过：</span>
	</div>
	
	<div class="clear"></div>
	<div class="rec">
		<c:forEach items="${recList}" var="m" varStatus="sta">
			<div class="recms">
				<img src="${m.imgurl}">
				<div class="recname">
					<a href="/movie/findInfo.action?m_id=${m.m_id }">${m.m_name}</a>
				</div>
			</div>
		</c:forEach>
	</div>

	<script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('rate'));

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: '评价人数'
            },
            tooltip: {},
            legend: {
                data:['人数  ']
            },
            xAxis: {
                data: ["1星","2星","3星","4星","5星"]
            },
            yAxis: {},
            series: [{
                name: '评分',
                type: 'bar',
                data: [${stars[0]}, ${stars[1]}, ${stars[2]}, ${stars[3]}, ${stars[4]}]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>