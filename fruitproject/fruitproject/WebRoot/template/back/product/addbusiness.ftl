<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增商家</title>
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script type="text/javascript" src="js/jquery.validate.js"></script>
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/common.js"></script>
		<script type="text/javascript" src="js/input.js"></script>
		<script type="text/javascript" src="js/jquery.tools.js"></script>
		<script type="text/javascript" src="js/kindeditor.js"></script>
		<script type="text/javascript" src="js/menu.js"></script>
	</head>
	<body onload="displayAddBtn('menuName','addmenu');">
		<div class="path">
		<a href="${base}/admin/common/index.jhtml">采购管理</a> &raquo;<a href="">新增商家</a>
	</div>
	<form id="inputForm" action="addbusinessval.do" method="post">
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>商家名称:
				</th>
				<td>
					<input type="text" name="businessName" id="businessName" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					商品地址:
				</th>
				<td>
					<input type="text" name="businessAddr" id="businessAddr" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					联系人:
				</th>
				<td>
					<input type="text" name="businessPerson" id="businessPerson" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					联系电话:
				</th>
				<td>
					<input type="text" name="businessTel" id="businessTel" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					经营范围:
				</th>
				<td>
					<textarea id="editor" name="businessOpeartingRange" id="businessOpeartingRange" class="editor"></textarea>
				</td>
			</tr>
			<tr>
				<th>
					&nbsp;
				</th>
				<td>
					<input type="submit" class="button" value="确定" />
					<input type="button" id="backButton" class="button" value="返回" />
				</td>
			</tr>
		</table>
	</form>
	</body>
</html>