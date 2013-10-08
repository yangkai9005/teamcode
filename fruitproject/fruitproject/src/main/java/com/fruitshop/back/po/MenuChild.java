package main.java.com.fruitshop.back.po;

import java.io.Serializable;

import main.java.com.fruitshop.util.RowName;

@SuppressWarnings("serial")
public class MenuChild implements Serializable {
	@RowName("menu_child_id")
	private String menuChildId;
	@RowName("menu_child_name")
	private String menuChildName;
	@RowName("menu_child_addr")
	private String menuChildAddr;
	@RowName("menu_id")
	private String menuId;
	public String getMenuChildId() {
		return menuChildId;
	}
	public void setMenuChildId(String menuChildId) {
		this.menuChildId = menuChildId;
	}
	public String getMenuChildName() {
		return menuChildName;
	}
	public void setMenuChildName(String menuChildName) {
		this.menuChildName = menuChildName;
	}
	public String getMenuChildAddr() {
		return menuChildAddr;
	}
	public void setMenuChildAddr(String menuChildAddr) {
		this.menuChildAddr = menuChildAddr;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	
}
