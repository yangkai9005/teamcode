<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>酷爱水果销售后台管理系统</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/norm.js"></script>
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
				
				<div style="float:left;padding-top: 7px;">
				当前位置:系统菜单列表
			</div>
			<div style="float:right;text-align:center">
			<img src="images/add.png" onclick="javascript:location.href='addmenupane.do'" style="cursor:pointer;padding-right:20px;" title="添加菜单">
			</div>
			</div>
		</div>
		<div>
			<table width="90%" id="mytab" border="1" class="t1">
				<thead>
					<th width="20%">
						菜单名称
					</th>
					<th width="60%">
						子菜单列表
					</th>
					<th width="20%" colspan="2">
						操作
					</th>
				</thead>
				<#list menus as menu>
				<tr class="a1">
					<td>
						${menu.menuName}
					</td>
					<td>
					<#list menu.menuChilds as menuChild>
					${menuChild.menuChildName}&nbsp;
					</#list>
					</td>
					<td colspan="2">
					<img src="images/ico/add.gif" alt="添加子菜单" width="19px;" height="20px;" onclick="javascript:location.href='addmenuchildpane.do?menuId=${menu.menuId}'">&nbsp;&nbsp;
						<img src="images/ico/update.gif" alt="修改子菜单" width="19px;" height="20px;" onclick="javascript:location.href='modemenu.do?menuId=${menu.menuId}'">&nbsp;&nbsp;
						<img src="images/ico/del.gif" alt="删除菜单" width="19px;" height="20px;" onclick="delPath('delmenuval.do?menuId=${menu.menuId}');">
					</td>
				</tr>
				</#list>
				<tr class="a1" style="border:0px;background:#D4DCD6;"><td colspan="4" style="padding-top:10px;text-align: right;"><a href="#">上一页</a>&nbsp;&nbsp;<a href="#">下一页</a> &nbsp;&nbsp;<font color="#336600" style="font-weight:bolder">当前第1页&nbsp;</p></td></tr>
			</table>
		</div>
	</body>
</html>