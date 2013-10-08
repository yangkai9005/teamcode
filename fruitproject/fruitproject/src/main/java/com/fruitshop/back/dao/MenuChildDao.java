package main.java.com.fruitshop.back.dao;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import main.java.com.fruitshop.back.po.MenuChild;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuChildDao implements BatchBaseDao<MenuChild>{
	private static final Logger logger=Logger.getLogger(MenuChildDao.class);
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	
	
	
	
	
	
	
	
	
	/**
	 * 批量增加菜单
	 * @param menu
	 * @return
	 */
	@Override
	public void addBatch(String statement, List<MenuChild> menuChilds) {
		sqlSessionTemplate.insert(statement,menuChilds);
		
	}
	@Override
	public void delBatch(String statement, List<MenuChild> params) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 批量修改子菜单信息
	 * @param menuChilds
	 * @return
	 */
	@Override
	public void updateBatch(String statement, List<MenuChild> menuChilds) {
		sqlSessionTemplate.update(statement, menuChilds);
		
	}
	/**
	 * 单量增加菜单
	 * @param menu
	 * @return
	 */
	@Override
	public int add(String statement, MenuChild menuChild) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(statement,menuChild);
	}
	
	/**
	 * 单量删除
	 * @param menu
	 * @return
	 */
	@Override
	public int delete(String statement, Object menuChildId) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete(statement, menuChildId);
	}
	/**
	 * 查询所有的子菜单
	 * @return
	 */
	@Override
	public List<MenuChild> selectList(String statement, Object params) {
		if(params==null){
			return sqlSessionTemplate.selectList(statement);
		}
		return sqlSessionTemplate.selectList(statement, params);
	}
	/**
	 * 查找单个子菜单
	 */
	@Override
	public MenuChild selectOne(String statement, Object menuChildId) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("findMenuChildByMenuChildId", menuChildId);
	}
	/**
	 * 单量修改子菜单信息
	 * @param menuChild
	 * @return
	 */
	@Override
	public int update(String statement, MenuChild menuChild) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update(statement,menuChild);
	}
	
}
