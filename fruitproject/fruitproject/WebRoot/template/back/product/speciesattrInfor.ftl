<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>商品种类属性</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	</head>

	<body>
	<table width="100%" id="mytab" border="1" class="t1">
	<tr class="a1">
					<td width="100%" >
					属性名:
					</td>
					<td width="100%" >
					 属性值
					</td>
				</tr>
	<#list attrList as attr>
				<tr class="a1">
					<td width="100%" >
					${attr.speciesAttrName}
					</td>
					<td width="100%" >
					 ${attr.speciesAttrFlag}
					</td>
				</tr>
		</#list>
			</table>
		
		
		
	</body>
</html>