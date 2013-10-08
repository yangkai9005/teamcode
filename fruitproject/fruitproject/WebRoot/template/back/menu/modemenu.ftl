<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>酷爱水果销售后台管理系统</title>
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/menu.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/norm.js"></script>
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
				<div style="float:left;padding-top: 7px;">
				当前位置:修改子菜单
			</div>
			</div>
		</div>
		<div>
		<form id="menuChild" name="menuChild" action="modemenuval.do" method="post">
			<table width="90%" id="mytab" border="1" class="t1">
				<#list menuChildes as menuChilde>
				<tr class="a1">
					<td width="40%">
					<input type="hidden" class="txt" name="menuChildId" value="${menuChilde.menuChildId}"/>
					<font color="red">子菜单名称:</font>
						<input type="text" class="txt" name="menuChildName" value="${menuChilde.menuChildName}"/>
					</td>
					<td width="40%">
					<font color="red">子菜单地址:</font>
					<input type="text" class="txt" name="menuChildAddr" value="${menuChilde.menuChildAddr}"/>
					</td>
					<td width="20%">
					<font color="red">删除:</font>
					<img src="images/ico/del.gif" alt="删除菜单" width="19px;" height="20px;" onclick="delPath('delmenuchildval.do?menuChildId=${menuChilde.menuChildId}')">
					<input type="hidden" class="txt" name="menuId" value="${menuChilde.menuId}"/>
					</td>
				</tr>
				</#list>
			</table>
		</div>
		<div style="padding-right:60px;padding-top:20px;">
		<input  type="button" value="修改" class="btn" style="float:right;background:url('images/btn/btn4.png');width:50px;height:30px;" onclick="childMenuCharge('menuChildAddr','menuChildName','menuChild');" />
		</div>
		</form>
	</body>
</html>