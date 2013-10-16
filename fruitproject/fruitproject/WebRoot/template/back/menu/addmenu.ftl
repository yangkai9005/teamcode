<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title></title>
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script type="text/javascript" src="js/jquery.validate.js"></script>
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/common.js"></script>
		<script type="text/javascript" src="js/input.js"></script>
	</head>
	<body onload="displayAddBtn('menuName','addmenu');">
		<div class="path">
		<a href="${base}/admin/common/index.jhtml">系统扩展栏目</a> &raquo;<a href="">菜单管理</a>
	</div>
	<form id="inputForm" action="addmenuval.do" method="post">
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>菜单名称:
				</th>
				<td>
					<input type="text" name="menuName" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					菜单描述:
				</th>
				<td>
					<input type="text"  class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					&nbsp;
				</th>
				<td>
					<input type="submit" class="button" value="确定" />
					<input type="button" id="backButton" class="button" value="返回" />
				</td>
			</tr>
		</table>
	</form>
	</body>
</html>