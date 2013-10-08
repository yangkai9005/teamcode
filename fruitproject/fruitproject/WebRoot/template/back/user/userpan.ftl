<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>用户栏</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
				<div style="float:left;padding-top: 7px;">
				当前位置:系统用户列表
			</div>
			<div style="float:right;text-align:center">
			<img src="images/add.png" onclick="javascript:location.href='adduserpane.do'" style="cursor:pointer;padding-right:20px;" title="添加用户">
			</div>
			</div>
		</div>
		<div>
			<table width="90%" id="mytab" border="1" class="t1">
				<thead>
					<th width="20%">
						用户名称
					</th>
					<th width="40%">
						用户权限
					</th>
					<th width="40%" colspan="2">
						操作
					</th>
				</thead>
				<#list users as user>
				<tr class="a1">
					<td>
						${user.systemUserName}
					</td>
					<td>
					${user.auth.systemAuthName}&nbsp;
					</td>
					<td colspan="2">
					<a href="#">修改密码</a>&nbsp;&nbsp;
					<a href="#">修改权限</a>&nbsp;&nbsp;
					<#if "${user.auth.systemAuthLevel}"!=1>
					<font class="del"><a href="javascript:void(0)" onclick="delPath('delauthval.do?authId=${auth.systemAuthId}')" >删除</a></font>
					</#if>
					</td>
				</tr>
				</#list>
			</table>
		</div>
	</body>
</html>