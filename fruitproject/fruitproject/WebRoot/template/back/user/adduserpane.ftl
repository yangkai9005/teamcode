<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>用户栏</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/user.js"></script>
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/input.js"></script>
		<script type="text/javascript" src="js/jquery.tools.js"></script>
		<script type="text/javascript" src="js/kindeditor.js"></script>
	</head>

	<body>
		<div class="path">
		<a href="${base}/admin/common/index.jhtml">采购管理</a> &raquo;<a href="">新增用户</a>
	</div>
	<form id="inputForm" action="adduserval.do" method="post">
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>用户名:
				</th>
				<td>
					<input type="text" id="username" name="systemUserName" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					密码:
				</th>
				<td>
					<input type="text" id="userpwd" name="systemUserPwd" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					权限:
				</th>
				<td >
					<select id="userauth" name="SystemAuthId">
					<option value="0">请选择权限</option>
					<#list auths as auth>
					<option value="${auth.systemAuthId}">${auth.systemAuthName}</option>
					</#list>
					</select>
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