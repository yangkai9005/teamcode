package main.java.com.fruitshop.back.web;
/**
 * @author yangkai
 * 2013年8月2日23:20:46
 * 后台登陆,实现一些跳转
 */
import javax.servlet.http.HttpSession;

import main.java.com.fruitshop.cons.Conts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {
	private static final String FOLDER="back/home/";//后台控制文件夹、
	/**
	 * 后台登陆界面
	 * @return
	 */
	@RequestMapping(value="/frt-bk-logon.do")
	public String logon(HttpSession session){
		return FOLDER+"logon";
	}
	/**
	 * 后台管理主界面
	 * @return
	 */
	@RequestMapping(value="/frt-bk-index.do")
	public String home(){
		return FOLDER+"index";
	}
	/**
	 * 头部banner
	 * @return
	 */
	@RequestMapping(value="/header.do")
	public String header(){
		return FOLDER+"header";
	}
	@RequestMapping(value="/content.do")
	public String content(){
		return FOLDER+"content";
	}
	/**
	 * 底部
	 * @return
	 */
	@RequestMapping(value="/footer.do")
	public String footer(){
		return FOLDER+"footer";
	}
}
