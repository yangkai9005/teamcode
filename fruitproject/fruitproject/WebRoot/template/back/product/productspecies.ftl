<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>商品种类管理</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<link href="css/qtip.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/jquery.qtip-1.0.0-rc3.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/qtip.js"></script>
		

	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
				<div style="float:left;padding-top: 7px;">
				当前位置:商品种类管理
			</div>
			<div style="float:right;text-align:center">
			<img src="images/add.png" onclick="javascript:location.href='addspeciespane.do'" style="cursor:pointer;padding-right:20px;" title="添加商品种类">
			</div>
			</div>
		</div>
		<div>
		<div style="padding-top:3px;">
			<table width="70%" id="mytab" border="1" class="t1">
				<tr class="a1">
				<thead>
					<th width="20%" style="font-weight:bold">
						商品种类名称
					</th>
					<th width="30%" style="font-weight:bold">
						商品种类操作
					</th>
				</thead>
				</tr>
				<#if (speciesList?size==0)>
					<tr class="a1">
						<td colspan="2">
							<font color="red">没有商品种类项</font>
						</td>
					</tr>
				</#if>
				
				<#list speciesList as species>
				<tr class="a1">
					<td width="20%">
					${species.productSpeciesName}
					</td>
					<td width="30%">
					<a href="javascript:void(0)" rel="getspeciesattr.do?speciesId=${species.productSpeciesId}" title="详情" class="detail">详情</a>&nbsp;&nbsp;&nbsp<a href="#">修改</a>&nbsp;&nbsp;&nbsp<font class="del"><a href="#">删除</a></font>
					</td>
				</tr>
				</#list>
				<tr class="a1" style="border:0px;background:#D4DCD6;"><td colspan="2" style="padding-top:10px;text-align: right;"><a href="#">上一页</a>&nbsp;&nbsp;<a href="#">下一页</a> &nbsp;&nbsp;<font color="#336600" style="font-weight:bolder">当前第1页&nbsp;</p></td></tr>
			</table>
		</div>
	</body>
</html>