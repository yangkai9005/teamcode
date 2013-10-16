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
		<a href="${base}/admin/common/index.jhtml">采购管理</a> &raquo;<a href="">计量单位管理</a>
	</div>
	<form id="inputForm" action="addunitval.do" method="post">
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>单位名称:
				</th>
				<td>
					<input type="text" name="unitName" id="unitName" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>单位值:
				</th>
				<td>
					<input type="text" name="unitValue" id="unitValue" class="text" maxlength="200" />
					<span class="red">&nbsp;比如千克需填写kg</span>
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