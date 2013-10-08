<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增产品种类</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript">
		//添加属性
		function addSpeciesAttr() {
	      $("tr:last").after("<tr class=\"a1\"><td width=\"33%\" style=\"font-weight:bold;color:#336600;font-size:16px;\"><input type=\"text\" class=\"txt\" name=\"attrname\" /></td><td width=\"47%\" style=\"font-weight:bold;color:#336600;font-size:16px;\"><input type='text'   class=\"txt\" name=\"attrval\" ></td><td width=\"10%\" style=\"font-weight:bold;color:#336600;font-size:16px;\"><font class=\"del\"><a href=\"javascript:void(0)\" onclick=\"delSpeciesAttr(this)\">删除</a></font></td></tr>");
       }
       function delSpeciesAttr(obj) {
		$(obj).parent().parent().parent().remove();
		}
		
		function addSpecie(){
			var species=getSpeciesInstant();
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
			$("#form1").submit();	
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
		<form name="form1" id="form1" action="addspeciesval.do" method="post">
			<table width="50%" id="mytab" border="1" class="t1">
				<tr class="a1">
					<td width="100%" style="color:#336600;font-size:21px;">
					商家名称:<input type='text' value=""   name="" id="">
					</td>
					<td width="100%" style="color:#336600;font-size:21px;">
					商家地址:<input type='text' value=""  class="txt" name="speciesName" id="speciesname">
					</td>
				</tr>
				
				<tr class="a1">
					<td width="100%" style="color:#336600;font-size:21px;">
					联系人:<input type='text' value=""   name="" id="">
					</td>
					<td width="100%" style="color:#336600;font-size:21px;">
					联系电话:<input type='text' value=""  class="txt" name="speciesName" id="speciesname">
					</td>
				</tr>
				<tr class="a1">
					<td width="100%" style="color:#336600;font-size:21px;" colspan="2">
					经营范围:<input type='text' value=""   name="" id="">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>