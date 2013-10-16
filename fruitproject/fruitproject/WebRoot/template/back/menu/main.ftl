<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title></title>
<meta name="author" content="SHOP++ Team" />
<meta name="copyright" content="SHOP++" />
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="css/main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
<style type="text/css">
*{
	font: 12px tahoma, Arial, Verdana, sans-serif;
}
html, body {
	width: 100%;
	height: 100%;
	overflow: hidden;
}
</style>
<script type="text/javascript">
$().ready(function() {

	var $nav = $("#nav a:not(:last)");
	var $menu = $("#menu dl");
	var $menuItem = $("#menu a");
	
	$nav.click(function() {
		var $this = $(this);
		$nav.removeClass("current");
		$this.addClass("current");
		var $currentMenu = $($this.attr("href"));
		$menu.hide();
		$currentMenu.show();
		return false;
	});
	
	$menuItem.click(function() {
		var $this = $(this);
		$menuItem.removeClass("current");
		$this.addClass("current");
	});

});
</script>
</head>
<body>
	<script type="text/javascript">
		if (self != top) {
			top.location = self.location;
		};
	</script>
	<table class="main">
		<tr>
			<th class="logo">
				<a href="main.jhtml">
					<!--<img src="images/header_logo.gif" alt="SHOP++" />-->
				</a>
			</th>
			<th>
				<div id="nav" class="nav">
					<ul>
					<#list menus as menu>
								<li>
									<a href="#${menu.menuId}">${menu.menuName}</a>
								</li>
					</#list>
						<li>
							<a href="frt-bk-index.do" target="_blank">首页</a>
						</li>
					</ul>
				</div>
				<div class="link">
				</div>
				<div class="link">
					<strong style="color:red">${user}</strong>
					您好!
					<a href="../profile/edit.jhtml" target="iframe">[账号设置]</a>
					<a href="../logout.jsp" target="_top">[注销]</a>
				</div>
			</th>
		</tr>
		<tr>
			<td id="menu" class="menu">
			<#list menus as menu>
				<#if menu_index==0>
				<dl id="${menu.menuId}" class="default">
					<dt>${menu.menuName}</dt>
					<#list menu.menuChilds as menuChild>
						<dd>
							<a href="${menuChild.menuChildAddr}" target="iframe">${menuChild.menuChildName}</a>
						</dd>
					</#list>
				</#if>
				</dl>
				<dl id="${menu.menuId}">
					<dt>${menu.menuName}</dt>
					<#list menu.menuChilds as menuChild>
						<dd>
							<a href="${menuChild.menuChildAddr}" target="iframe">${menuChild.menuChildName}</a>
						</dd>
					</#list>
				</dl>
				</#list>
			</td>
			<td>
				<iframe id="iframe" name="iframe" src="index.jhtml" frameborder="0"></iframe>
			</td>
		</tr>
	</table>
</body>

</html>