<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增产品</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
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
		<form name="business" id="business" action="addbusinessval.do" method="post">
			<table width="100%" id="mytab" border="1" class="t1">
				<tr class="a1">
					<td width="30%" style="color:#336600;">
					商家名称:
					</td>
					<td width="70%" style="color:#336600;" align="left">
					<input type='text' value="" class="txt"   name="businessName" id="businessName" style="width:100%">
					</td>
					<td width="30%" style="color:#336600;">
					商家地址:
					</td>
					<td width="70%" style="color:#336600;" align="left">
					<input type='text' value=""  class="txt" name="businessAddr" id="businessAddr" style="width:100%">
					</td>
				</tr>
				
				<tr class="a1">
					<td width="30%" style="color:#336600;">
					联系人:
					</td>
					<td width="70%" style="color:#336600;" align="left">
					<input type='text' value=""  class="txt" name="businessPerson" id="businessPerson" style="width:100%">
					</td>
					<td width="30%" style="color:#336600;">
					联系电话:
					</td>
					<td width="70%" style="color:#336600;" align="left">
					<input type='text' value=""  class="txt" name="businessTel" id="businessTel" style="width:100%">
					</td>
				</tr>
				<tr class="a1">
					<td width="30%" style="color:#336600;">
					经营范围:
					</td>
					<td width="70%" style="color:#336600;text-align: left" colspan="3" >
					<textarea rows="6" cols="100%" class="txt" name="businessOpeartingRange" id="businessOpeartingRange"></textarea>
					</td>
				</tr>
				<tr class="a1">
					<td width="70%" style="color:#336600;" colspan="4" align="right">
					<input type='submit' value="添加" class="btn" style="float:right;background:url('images/btn/btn4.png');width:50px;height:30px;" name="" id="" >
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>