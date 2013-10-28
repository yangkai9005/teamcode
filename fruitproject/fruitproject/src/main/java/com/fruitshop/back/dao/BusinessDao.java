package main.java.com.fruitshop.back.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.po.Business;

public class BusinessDao implements BaseDao<Business> {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public int add(String statement, Business business) {
		return sqlSessionTemplate.insert(statement,business);
	}

	@Override
	public int delete(String statement, Object params) {
		return sqlSessionTemplate.delete(statement, params);
	}
	
	public int delBatch(String statement,@Param("list")List<String> list){
		return sqlSessionTemplate.delete("delBusinessBatch", list);
	}

	@Override
	public List<Business> selectList(String statement, Object params) {
		
		if(params==null){
			sqlSessionTemplate.selectList(statement);
		}
		return sqlSessionTemplate.selectList(statement, params);
	}

	@Override
	public Business selectOne(String statement, Object params) {
		if(params==null){
			return sqlSessionTemplate.selectOne(statement);
		}
		return sqlSessionTemplate.selectOne(statement, params);
	}

	@Override
	public int update(String statement, Business business) {
		return sqlSessionTemplate.update(statement, business);
	}
	
}
