<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>商家名片</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
	</head>

	<body>
		<div>
			<table width="50%" id="mytab" border="1" class="t1">
				<tr class="a1">
						<td>
							商家名称:${business.businessName}
						</td>
						<td>
						商家地址:${business.businessAddr}
						</td>
						<td>
						联系人:${business.businessAddr}
						</td>
						<td>
						联系电话:${business.businessTel}
						</td>
						<td>
						商家经营范围:${business.businessOpeartingRange}
						</td>
					</tr>
			</table>
		</div>
	</body>
</html>