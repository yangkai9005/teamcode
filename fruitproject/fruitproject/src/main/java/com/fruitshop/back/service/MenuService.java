package main.java.com.fruitshop.back.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.java.com.fruitshop.back.dao.BatchBaseDao;
import main.java.com.fruitshop.back.dao.MenuChildDao;
import main.java.com.fruitshop.back.dao.MenuDao;
import main.java.com.fruitshop.back.po.Menu;
import main.java.com.fruitshop.back.po.MenuChild;
import main.java.com.fruitshop.cons.Conts;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;

import sun.security.jgss.spi.MechanismFactory;

public class MenuService  {
	@Autowired
	private BatchBaseDao<Menu> menuDao;
	@Autowired
	private MenuChildDao childDao;



	/**
	 * 通过相应的权限值查询该权限下的所有菜单
	 */
	public List<Menu> getMenuByAuthId(String authId) {
		return menuDao.selectList("findMenuByAuthId", authId);
	}
	/**
	 * 单量添加菜单
	 * @return
	 */
	public int addMenu(Menu menu){
		return menuDao.add("addMenu", menu);
	}
	/**
	 * 批量添加菜单
	 * @param menus
	 * @param authId
	 * @return
	 */
	public void addMenu(List<Menu> menus){
		 menuDao.addBatch("addMenuBatch", menus);//添加菜单到数据库';
	}
	/**
	 * 单量删除菜单
	 */
	
	public void delMenu(String menuId){
		menuDao.delete("delMenu", menuId);//删除菜单
		childDao.delete("delMenuChildByMenuId", menuId);//删除其关联的子菜单
	}
	/**
	 * 查询所有的菜单信息
	 * @return
	 */
	public List<Menu> findAllMenu(){
		return menuDao.selectList("findAllMenu", null);
	}
	/***
	 * 通过menuId查找菜单信息
	 * @param menuId
	 * @return
	 */
	public List<Menu> findMenuByMenuId(String menuId){
		return menuDao.selectList("findMenuByAuthId", menuId);
	}
	/**
	 * 查找不在某个权限下的其他菜单项目
	 * @param authId
	 * @return
	 */
	public List<Menu> findMenuByNotInAuthId(String authId){
		return menuDao.selectList("findMenuByNotInAuthId", authId);
	}
}
