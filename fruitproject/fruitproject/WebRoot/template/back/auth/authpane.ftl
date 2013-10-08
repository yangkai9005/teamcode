<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>权限栏目一览表</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/norm.js"></script>
	</head>

	<body>
		<div class="ban">
		<div class="ban_1">
			<div style="float:left;padding-top: 7px;">
				当前位置:系统权限列表
			</div>
			<div style="float:right;text-align:center">
			<img src="images/add.png" onclick="javascript:location.href='addauthpane.do'" style="cursor:pointer;padding-right:20px;" title="添加权限">
			</div>
		</div>
		</div>
		<div>
			<table width="90%" id="mytab" border="1" class="t1">
				<thead>
					<th width="20%">
						名称
					</th>
					<th width="10%">
						等级
					</th>
					<th width="50%" >
						菜单栏目
					</th>
					<th width="20%" >
						操作
					</th>
				</thead>
				<#list auths as auth>
				<tr class="a1">
					<td>
						${auth.systemAuthName} 
					</td>
					<td>
					${auth.systemAuthLevel}
					</td>
					<td>
					<#list auth.menus as menu>
					${menu.menuName }&nbsp;
					</#list>
					</td>
					<td>
					<!--<input type='button' value="修改" onclick="javascript:location.href='updateauthpane.do?authId=${auth.systemAuthId}'" class="btn" style="width:50px;height:30px;background:url('images/btn/btn5.png');color:green;">
					<input type='button' value="删除" onclick="delPath('delauthval.do?authId=${auth.systemAuthId}')" class="btn" style="width:50px;height:30px;background:url('images/btn/btn5.png');color:red;">
					-->
					<a href="updateauthpane.do?authId=${auth.systemAuthId}'">修改</a>&nbsp;&nbsp;&nbsp<font class="del"><a href="javascript:void(0)" onclick="delPath('delauthval.do?authId=${auth.systemAuthId}')" >删除</a></font>
					</td>
				</tr>
				</#list>
				<tr class="a1" style="border:0px;background:#D4DCD6;"><td colspan="4" style="padding-top:10px;text-align: right;"><a href="#">上一页</a>&nbsp;&nbsp;<a href="#">下一页</a> &nbsp;&nbsp;<font color="#336600" style="font-weight:bolder">当前第1页&nbsp;</p></td></tr>
			</table>
		</div>
	</body>
</html>