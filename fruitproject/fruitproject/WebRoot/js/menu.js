//子菜单入库校验
function childMenuCharge(name1,name2,menuChild) {
	var menuChildAddr = $("input[name^='"+name1+"']");
	var menuChildName = $("input[name^='"+name2+"']");
	$("input[name^='"+name1+"']").each(function (i, o) {
		if (menuChildName[i].value == ""||menuChildAddr[i].value == "") {
			alert("所填写内容不能为空!");
			return;
		}
		if(i==(menuChildName.length-1)){
		$("#"+menuChild).submit();
		}
	});
}
//添加子菜单
function addChildMenuColum() {
	$("tr:last").after("<tr class=\"a1\"><td width=\"40%\"><input type=\"text\" class=\"txt\" name=\"menuChildName\" /></td><td width=\"40%\"><input type=\"text\" class=\"txt\" name=\"menuChildAddr\" /></td><td width=\"20%\"><img src=\"images/ico/del.gif\" alt=\"\u5220\u9664\u83dc\u5355\" width=\"19px;\" height=\"20px;\" onclick=\"delColum(this,'menuChildAddr','addchildmenu')\"></td></tr>");
	displayAddBtn('menuChildAddr','addchildmenu');
}
function addMenuColum() {
	$("tr:last").after("<tr class=\"a1\"><td width=\"40%\"><input type=\"text\" class=\"txt\" name=\"menuName\" /></td><td width=\"20%\"><img src=\"images/ico/del.gif\" alt=\"\u5220\u9664\u83dc\u5355\" width=\"19px;\" height=\"20px;\" onclick=\"delColum(this,'menuName','addmenu')\"></td></tr>");
	displayAddBtn('menuName','addmenu');
}
//删除实例
function delColum(obj,name,id) {
	$(obj).parent().parent().remove();
	displayAddBtn(name,id);
}
//是否显示添加按钮框
function displayAddBtn(name,id) {
	var menuChildAddr = $("input[name^='"+name+"']");
	if (menuChildAddr.length > 0) {
		$("#"+id).css("display", "block");
	} else {
		$("#"+id).css("display", "none");
	}
}

