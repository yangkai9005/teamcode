function addAuth(){
$("#form1").submit();
}
function getAuthForm(){
 	var form={
 	authName:$("#authname").val(),
 	authLevel:$("#authlevel").val()
 	};
 	return form; 
}

function checkAuth(){
	var form=getAuthForm();
	if(""==form.authName){
		alert("权限名称不能为空");
		return ;
	}
	if(""==form.authLevel){
		alert("权限等级不能为空");
		return ;
	}
	$.post("checkauth.do",{authName:form.authName,authLevel:form.authLevel},function(data){
		if(data==1){
			$("#notice").html("权限名称或等级已经存在!");
			$("#addauth").css("color","white");
			$("#addauth").attr("disabled",true);
		}
		else{
		$("#notice").html("");
		$("#addauth").css("color","green");
		$("#addauth").attr("disabled",false);
		}
	});
}

