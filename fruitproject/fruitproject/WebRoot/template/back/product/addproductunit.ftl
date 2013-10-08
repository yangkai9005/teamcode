<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>新增产品计量单位</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" >
			function addUnit(){
				var unitName=$("#unitName").val();
				var unitValue=$("#unitValue").val();
				if(unitName==""){
					alert("单位名称不能为空!");
					return;
				}
				if(unitValue==""){
					alert("单位值不能为空!");
					return;
				}
				$("#form1").submit();
			}
		</script>
	</head>

	<body>
		<div class="ban">
			<div class="ban_1">
				<div style="float:left;padding-top: 7px;">
				当前位置:添加商品计量单位
			</div>
			</div>
		</div>
		<div>
		<form name="form1" id="form1" action="addunitval.do" method="post">
			<table width="50%" id="mytab" border="1" class="t1">
				<tr class="a1" >
					<td width="30%" style="color:#336600;font-size:21px;">
					单位名称:
					</td>
					<td width="80%" style="color:#336600;font-size:21px;text-align:left;">
					<input type='text' class="txt" value=""   name="unitName" id="unitName">
					</td>
				</tr>
				<tr class="a1" >
					<td width="100%" style="color:#336600;font-size:21px;">
					单位值:
					</td>
					<td width="100%" style="color:#336600;font-size:21px;text-align:left;">
					<input type='text' value=""  class="txt" name="unitValue" id="unitValue">
					<font color="red" style="font-weight:normal;">*比如千克需填写kg</font>
					</td>
				</tr>
				<tr class="a1">
					<td width="100%" style="color:#336600;font-size:21px;" colspan="2">
					<input type='button' value="添加" class="btn" style="float:right;background:url('images/btn/btn4.png');width:50px;height:30px;" name="" id="" onclick="addUnit();">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>