<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>权限栏目一览表</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/norm.js"></script>
		<script type="text/javascript" src="js/list.js"></script>
	</head>

	<body>
	<div class="path">
		<a href="">权限管理</a> &raquo;<a href="">系统权限管理</a>
	</div>
		<form id="listForm" action="list.jhtml" method="get">
		<div class="bar">
			<a href="addauthpane.do" class="iconButton">
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
					<a href="javascript:;" class="sort" name="name">角色名称</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="isSystem">等级</a>
				</th>
				<th>
					<span>菜单栏目</span>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="createDate">创建时间</a>
				</th>
				<th>
					<span>操作</span>
				</th>
			</tr>
			<#list auths as auth>
				<tr>
					<td>
						<input type="checkbox" name="ids" <#if auth.systemAuthLevel==1> title="超级管理员不能被删除" 
						disabled="disabled" <#else> value="${auth.system_auth_id}" </#if> />
					</td>
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
						2013-10-13 12:12:12
					</td>
					<td>
						<a href="updateauthpane.do?authId=${auth.systemAuthId}">编辑</a>
					</td>
				</tr>
			</#list>
		</table>
	</form>
	</body>
</html>