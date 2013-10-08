<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>权限栏目一览表</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link href="css/norm.css" rel="stylesheet" type="text/css" />
		<script language="JavaScript" type="text/javascript" src="js/jquery-1.6.2.js"></script>
		<script language="JavaScript" type="text/javascript" src="js/auth.js"></script>
		<script type="text/javascript">
		var allHavaOptions;
		function addOneItem(id,other){
		var obj=$("#"+id).find("option:selected");
		var val=obj.val();
		if(!(obj.val()==""||obj.val()===undefined)){
		$("#"+other).append("<option value='"+obj.val()+"'>"+obj.text()+"</option>");
		obj.remove();
		}
		
		}
		function addAllItem(id,other){
		var obj=$("#"+id);
		$("#"+other).append(obj.html());
		obj.empty();
		}
		
		function loadOption(){
			allHavaOptions=$("#all option");
		}
		
		function addOptions(){
			var addIndex=0;
			var delIndex=0;
			var addOptions=new Array();
		    var delOptions=new Array();
		    var allOptions=$("#all option");//最后已经拥有的权限
		    var otherOptions=$("#other option");
		    
		    
		    for(i=0;i<allOptions.length;i++){//开始加载的时候所有已经有的权限
		    	 val1=allOptions[i].value;
		    	if(!checkExist(allHavaOptions,val1)){//如果在之前的权限中不存在，则需要继续判断
		    		addOptions[addIndex]=val1;
		    		addIndex++;
		    	}
		    }
		    
		     for(k=0;k<allHavaOptions.length;k++){//判断之前的值,
		    	 val2=allHavaOptions[k].value;
		    	if(checkExist(otherOptions,val2)){//如果在other中存在则是需要删除的选项
		    		delOptions[delIndex]=val2;
		    		delIndex++;
		    	}
		    }
		    location.href="updateauthval.do?addMenus="+addOptions+"&delMenus="+delOptions+"&authId="+$("#authId").val();
		}
		
		function checkExist(array,val){
			for(j=0;j<array.length;j++){
				var valTemp=array[j].value;
				if(valTemp==val){
					return true;
				}
			}
			return false;
		}
		
		</script>
	</head>

	<body onload="loadOption()">
		<div class="ban">
			<div class="ban_1">
				<div style="float:left;padding-top: 7px;">
				当前位置:修改权限
			</div>
			</div>
		</div>
		<div>
		<form id="form1" method="post" action="updateauthval.do">
			<table width="60%" id="mytab" border="1" class="t1">
				<tr class="a1">
					<td style="font-weight:bold">
						权限名称
					</td>
					<td colspan="2" >
					<input type="hidden" value="${auth.systemAuthId}" id="authId">
					<font color="red">${auth.systemAuthName}</font>
					</td>
				</tr>
				
				<tr class="a1">
					<td style="font-weight:bold">
						权限描述
					</td>
					<td colspan="2" >
					<font color="red">${auth.systemAuthDesc}</font>
					</td>
				</tr>
				<tr class="a1">
					<td style="font-weight:bold">
						已添加的菜单:
					</td>
					<td style="font-weight:bold">
						操作
					</td>
					<td  style="font-weight:bold">
					尚未添加的菜单:
					</td>
				</tr>
				<tr class="a1">
					<td>
					<select multiple="multiple" style="font-size: 20px;height:200px; " id="all">
						<#list auth.menus as menu>
							<option value="${menu.menuId }">
								${menu.menuName }
							</option>
						</#list>
					</select>
					</td>
					<td>
					<input type="button" value="左移" class="btn" onClick="addOneItem('other','all');" style="width:50px;height:30px;background:url('images/btn/btn5.png');color:green;margin-right:10px; margin-bottom:10px;">
					<br>
					<input type="button" value="右移" class="btn" onClick="addOneItem('all','other');" style="width:50px;height:30px;background:url('images/btn/btn5.png');color:green;margin-right:10px;margin-bottom:10px;">
					<br>
					<input type="button" value="全部左移" class="btn" onClick="addAllItem('other','all');" style="width:90px;height:30px;background:url('images/btn/btn5.png');color:green;margin-right:10px;margin-bottom:10px;">
					<br>
					<input type="button" value="全部右移" class="btn" onClick="addAllItem('all','other');"style="width:90px;height:30px;background:url('images/btn/btn5.png');color:green;margin-right:10px;margin-bottom:10px;">
					<br>
					</td>
					<td>
					<select multiple="multiple" style="font-size: 20px; height:200px;" id="other" name="other">
					<#list otherMenus as menu>
							<option value="${menu.menuId }">
								${menu.menuName }
							</option>
						</#list>
					</select>
					</td>
				</tr>
				<tr class="a1">
					<td colspan="3" >
					<input type='button' value="修改" onclick="addOptions();" id="addauth"  class="btn" style="width:50px;height:30px;background:url('images/btn/btn5.png');color:green;margin-right:10px;" >
					</td>
				</tr>
			</table>
			</form>
		</div>
		
		
		
	</body>
</html>