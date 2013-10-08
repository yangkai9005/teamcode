<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增产品</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" >
			var beforeId;
			function viewAttr(id){
				$("#species"+beforeId).css("display","none");
				$("#species"+id).css("display","block");
				beforeId=id;				
			}
		</script>
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
			<div style="float:left;padding-top: 7px;">
				当前位置:采购商品
			</div>
				
			</div>
		</div>
		<div>
		<form name="business" id="business" action="addbusinessval.do" method="post">
			<table width="100%" id="mytab" border="1" class="t1">
				<tr class="a1">
					<td width="30%" style="color:#336600;">
					商品名称:
					</td>
					<td width="70%" style="color:#336600;" align="left">
					<input type='text' value="" class="txt"   name="businessName" id="businessName" style="width:100%">
					</td>
					<td width="30%" style="color:#336600;">
					商品数量:
					</td>
					<td width="70%" style="color:#336600;" align="left">
					<input type='text' value=""  class="txt" name="businessAddr" id="businessAddr" style="width:20%">
					<select>
					<#list units as unit>
					<option value="${unit.unitValue}">${unit.unitName}</option>
					</#list>
					</select>
					</td>
					<td width="30%" style="color:#336600;">
					商品等级:
					</td>
					<td width="70%" style="color:#336600;" align="left">
					<select><option value="">请选择商品等级</option><option>一级</option><option>二级</option><option>三级</option></select>
					</td>
				</tr>
				
				<tr class="a1">
					<td width="30%" style="color:#336600;">
					商品种类:
					</td>
					<td width="70%" style="color:#336600;" align="left">
					<select onchange="viewAttr(this.value)">
					<option value="">请选择商品种类</option>
					<#list specieses as species>
					<option value="${species.productSpeciesValue}">${species.productSpeciesName}</option>
					</#list>
					</select>
					</td>
					
					<td width="30%" style="color:#336600;">
					商品进价:
					</td>
					<td width="70%" style="color:#336600;" align="left">
					<input type='text' value="" class="txt"   name="businessName" id="businessName" style="width:40%">元
					</td>
					
					<td width="70%" style="color:#336600;" align="left" >
					采购人员:
					</td>
					<td width="70%" style="color:#336600;" align="left" >
					<input type='text' value="" class="txt"   name="businessName" id="businessName" style="width:40%">
					</td>
				</tr>
				<tr class="a1">
					<td width="30%" style="color:#336600;">
					商品属性:
					</td>
					<td width="70%" style="color:#336600;text-align: left" colspan="5" >
					<#list specieses as species>
						<div id="species${species.productSpeciesValue}" style="display: none;">
						<#list species.attrList as attr>
							<div style="width:20%;float:left">${attr.speciesAttrName}:</div>
							<div><input type="text" value="" class="txt"   name="species${species.productSpeciesValue}" id="speicesattr${attr.speciesAttrId}" /></div>
						</#list>
						</div>
					</#list>
					</td>
				</tr>
				
				
				
				
				<tr class="a1">
					<td width="30%" style="color:#336600;">
					商品描述:
					</td>
					<td width="70%" style="color:#336600;text-align: left" colspan="6" >
					<textarea rows="6" cols="76%" class="txt" name="businessOpeartingRange" id="businessOpeartingRange"></textarea>
					</td>
				</tr>
				<tr class="a1">
					<td width="70%" style="color:#336600;" colspan="6" align="right">
					<input type='submit' value="添加" class="btn" style="float:right;background:url('images/btn/btn4.png');width:50px;height:30px;" name="" id="" >
					</td>
				</tr>
			</table>
		</form>
		</div>
	</body>
</html>