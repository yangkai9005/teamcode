<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>权限栏目一览表</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/norm.js"></script>
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/list.js"></script>
	</head>

	<body>
	<div class="path">
		<a href="${base}/admin/common/index.jhtml">权限管理</a> &raquo;<a href="">系统权限管理</a>
	</div>
		<form id="listForm" action="list.jhtml" method="get">
		<div class="bar">
			<a href="addmenupane.do" class="iconButton">
				<span class="addIcon">&nbsp;</span>添加
			</a>
			<div class="buttonWrap">
				<a href="javascript:;" id="deleteButton" class="iconButton disabled">
					<span class="deleteIcon">&nbsp;</span>删除
				</a>
				<a href="javascript:;" id="refreshButton" class="iconButton">
					<span class="refreshIcon">&nbsp;</span>刷新
				</a>
				<div class="menuWrap">
					<a href="javascript:;" id="pageSizeSelect" class="button">
						每页显示<span class="arrow">&nbsp;</span>
					</a>
					<div class="popupMenu">
						<ul id="pageSizeOption">
							<li>
								<a href="javascript:;" class="current" >10</a>
							</li>
							<li>
								<a href="javascript:;" class="current" >20</a>
							</li>
							<li>
								<a href="javascript:;" class="current" >30</a>
							</li>
							<li>
								<a href="javascript:;" class="current" >40</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="menuWrap">
				<div class="search">
					<span id="searchPropertySelect" class="arrow">&nbsp;</span>
					<input type="text" id="searchValue" name="searchValue" value="" maxlength="200" />
					<button type="submit">&nbsp;</button>
				</div>
				<div class="popupMenu">
					<ul id="searchPropertyOption">
						<li>
							<a href="javascript:;" class="current" >名称</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<table id="listTable" class="list">
			<tr>
				<th class="check">
					<input type="checkbox" id="selectAll" />
				</th>
				<th>
					<a href="javascript:;" class="sort" name="name">菜单名称</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="isSystem">子菜单列表</a>
				</th>
				<th>
					<span>操作</span>
				</th>
			</tr>
			<#list menus as menu>
				<tr>
					<td>
						<input type="checkbox" name="ids" title="" value="" />
					</td>
					<td>
						${menu.menuName}
					</td>
					<td>
						<#list menu.menuChilds as menuChild>
							${menuChild.menuChildName}&nbsp;
						</#list>
					</td>
					<td>
						<a href="modemenu.do?menuId=${menu.menuId}">编辑</a>&nbsp;&nbsp;
						<a href="addmenuchildpane.do?menuId=${menu.menuId}">添加子菜单</a>
					</td>
				</tr>
			</#list>
		</table>
	</form>
	</body>
</html>