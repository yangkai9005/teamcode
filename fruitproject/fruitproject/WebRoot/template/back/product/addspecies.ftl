<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增产品种类</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script type="text/javascript" src="js/jquery.validate.js"></script>
		<link href="css/common.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="js/common.js"></script>
		<script type="text/javascript" src="js/input.js"></script>
		<script language="JavaScript" type="text/javascript">
		//添加属性
		function addSpeciesAttr() {
	     //$("tr[name='addSpecie']:last").after("<tr class=\"a1\"><td width=\"33%\" style=\"font-weight:bold;color:#336600;font-size:16px;\"><input type=\"text\" class=\"txt\" name=\"attrname\" /></td><td width=\"47%\" style=\"font-weight:bold;color:#336600;font-size:16px;\"><input type='text'   class=\"txt\" name=\"attrval\" ></td><td width=\"10%\" style=\"font-weight:bold;color:#336600;font-size:16px;\"><font class=\"del\"><a href=\"javascript:void(0)\" onclick=\"delSpeciesAttr(this)\">删除</a></font></td></tr>");
		 var nameObj=$("<td style='text-align:center;'><input type='text' name='attrname' /></td>");
		 var valueObj=$("<td style='text-align:center;'><input type='text' name='attrval' /></td>");
		 var delObj=$("<td style='text-align:center;'><a href='javascript:void(0);' onclick='delSpeciesAttr(this);'>删除</a></td>");
		 var trObj=$("<tr name='addSpecie'>").append(nameObj).append(valueObj).append(delObj);
		 $("table[name='addSpecie']").append(trObj);
       }
       
       function delSpeciesAttr(obj) {
		$(obj).parent().parent().remove();
		}
		
		function addSpecie(){
			var species=getSpeciesInstant();
			console.log(species);
			if(species.speciesname==""){
				alert("种类名称不能为空");
				return ;
			}
			
			if(species.attrname.length==0){
				alert("商品种类不能没有属性");
				return ;
			}
			if(species.nameHasEmpty){
				alert("商品种类属性名称不能为空");
				return ;
			}
			if(species.attrHasEmpty){
				alert("商品种类属性值不能为空");
				return ;
			}
			
			var attrname=$("input[name='attrname']").map(function(){return $(this).val()}).get().join(",");
			var attrval=$("input[name='attrval']").map(function(){return $(this).val()}).get().join(",");
			var speciesName=$("input[name='speciesName']").serialize();
			alert(attrname+"----"+attrval+"----"+speciesName);
			window.location.href="addspeciesval.do?"+speciesName+"&attrname="+attrname+"&attrval="+attrval;
			//$("#form1").submit();	
		}
		function getSpeciesInstant(){
		var names=$("input[name='attrname']");
		var vals=$("input[name='attrval']");
		var nameEmpty=checkHasEmpty(names);
		var attrEmpty=checkHasEmpty(vals);
		var species={
					speciesname:$("#speciesname").val(),
					attrname:names,
					attrval:vals,
					nameHasEmpty:nameEmpty,
					attrHasEmpty:attrEmpty
			}
			return species;
		}
		
		function checkHasEmpty(array){
			if(array.length==0){
				return true;
			}
			for(i=0;i<array.length;i++)
			{
				if(array[i].value==""){
					return true;
				}
			}
			return false;
		}
		</script>
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
				<div style="float:left;padding-top: 7px;">
				当前位置:添加商家信息
			</div>
			</div>
		</div>
		<div>
		<form id="inputForm" action="addspeciesval.do" method="post">
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>类别名称:
				</th>
				<td>
					<input type="text" name="speciesName" class="text" maxlength="200" />
				</td>
			</tr>
			
			<tr style="min-height:400px;">
				<th>
					<span class="requiredField">*</span>类别属性:
				</th>
				<td>
					<table name="addSpecie">
						<tr onclick="addSpeciesAttr();" title="添加属性">
							<th style="text-align:center;">属性名称</th>
							<th style="text-align:center;">属性值</th>
							<th style="text-align:center;">操作</th>
						</tr>
						<tr>
							<td style="text-align:center;"><input type="text" name="attrname" /></td>
							<td style="text-align:center;"><input type="text" name="attrval" /></td>
							<td style="text-align:center;"><a href="javascript:void(0);" onclick="delSpeciesAttr(this);">删除</a></td>
						</tr>
					</table>
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input style="margin-left:10%;" type="button" class="button" value="确定" onclick="addSpecie();" />
					<input type="button" id="backButton" class="button" value="返回" />
				</td>
			</tr>
		</table>
	</form>
	</body>
</html>