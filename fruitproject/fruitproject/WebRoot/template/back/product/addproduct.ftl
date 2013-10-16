<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增产品</title>
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script type="text/javascript" src="js/jquery.validate.js"></script>
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/input.js"></script>
		<script type="text/javascript" src="js/jquery.tools.js"></script>
		<script type="text/javascript" src="js/kindeditor.js"></script>
	</head>
	<body onload="displayAddBtn('menuName','addmenu');">
		<div class="path">
		<a href="${base}/admin/common/index.jhtml">采购管理</a> &raquo;<a href="">新增采购</a>
	</div>
	<form id="inputForm" action="addbusinessval.do" method="post">
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>商品名称:
				</th>
				<td>
					<input type="text" name="businessName" id="businessName" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					商品种类:
				</th>
				<td>
					<select onchange="viewAttr(this.value)">
					<option value="">请选择商品种类</option>
					<#list specieses as species>
					<option value="${species.productSpeciesValue}">${species.productSpeciesName}</option>
					</#list>
					</select>
				</td>
			</tr>
			<tr>
				<th>
					商品进价:
				</th>
				<td>
					<input type="text" name="businessName" id="businessName" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					商品数量:
				</th>
				<td>
					<input type="text" name="businessAddr" id="businessAddr" class="text" maxlength="200" />
					<select>
					<#list units as unit>
					<option value="${unit.unitValue}">${unit.unitName}</option>
					</#list>
					</select>
				</td>
			</tr>
			<tr>
				<th>
					商品等级:
				</th>
				<td>
					<select><option value="">请选择商品等级</option><option>一级</option><option>二级</option><option>三级</option></select>
				</td>
			</tr>
			<tr>
				<th>
					采购人员:
				</th>
				<td>
					<input type="text" name="businessName" id="businessName" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					商品描述:
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