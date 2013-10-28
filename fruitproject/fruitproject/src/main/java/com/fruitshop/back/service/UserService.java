package main.java.com.fruitshop.back.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import main.java.com.fruitshop.back.dao.UserDao;
import main.java.com.fruitshop.back.po.User;
import main.java.com.fruitshop.cons.Conts;
import main.java.com.fruitshop.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
public class UserService {
	@Autowired
	private UserDao userDao;
	/**
	 * 系统用户登录
	 * 0,成功登录 1,密码错误 2,用户不存在
	 * @param username 用户名
	 * @param userpwd 密码
	 * @return
	 */
	public int logon(String username, String userpwd,HttpSession session) {
		User user=getUserByUsesrName(username);
		if(user==null){//用户不存在
			return 2;
			
		}
		else{//校验密码
			return chargePassword(userpwd, user,session);
		}
	}
	
	
	public User getUserByUsesrName(String username){
		return userDao.selectOne("getUserByUserName", username);
	}
	/**
	 * 判断密码
	 * @param userpwd
	 * @param user
	 * @param session
	 * @return
	 */
	private int chargePassword(String userpwd, User user,HttpSession session) {
		if(Util.encryptByMD5(userpwd).equals(user.getSystemUserPwd())){
			session.setAttribute(Conts.USER_CODE_FLAG, Conts.USER_CODE);//将登录成功的用户的标识存放到session中
			session.setAttribute(Conts.USER_AUTH, user.getSystemAuthId());//把登录进来用户的权限存放在session
			session.setAttribute(Conts.USER_NAME, user.getSystemUserName());
			return 0;
		}
		else{
			return 1;//密码错误
		}
	}
	
	/**
	 * 查询所有用户
	 */
	
	public List<User> findAllUser(){
		return userDao.findAllUser();
	}
	/**
	 * 通过userId删除用户
	 * @param userId
	 * @return
	 */
	public int delUser(String userId){
		return userDao.delete("delUser", userId);
	}
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int addUser(User user){
		return userDao.add("addUser", user);
		
	}
	
	/**
	 * 批量删除用户
	 */
	public void delBathUser(List<String> list){
		userDao.delBath("delUserBatch", list);
	}
}
