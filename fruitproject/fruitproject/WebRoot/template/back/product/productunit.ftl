<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增产品</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/norm.js"></script>
		<script language="JavaScript" type="text/javascript" >
			function updateUnit(unitId){
			     var trhtml="";
				 var tds=$("#tr"+unitId+" td");
				 var td3="<a href=\"javascript:void(0)\" onclick=\"saveUnit('"+unitId+"')\">保存</a>&nbsp;&nbsp;&nbsp<font class=\"del\"><a href=\"javascript:void(0)\" onclick=\"delPath('delunit.do?unitId="+unitId+"');\">删除</a></font>";
				 trhtml+="<td width=\"20%\"><input type='text' value='"+$.trim($(tds[0]).text())+"' id='unitname"+unitId+"'\></td>";
				 trhtml+="<td width=\"20%\"><input type='text' value='"+$.trim($(tds[1]).text())+"' id='unitval"+unitId+"'\></td>";
				 trhtml+="<td width=\"30%\">"+td3+"<input type='hidden' value='"+unitId+"' id='unitid"+unitId+"'\></td>";
				 $("#tr"+unitId).html(trhtml);
			}
			
			function saveUnit(unitId){
			     var unitId=$("#unitid"+unitId).val();
			     var unitName=$("#unitname"+unitId).val();
			     var unitValue=$("#unitval"+unitId).val();
			     $.post("updateunit.do",{unitId:unitId,unitName:unitName,unitValue:unitValue},function(data){
			     	if(data==1){
			     		var td3="<a href=\"javascript:void(0)\" onclick=\"updateUnit('"+unitId+"')\">修改</a>&nbsp;&nbsp;&nbsp<font class=\"del\"><a href=\"javascript:void(0)\" onclick=\"delPath('delunit.do?unitId="+unitId+"');\">删除</a></font>";
			     		$("#unitname"+unitId).parent().html(unitName);
			     		$("#unitval"+unitId).parent().html(unitValue);
			     		$("#unitid"+unitId).parent().html(td3);
			     	}
			     	else{
			     		alert("更新失败!");
			     	}
			     });
			}
		</script>
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
				
				<div style="float:left;padding-top: 7px;">
				当前位置:商品计量单位管理
			</div>
			<div style="float:right;text-align:center">
			<img src="images/add.png" onclick="javascript:location.href='addtunitpane.do'" style="cursor:pointer;padding-right:20px;" title="添加计量单位">
			</div>
			</div>
		</div>
		<div>
		<form id="form1" method="post" action="">
			<table width="70%" id="mytab" border="1" class="t1">
				<tr class="a1">
				<thead>
					<th width="20%" style="font-weight:bold">
						商品单位名称
					</th>
					<th width="20%" style="font-weight:bold">
						商品单位值
					</th>
					<th width="30%" style="font-weight:bold">
						操作
					</th>
				</thead>
				</tr>
				<#if (units?size==0)>
					<tr class="a1">
						<td colspan="3">
							<font color="red">没有商品计量单位</font>
						</td>
					</tr>
				</#if>
				<#list units as unit>
				<tr class="a1" id="tr${unit.unitId}">
				<td width="20%">
				${unit.unitName}
					</td>
					<td width="20%">
					${unit.unitValue}
					</td>
					<td width="30%">
					<a href="javascript:void(0)" onclick="updateUnit('${unit.unitId}')">修改</a>&nbsp;&nbsp;&nbsp<font class="del"><a href="javascript:void(0)" onclick="delPath('delunit.do?unitId=${unit.unitId}');">删除</a></font>
					</td>
					</tr>
				</#list>
				<tr class="a1" style="border:0px;background:#D4DCD6;"><td colspan="3" style="padding-top:10px;text-align: right;"><a href="#">上一页</a>&nbsp;&nbsp;<a href="#">下一页</a> &nbsp;&nbsp;<font color="#336600" style="font-weight:bolder">当前第1页&nbsp;</p></td></tr>
			</table>
			</form>
		</div>
	</body>
</html>