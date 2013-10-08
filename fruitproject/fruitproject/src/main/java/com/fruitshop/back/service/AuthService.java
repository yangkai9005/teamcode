package main.java.com.fruitshop.back.service;

import java.util.List;

import main.java.com.fruitshop.back.dao.BatchBaseDao;
import main.java.com.fruitshop.back.po.Auth;
import main.java.com.fruitshop.back.po.AuthMenu;

import org.springframework.beans.factory.annotation.Autowired;

public class AuthService  {
	@Autowired
	private BatchBaseDao<Auth> authDao;
	@Autowired
	private BatchBaseDao<AuthMenu> authMenuDao;
	/**
	 * 添加权限
	 * @param auth
	 * @return
	 */
	public int addAuth(Auth auth){
		return authDao.add("addAuth", auth);
	}
	/**
	 * 删除单个权限
	 * @param auth
	 * @return
	 */
	public int delAuth(String authId){
		return authDao.delete("delAuth", authId);
		
	}
	
	public List<Auth> findAllAuth(){
		return authDao.selectList("findAllAuth", null);
	}
	
	public Auth findAuthById(String authId){
		return authDao.selectOne("findAuthById", authId);
	}
	
	public int updateAuth(Auth auth){
		return authDao.update("updateAuth", auth);
	}
	
	/**
	 * 添加权限和菜单的关系
	 * @return
	 */
	public void addAuthAndMenuId(List<AuthMenu> authMenus){
		authMenuDao.addBatch("addAuthAndMenu", authMenus);
	}
	
	/**
	 * 删除权限和菜单的关系
	 * @return
	 */
	public void delAuthAndMenuId(List<AuthMenu> authMenus){
		 authMenuDao.delBatch("delAuthAndMenu", authMenus);
	}
	
	public boolean checkAuth(Auth auth){
		List<Auth> authList=authDao.selectList("getAuthByLevelOrName", auth);
		return authList.size()>0?true:false;
	}
}
