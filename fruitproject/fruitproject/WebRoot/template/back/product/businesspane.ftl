<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增产品</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<link href="css/qtip.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/jquery.qtip-1.0.0-rc3.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/qtip.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/norm.js"></script>
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
				
				<div style="float:left;padding-top: 7px;">
				当前位置:商家管理
			</div>
			
			<div style="float:right;text-align:center">
			<img src="images/add.png" onclick="javascript:location.href='addbusinesspane.do'" style="cursor:pointer;padding-right:20px;" title="添加商家">
			</div>
			</div>
		</div>
		<div>
			<table width="70%" id="mytab" border="1" class="t1">
				<tr class="a1">
				<thead>
					<th width="40%" style="font-weight:bold">
						商家名称
					</th>
					<th width="10%" style="font-weight:bold">
						商家名片
					</th>
					<th width="20%" style="font-weight:bold">
						操作
					</th>
				</thead>
				</tr>
				
				<#if (businesses?size==0)>
					<tr class="a1">
						<td colspan="3">
							<font color="red">没有商家信息</font>
						</td>
					</tr>
				</#if>
				
				<#list businesses as business>
				<tr class="a1">
						<td>
							${business.businessName}
						</td>
						<td>
						<a href="javascript:void(0)" rel="getbusinessbyid.do?businessId=${business.businessId}" title="名片" alt="名片" class="detail">商家名片</a>
						</td>
						<td>
							<a href="updatebusinesspane.do?businessId=${business.businessId}">修改</a>&nbsp;&nbsp;&nbsp<font class="del"><a href="javascript:void(0);" onclick="delPath('delbusiness.do?businessId=${business.businessId}')">删除</a></font>
						</td>
					</tr>
				</#list>
					<tr class="a1" style="border:0px;background:#D4DCD6;"><td colspan="3" style="padding-top:10px;text-align: right;"><a href="#">上一页</a>&nbsp;&nbsp;<a href="#">下一页</a> &nbsp;&nbsp;<font color="#336600" style="font-weight:bolder">当前第1页&nbsp;</p></td></tr>
				
			</table>
		</div>
	</body>
</html>