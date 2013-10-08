package main.java.com.fruitshop.back.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.po.AuthMenu;

public class AuthMenuDao implements BatchBaseDao<AuthMenu> {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public void addBatch(String statement, @Param("list")List<AuthMenu> objs) {
		sqlSessionTemplate.insert(statement, objs);
	}

	@Override
	public void delBatch(String statement, List<AuthMenu> params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBatch(String statement, List<AuthMenu> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int add(String statement, AuthMenu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String statement, Object params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AuthMenu> selectList(String statement, Object params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthMenu selectOne(String statement, Object params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(String statement, AuthMenu t) {
		// TODO Auto-generated method stub
		return 0;
	}


}
