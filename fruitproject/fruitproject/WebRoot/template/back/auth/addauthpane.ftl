<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>权限栏目一览表</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/auth.js"></script>
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
			<div style="float:left;padding-top: 7px;">
				当前位置:添加权限
			</div>
			</div>
		</div>
		<div>
		<form id="form1" method="post" action="addauthval.do">
			<table width="60%" id="mytab" border="1" class="t1">
				<tr class="a1">
					<td style="font-weight:bold">
						权限名称
					</td>
					<td>
					<input type="text" class="txt" name="systemAuthName" id="authname"  onblur="checkAuth()">
					<br/>
					</td>
				</tr>
				
				<tr class="a1">
					<td style="font-weight:bold">
						权限等级
					</td>
					<td>
					<input type="text" class="txt" name="systemAuthLevel" id="authlevel"  onblur="checkAuth()">
					<br/>
					<font id="notice" color="red"></font>
					</td>
				</tr>
				<tr class="a1">
					<td style="font-weight:bold">
						权限描述
					</td>
					<td>
					<textarea rows="3" cols="20" name="systemAuthDesc" class="txt"></textarea>
					<br/>
					</td>
				</tr>
				<tr class="a1">
					<td colspan="2" >
					<input type='button' value="添加" onclick="addAuth()" id="addauth"  class="btn" style="width:50px;height:30px;background:url('images/btn/btn5.png');color:white;margin-right:10px;" disabled="disabled">
					<input type='reset' value="重置"  class="btn" style="width:50px;height:30px;background:url('images/btn/btn5.png');color:green;margin-right:10px;">
					</td>
				</tr>
			</table>
			</form>
		</div>
	</body>
</html>