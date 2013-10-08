function addUser(){
	var form=userForm();
	if(form.username==""){
		alert("用户名称不能填空!");
		return;
	}
	if(form.userpwd==""){
		alert("用户密码不能为空!");
		return;
	}
	if(form.userpwd.length<6){
		$("#pwdnotice").html("密码长度不能小于6位数");
		return;
	}
	if(form.userpwd.length>=6){
		$("#pwdnotice").html("");
	}
	if(form.userauth=="0"){
		alert("请选择正确的权限!");
		return;
	}
	$("#form1").submit();
}

function checkUser(username){
	if(username==""){
		alert("用户名称不能填空!");
		return;
	}
	$.post("checkuser.do",{username:username},function(data){
		if(data==1){
			$("#usernotice").html("该用户已存在");
			$("#adduser").css("color","white");
			$("#adduser").attr("disabled",true);
		}
		else{
		$("#usernotice").html("");
		$("#adduser").css("color","green");
		$("#adduser").attr("disabled",false);
		}
	});
}

function userForm(){
	var form={
	username:$("#username").val(),
	userpwd:$("#userpwd").val(),
	userauth:$("#userauth").val()
	};
	return form;
}