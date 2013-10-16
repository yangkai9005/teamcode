<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>用户栏</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/list.js"></script>
	</head>

	<body>
		<div class="path">
		<a href="${base}/admin/common/index.jhtml">权限管理</a> &raquo;<a href="">系统用户管理</a>
	</div>
		<form id="listForm" action="list.jhtml" method="get">
		<div class="bar">
			<a href="adduserpane.do" class="iconButton">
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
					<a href="javascript:;" class="sort" name="name">用户名称</a>
				</th>
				<th>
					用户权限
				</th>
				<th>
					操作
				</th>
			</tr>
			<#list users as user>
				<tr>
					<td>
						<input type="checkbox" name="ids" title="" value="" />
					</td>
					<td>
						${user.systemUserName}
					</td>
					<td>
						${user.auth.systemAuthName}&nbsp;
					</td>
					<td>
						编辑
					</td>
				</tr>
			</#list>
		</table>
	</form>
	</body>
</html>