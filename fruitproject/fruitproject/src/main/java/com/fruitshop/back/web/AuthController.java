package main.java.com.fruitshop.back.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.com.fruitshop.back.po.Auth;
import main.java.com.fruitshop.back.po.AuthMenu;
import main.java.com.fruitshop.back.service.AuthService;
import main.java.com.fruitshop.back.service.MenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import freemarker.ext.beans.ArrayModel;

@Controller
public class AuthController {
	private static final String FOLDER="back/auth/";//权限后台文件夹
	@Autowired
	private MySQLMaxValueIncrementer maxInc;
	@Autowired
	private AuthService authService;
	@Autowired
	private MenuService menuService;
	@RequestMapping(value="/userauthpane.do")
	public String authPane(Model model){
		model.addAttribute("auths", authService.findAllAuth());
		return FOLDER+"authpane";
	}
	
	@RequestMapping(value="/addauthpane.do")
	public String addAuthPane(){
		return FOLDER+"addauthpane";
	}
	@RequestMapping(value="/addauthval.do")
	public String addAuth(Model model,@ModelAttribute("form1")Auth auth){
		auth.setSystemAuthId(maxInc.nextLongValue()+"");
		authService.addAuth(auth);
		model.addAttribute("auths", authService.findAllAuth());
		return FOLDER+"authpane";
	}
	
	@RequestMapping(value="/delauthval.do")
	public String delAuth(Model model,String authId){
		authService.delAuth(authId);
		model.addAttribute("auths", authService.findAllAuth());
		return FOLDER+"authpane";
	}
	@RequestMapping(value="/updateauthval.do")
	public String updateAuthVal(Model model,String addMenus,String delMenus,String authId){
		List<AuthMenu> addAuthMenu=new ArrayList<AuthMenu>();
		List<AuthMenu> delAuthMenu=new ArrayList<AuthMenu>();
		getAuthMenuList(addMenus.split(","), authId, addAuthMenu);
		getAuthMenuList(delMenus.split(","), authId, delAuthMenu);
		authService.addAuthAndMenuId(addAuthMenu);
		authService.delAuthAndMenuId(delAuthMenu);
		model.addAttribute("auths", authService.findAllAuth());
		return FOLDER+"authpane";
	}

	/**
	 * @param addMenus
	 * @param authId
	 * @param addAuthMenu
	 */
	private void getAuthMenuList(String[] menus, String authId,
			List<AuthMenu> authMenuList) {
		for(int i=0,length=menus.length;i<length;i++){
			if(menus[i]!=null&&!"".equals(menus[i])){
				AuthMenu authMenu=new AuthMenu();
				authMenu.setSystemAuthId(authId);
				authMenu.setSystemMenuId(menus[i]);
				authMenuList.add(authMenu);
			}
		}
	}
	@RequestMapping(value="/updateauthpane.do")
	public String updateAuthPane(Model model,String authId){
		model.addAttribute("auth", authService.findAuthById(authId));
		model.addAttribute("otherMenus", menuService.findMenuByNotInAuthId(authId));
		return FOLDER+"updateauthpane";
	}
	/**
	 * 检查该权限是否存在
	 * @return 1(存在) 0(不存在)
	 */
	@RequestMapping(value="/checkauth.do")
	@ResponseBody
	public String checkAuth(String authName,String authLevel){
		Auth auth=new Auth();
		auth.setSystemAuthName(authName);
		auth.setSystemAuthLevel(authLevel);
		return authService.checkAuth(auth)?"1":"0";
		
	}
}
