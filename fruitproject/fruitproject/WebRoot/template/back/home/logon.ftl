<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>登录界面</title>

		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="this is my page">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/logon.css">
		<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script type="text/javascript">
		if (top.location != self.location){ 
         	top.location=self.location; 
        } 
		$(document).keyup(function(event){
  			if(event.keyCode ==13){
  				$("#btn_logon").focus();
    			logon();
  			}
		});
		function logon(){
			$.post("userlogon.do",{username:$("#username").val(),userpwd:$("#userpwd").val()},function(data){
				if(data==0){
					location.href="frt-bk-index.do";
				}
				if(data==1){
					alert("密码错误");
				}
				if(data==2){
					alert("用户不存在");
				}
			});
		}
		</script>
	</head>

	<body>
	<form id="form1" method="post">
		<div style="position: absolute;">
			<!-- 文本框 -->
			<div class="txt_name">
				<input type="text" id="username" name="username" class="txt" tabindex="1">
			</div>
			<div class="txt_pwd">
				<input type="password" id="userpwd" name="userpwd" class="txt"  tabindex="2">
			</div>
			<!-- 按钮 -->
			<div class="btn_logon">
				<input type="button" value="登陆" id="btn_logon" class="btn blue big" onclick="logon();" tabindex="3">
			</div>
			<div class="btn_reset">
				<input type="reset" value="重置" id="btn_reset" class="btn blue big" tabindex="4">
			</div>
		</div>
		</form>
	</body>
</html>
