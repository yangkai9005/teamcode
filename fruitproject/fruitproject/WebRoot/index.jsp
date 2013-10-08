<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>酷爱水果销售后台管理系统</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>

	<noframes>
		您的浏览器不支持frames，请升级后再浏览，谢谢!
	</noframes>
	<frameset rows="15%,*" border="0px;" bordercolor="red;">
		<frame scrolling="no" style="background-color: red">
		<frameset cols="20%,*">
			<frame style="background-color: gray">
			<frameset rows="*,5%" >
				<frame>
				<frame>
			</frameset>
		</frameset>
	</frameset>
</html>
