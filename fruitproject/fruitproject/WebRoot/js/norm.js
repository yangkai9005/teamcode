function delPath(url){
	if(confirm("确定删除?")){
		location.href=url;
	}
}

function notice(id,mes){
	$("#"+id).html("<font color='red'>"+msg+"</font>");
}

