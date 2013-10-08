<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title></title>
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/menu.js"></script>
	</head>
	<body onload="displayAddBtn('menuName','addmenu');">
		<div class="ban">
			<div class="ban_1">
			<div style="float:left;padding-top: 7px;">
				当前位置:添加菜单
			</div>
			</div>
		</div>
		<div><input type='button' value="新增菜单" onclick="addMenuColum();" class="btn" style="float:right;width:100px;height:30px;background:url('images/btn/btn5.png');color:green;margin-right:60px;"></div>
		<div style="padding-top:30px;">
		<form id="menu" name="menuChild" action="addmenuval.do" method="post">
		<input type="hidden" class="txt" name="authId" value="${authId}"/>
			<table width="60%" id="mytab" border="1" class="t1">
				<tr class="a1">
					<td width="40%">
					<font color="red" style="font-weight:bold">菜单名称</font>
					</td> 
					<td width="20%">
					<font color="red" style="font-weight:bold">删除:</font>
					</td>
				</tr>
			</table>
		</div>
		<div style="padding-right:60px;padding-top:20px;">
		<input  type="button" id="addmenu" value="添加" class="btn" style="float:right;background:url('images/btn/btn4.png');width:50px;height:30px;" onclick="childMenuCharge('menuName','menuName','menu');"/>
		</div>
		</form>
	</body>
</html>