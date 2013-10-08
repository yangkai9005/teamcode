package main.java.com.fruitshop.back.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import main.java.com.fruitshop.util.RowName;

@SuppressWarnings("serial")
public class Auth implements Serializable {
	@RowName("system_auth_id")
	private String systemAuthId;// 主键
	@RowName("system_auth_name")
	private String systemAuthName;// 名称
	@RowName("system_auth_level")
	private String systemAuthLevel;// 权限级别
	private List<Menu> menus=new ArrayList<Menu>();
	@RowName("system_auth_desc")
	private String systemAuthDesc;
	public String getSystemAuthId() {
		return systemAuthId;
	}
	public void setSystemAuthId(String systemAuthId) {
		this.systemAuthId = systemAuthId;
	}
	public String getSystemAuthName() {
		return systemAuthName;
	}
	public void setSystemAuthName(String systemAuthName) {
		this.systemAuthName = systemAuthName;
	}
	
	public String getSystemAuthLevel() {
		return systemAuthLevel;
	}
	public void setSystemAuthLevel(String systemAuthLevel) {
		this.systemAuthLevel = systemAuthLevel;
	}
	public String getSystemAuthDesc() {
		return systemAuthDesc;
	}
	public void setSystemAuthDesc(String systemAuthDesc) {
		this.systemAuthDesc = systemAuthDesc;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	
	
}
