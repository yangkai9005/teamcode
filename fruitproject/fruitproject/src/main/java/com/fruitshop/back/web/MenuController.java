package main.java.com.fruitshop.back.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import main.java.com.fruitshop.back.po.Menu;
import main.java.com.fruitshop.back.po.MenuChild;
import main.java.com.fruitshop.back.service.MenuChildService;
import main.java.com.fruitshop.back.service.MenuService;
import main.java.com.fruitshop.cons.Conts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
	private static final String FOLDER="back/menu/";//后台控制文件夹
	@Autowired
	private MenuService menuService;
	@Autowired
	private MenuChildService menuChildService;
	@Autowired
	private MySQLMaxValueIncrementer maxInc;
	/**
	 * 左边树形菜单栏
	 * @return
	 * @throws CloneNotSupportedException 
	 */
	/**
	 * 后台管理主界面
	 * @return
	 */
	@RequestMapping(value="/frt-bk-index.do")
	public String lefttree(Model model,HttpSession session) throws CloneNotSupportedException{
		String authId=session.getAttribute(Conts.USER_AUTH).toString();
		List<Menu> menus=menuService.getMenuByAuthId(authId);
		model.addAttribute("menus",menus);
		return FOLDER+"main";
	}
	@RequestMapping(value="/menu.do")
	public String menuPane(Model model) throws CloneNotSupportedException{
		model.addAttribute("menus", menuService.findAllMenu());
		return FOLDER+"menu";
	}
	@RequestMapping(value="/modemenu.do")
	public String modeMenuPane(Model model,String menuId) {
		model.addAttribute("menuChildes", menuChildService.getMenuChildByMenuId(menuId));
		return FOLDER+"modemenu";
	}
	/**
	 * 修改子菜单信息，因为子菜单存在多个需要对象需要修改
	 * @param model
	 * @param menuChilds
	 * @return
	 */
	@RequestMapping(value="/modemenuval.do")
	public String modeMenuValue(Model model,String[] menuChildId,String[] menuChildName,String[] menuChildAddr,String[] menuId) {
		List<MenuChild> menuChilds=new ArrayList<MenuChild>();
		for(int i=0,length=menuChildId.length;i<length;i++){
			MenuChild menuChild=new MenuChild();
			menuChild.setMenuChildAddr(menuChildAddr[i]);
			menuChild.setMenuChildId(menuChildId[i]);
			menuChild.setMenuChildName(menuChildName[i]);
			menuChild.setMenuId(menuId[i]);
			menuChilds.add(menuChild);
		}
		menuChildService.updateMenuChild(menuChilds);
		model.addAttribute("menus", menuService.findAllMenu());
		return FOLDER+"menu";
	}
	
	
	
	/**
	 * 添加菜单项目,可以存在批量 所以采用批量插入
	 * @param model
	 * @param menuChilds
	 * @return
	 */
	@RequestMapping(value="/addmenupane.do")
	public String addMenuPane(Model model,HttpSession session) {
		model.addAttribute("authId", session.getAttribute(Conts.USER_AUTH));
		return FOLDER+"addmenu";
	}
	
	/**
	 * 添加菜单项目,可以存在批量 所以采用批量插入
	 * @param model
	 * @param menuChilds
	 * @return
	 */
	@RequestMapping(value="/addmenuval.do")
	public String addMenuValue(Model model,HttpSession session,String authId,String[] menuName) {
		List<Menu> menus=new ArrayList<Menu>();
		for(int i=0,length=menuName.length;i<length;i++){
			Menu menu=new Menu();
			menu.setMenuId(maxInc.nextLongValue()+"");
			menu.setMenuName(menuName[i]);
			menus.add(menu);
		}
		menuService.addMenu(menus);
		model.addAttribute("menus", menuService.findAllMenu());
		return FOLDER+"menu";
	}
	
	/**
	 * 添加子菜单项目,可以存在批量 所以采用批量插入
	 * @param model
	 * @param menuChilds
	 * @return
	 */
	@RequestMapping(value="/addmenuchildpane.do")
	public String addMenuChildPane(Model model,String menuId) {
		model.addAttribute("menuId", menuId);
		return FOLDER+"addchildmenu";
	}
	/**
	 * 添加子菜单项目,可以存在批量 所以采用批量插入
	 * @param model
	 * @param menuChilds
	 * @return
	 */
	@RequestMapping(value="/addmenuchildval.do")
	public String addMenuChildValue(Model model,String[] menuChildName,String[] menuChildAddr, String menuId) {
		List<MenuChild> menuChilds=new ArrayList<MenuChild>();
		for(int i=0,length=menuChildName.length;i<length;i++){
			MenuChild menuChild=new MenuChild();
			menuChild.setMenuChildId(maxInc.nextLongValue()+"");
			menuChild.setMenuChildAddr(menuChildAddr[i]);
			menuChild.setMenuChildName(menuChildName[i]);
			menuChild.setMenuId(menuId);
			menuChilds.add(menuChild);
		}
		menuChildService.addMenuChild(menuChilds);
		model.addAttribute("menus", menuService.findAllMenu());
		return FOLDER+"menu";
	}
	
	/**
	 * 删除子菜单
	 * @param model
	 * @param menuChilds
	 * @return
	 */
	@RequestMapping(value="/delmenuchildval.do")
	public String delMenuValue(Model model,String menuChildId) {
		menuChildService.delMenuChild(menuChildId);
		model.addAttribute("menus", menuService.findAllMenu());
		return FOLDER+"menu";
	}
	/**
	 * 删除子菜单
	 * @param model
	 * @param menuChilds
	 * @return
	 */
	@RequestMapping(value="/delmenuval.do")
	public String delMenu(Model model,String menuId) {
		menuService.delMenu(menuId);
		model.addAttribute("menus", menuService.findAllMenu());
		return FOLDER+"menu";
	}
}
