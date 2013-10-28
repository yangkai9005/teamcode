<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增产品</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<link href="css/qtip.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/jquery.qtip-1.0.0-rc3.js"></script>
		<script type="text/javascript" src="js/common.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/qtip.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/norm.js"></script>
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/list.js"></script>
	</head>

	<body>
		<div class="path">
		<a href="${base}/admin/common/index.jhtml">采购管理</a> &raquo;<a href="">商品种类管理</a>
	</div>
		<form id="listForm" action="list.jhtml" method="get">
		<div class="bar">
			<a href="addbusinesspane.do" class="iconButton">
				<span class="addIcon">&nbsp;</span>添加
			</a>
			<div class="buttonWrap">
				<a href="javascript:;" id="deleteButton" class="iconButton disabled" onClick="delFun('delbusinessunit.do');">
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
					<a href="javascript:;" class="sort" name="name">商家名称</a>
				</th>
				<th>
					商家名片
				</th>
				<th>
					操作
				</th>
			</tr>
			<#list businesses as business>
				<tr>
					<td>
						<input type="checkbox" name="ids" title="" value="${business.businessId}" />
					</td>
					<td>
						${business.businessName}
					</td>
					<td>
						<a href="javascript:void(0)" rel="getbusinessbyid.do?businessId=${business.businessId}" title="名片" alt="名片" class="detail">商家名片</a>
					</td>
					<td>
						<a href="updatebusinesspane.do?businessId=${business.businessId}">编辑</a>
					</td>
				</tr>
			</#list>
		</table>
	</form>
	</body>
</html>