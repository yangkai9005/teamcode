package main.java.com.fruitshop.back.service;

import java.util.ArrayList;
import java.util.List;

import main.java.com.fruitshop.back.dao.MenuChildDao;
import main.java.com.fruitshop.back.po.Auth;
import main.java.com.fruitshop.back.po.MenuChild;
import main.java.com.fruitshop.cons.Conts;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class MenuChildService {
	@Autowired
	private MenuChildDao menuChildDao;
	/**
	 * 通过menuId查询子菜单
	 * @param menuId
	 * @return
	 */
	public List<MenuChild> getMenuChildByMenuId(String menuId){
		return menuChildDao.selectList("findMenuChildByMenuId", menuId);
	}
	/**
	 * 单量修改子菜单信息
	 * @param menuChild
	 * @return
	 */
	public int updateMenuChild(MenuChild menuChild){
		int result=menuChildDao.update("updateMenuChild", menuChild);
		return result;
	}
	
	/**
	 * 批量修改子菜单信息
	 * @param menuChild
	 * @return
	 */
	public void updateMenuChild(List<MenuChild> menuChilds){
		menuChildDao.updateBatch("updateMenuChildBatch", menuChilds);
	}
	/**
	 * 单量插入
	 * @param menuChild
	 * @return
	 */
	public int addMenuChild(MenuChild menuChild) {
		return menuChildDao.add("addMenuChild", menuChild);
	}
	/**
	 * 批量插入
	 * @param menuChild
	 * @return
	 */
	public void addMenuChild(List<MenuChild> menuChilds) {
		menuChildDao.addBatch("addMenuChildBatch", menuChilds);
	}
	
	/**
	 * 单量删除
	 * @param menuChild
	 * @return
	 */
	public int delMenuChild(String menuChildId){
		int result=menuChildDao.delete("delMenuChild", menuChildId);
		return result;
	}
	/**
	 * 批量删除
	 * @param menuChilds
	 * @return
	 */
	public int delMenuChild(List<MenuChild> menuChilds){
		return 0;
	}
	
	

	
}
