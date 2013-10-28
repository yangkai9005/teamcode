package main.java.com.fruitshop.back.web;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import main.java.com.fruitshop.back.po.Auth;
import main.java.com.fruitshop.back.po.User;
import main.java.com.fruitshop.back.service.AuthService;
import main.java.com.fruitshop.back.service.UserService;
import main.java.com.fruitshop.util.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UserController {
	private static final String FOLDER="back/user/";//后台控制文件夹
	@Autowired
	private UserService userService;
	@Autowired
	private AuthService authService;
	@Autowired
	private MySQLMaxValueIncrementer maxInc;
	/**
	 * 判断系统用户是否存在
	 * @param username 用户名
	 * @param userpwd 密码
	 * @return
	 */
	@RequestMapping(value="/userlogon.do",method = RequestMethod.POST)
	@ResponseBody
	public String logon(String username,String userpwd,HttpSession session){
		return userService.logon(username, userpwd,session)+"";
	}
	@RequestMapping(value="/userpane.do")
	public String userPane(Model model){
		model.addAttribute("users", userService.findAllUser());
		return FOLDER+"userpan";
	}
	/**
	 * 添加用户面板
	 * @return
	 */
	@RequestMapping(value="/adduserpane.do")
	public String addUserPane(Model model){
		List<Auth> auths=authService.findAllAuth();
		model.addAttribute("auths", auths);
		return FOLDER+"adduserpane";
	}
	@RequestMapping(value="/adduserval.do")
	public String addUser(Model model,@ModelAttribute("form1")User user){
		user.setSystemUserId(maxInc.nextLongValue()+"");
		user.setSystemUserPwd(Util.encryptByMD5(user.getSystemUserPwd()));
		userService.addUser(user);
		model.addAttribute("users", userService.findAllUser());
		return FOLDER+"userpan";
	}
	
	@RequestMapping(value="/delbathuserval.do")
	public String delBathUserval(Model model,@RequestParam String ids){
		String idArray[]=ids.split(",");
		List<String> list=new ArrayList<String>();
		for (String id:idArray) {
			list.add(id);
		}
		userService.delBathUser(list);
		model.addAttribute("users", userService.findAllUser());
		return FOLDER+"userpan";
	}
	
	/**
	 * 根据用户名判断用户是否存在
	 * 0 存在 1 不存在
	 * @param username
	 * @return
	 */
	@RequestMapping(value="/checkuser.do")
	@ResponseBody
	public String checkUser(String username){
		System.out.println(username);
		User user=userService.getUserByUsesrName(username);
		if(user==null){//用户不存在
			return "0";
		}
		else{
			return "1";
		}
	}
	
	public String delUser(User user){
		return null;
	}
	
	public int updateUser(User user){
		return 0;
	}
	
	
}
