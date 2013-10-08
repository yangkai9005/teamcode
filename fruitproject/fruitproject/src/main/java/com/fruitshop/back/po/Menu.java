package main.java.com.fruitshop.back.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import main.java.com.fruitshop.util.RowName;

@SuppressWarnings("serial")
public class Menu implements Serializable {
	@RowName("menu_id")
	private String menuId;
	@RowName("menu_name")
	private String menuName;
	private List<MenuChild> menuChilds=new ArrayList<MenuChild>();
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public List<MenuChild> getMenuChilds() {
		return menuChilds;
	}
	public void setMenuChilds(List<MenuChild> menuChild) {
		this.menuChilds = menuChild;
	}
}
