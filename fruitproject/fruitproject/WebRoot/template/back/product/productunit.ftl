<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增计量单位</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/norm.js"></script>
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/list.js"></script>
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
		<div class="path">
		<a href="${base}/admin/common/index.jhtml">采购管理</a> &raquo;<a href="">计量单位管理</a>
	</div>
		<form id="listForm" action="list.jhtml" method="get">
		<div class="bar">
			<a href="addtunitpane.do" class="iconButton">
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
					<a href="javascript:;" class="sort" name="name">商品单位名称</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="isSystem">商品单位值</a>
				</th>
				<th>
					操作
				</th>
			</tr>
			<#list units as unit>
				<tr>
					<td>
						<input type="checkbox" name="ids" title="" value="" />
					</td>
					<td>
						${unit.unitName}
					</td>
					<td>
						${unit.unitValue}
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