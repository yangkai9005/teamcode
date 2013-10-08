<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>菜单管理</title>
    <script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
<script language="JavaScript" type="text/javascript" src="js/navbar.js"></script>
<link href="css/navbar-pix.css" rel="stylesheet" type="text/css" />
</head>
<body>
<script language="JavaScript" type="text/JavaScript">
var show = true;
var hide = false;
//修改菜单的上下箭头符号
function my_on(head,body)
{
	var tag_a;
	for(var i=0;i<head.childNodes.length;i++)
	{
		if (head.childNodes[i].nodeName=="A")
		{
			tag_a=head.childNodes[i];
			break;
		}
	}
	tag_a.className="on";
}
function my_off(head,body)
{
	var tag_a;
	for(var i=0;i<head.childNodes.length;i++)
	{
		if (head.childNodes[i].nodeName=="A")
		{
			tag_a=head.childNodes[i];
			break;
		}
	}
	tag_a.className="off";
}
//添加菜单	
window.onload=function(menu,menuchild)
{
	var menuChild=$("div[name='menuChild']");
	var menu=$("div[name='menu']").each(function (i, o) {
	   var state=hide;
		if(i==0){
			state=show;
		}
		var m =new Menu(o.id,menuChild[i].id,'dtu','100',state,my_on,my_off);
	    m.init();
	});
	/**m2 =new Menu("menu2",'menu2_child','dtu','100',hide,my_on,my_off);
	m2.init();
	m3 =new Menu("menu3",'menu3_child','dtu','100',hide,my_on,my_off);
	m3.init();
	m4 =new Menu("menu4",'menu4_child','dtu','100',hide,my_on,my_off);
	m4.init();
	m5 =new Menu("menu5",'menu5_child','dtu','100',hide,my_on,my_off);
	m5.init();
	m6 =new Menu("menu6",'menu6_child','dtu','100',hide,my_on,my_off);
	m6.init();
	m7 =new Menu("menu7",'menu7_child','dtu','100',show,my_on,my_off);
	m7.init();**/
}

function openFrame(addr){
window.parent.frames['workspace'].location=addr;
}
</script>
<noscript title="系统提示">
<div class="tit" id="menu0" ><a href="" class="on"  title="折叠菜单" name="nojs" id="nojs" >系统提示</a> </div>
<div class="list" id="menu0_child">
	<p><strong>您的设备不支持js,不能使用菜的折叠功能</strong></p>
</div>
</noscript>
<#list menus as menu>
<div id="menu">
	<div class="tit" id="menu${menu.menuId}" val="${menu.menuId}" name="menu" title="菜单标题">
		<div  id="pc"+${menu.menuId} ></div>
		<a href="#nojs"  title="折叠菜单" target="" class="on" id="menuname${menu.menuId}">${menu.menuName}</a> </div>
	<div class="list" id="menu_child${menu.menuId}" title="菜单功能区" name="menuChild">
		<ul>
		<#list menu.menuChilds as menuChild>
			<li id="menuChild${menuChild.menuChildId}" ><a href="javascript:void(0)" onclick="openFrame('${menuChild.menuChildAddr}')">${menuChild.menuChildName}</a></li>
			</#list>
		</ul>
	</div>
</#list>
	<div class="tit" id="menu7" title="菜单标题" >
		<div class="titpic" id="pc7"></div>
		<a href="" title="折叠菜单" class="on" id="menu7_a" >关于</a> </div>
	<div class="list" id="menu7_child" title="菜单功能区">
		<ul id="auth" >
			<li></li>
			<li>版本：1.0</li>
			<li>版权所有:嗨皮科技</li>
		</ul>
	</div>
</div>

</body>
</html>
