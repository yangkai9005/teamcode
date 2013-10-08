package main.java.com.fruitshop.back.dao;

import java.util.List;

import main.java.com.fruitshop.back.po.Menu;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MenuDao implements BatchBaseDao<Menu>{
	private static final Logger logger=Logger.getLogger(MenuDao.class);
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public void addBatch(String statement, @Param("list")List<Menu> objs) {
		sqlSessionTemplate.insert(statement, objs);
		
	}
	@Override
	public void delBatch(String statement, @Param("list")List<Menu> params) {
		sqlSessionTemplate.delete(statement, params);
	}
	@Override
	public void updateBatch(String statement, @Param("list")List<Menu> objs) {
		sqlSessionTemplate.update(statement, objs);
	}
	@Override
	public int add(String statement, Menu menu) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(statement, menu);
	}
	@Override
	public int delete(String statement, Object params) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete(statement, params);
	}
	@Override
	public List<Menu> selectList(String statement, Object params) {
		if(params==null){
			return sqlSessionTemplate.selectList(statement);
		}
		return sqlSessionTemplate.selectList(statement, params);
	}
	@Override
	public Menu selectOne(String statement, Object params) {
		return sqlSessionTemplate.selectOne(statement);
	}
	@Override
	public int update(String statement, Menu menu) {
		return sqlSessionTemplate.update(statement, menu);
	}
	
	
	
}
