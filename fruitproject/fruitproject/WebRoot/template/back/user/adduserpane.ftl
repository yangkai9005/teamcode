<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>用户栏</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/user.js"></script>
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
				<div style="float:left;padding-top: 7px;">
				当前位置:添加用户
			</div>
			</div>
		</div>
		<div>
		<form id="form1" method="post" action="adduserval.do">
			<table width="50%" id="mytab" border="1" class="t1">
				<tr class="a1">
					<td style="font-weight:bold;">
					用户名
					</td>
					<td>
					<input type="text" class="txt" id="username" name="systemUserName" onblur="checkUser(this.value)"/>
					<br/>
					<font id="usernotice" color="red"></font>
					</td>
				</tr>
				<tr class="a1">
					<td style="font-weight:bold;">
					密码
					</td>
					<td>
					<input type="password" class="txt" id="userpwd" name="systemUserPwd"/>
					<br/>
					<font id="pwdnotice" color="red"></font>
					</td>
				</tr>
				<tr class="a1">
					<td style="font-weight:bold;">
					权限
					</td>
					<td >
					<select id="userauth" name="SystemAuthId" style="font-size:17px;font-weight:bold;">
					<option value="0">请选择权限</option>
					<#list auths as auth>
					<option value="${auth.systemAuthId}">${auth.systemAuthName}</option>
					</#list>
					</select>
					</td>
				</tr>
				<tr class="a1">
					<td colspan="2" >
					<input type='button' id="adduser" value="添加" onclick="addUser();"  class="btn" style="width:50px;height:30px;background:url('images/btn/btn5.png');color:white;margin-right:10px;" disabled="disabled">
					<input type='reset' value="重置"  class="btn" style="width:50px;height:30px;background:url('images/btn/btn5.png');color:green;margin-right:10px;">
					</td>
				</tr>
			</table>
			</form>
		</div>
	</body>
</html>