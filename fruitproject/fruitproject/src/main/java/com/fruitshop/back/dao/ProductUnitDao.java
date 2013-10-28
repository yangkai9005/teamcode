package main.java.com.fruitshop.back.dao;

import java.util.List;

import main.java.com.fruitshop.back.po.ProductUnit;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductUnitDao implements BaseDao<ProductUnit> {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public int add(String statement, ProductUnit productUnit) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(statement,productUnit);
	}

	@Override
	public int delete(String statement, Object unitId) {
		return sqlSessionTemplate.delete(statement, unitId);
	}
	
	public int delBatch(String statement,@Param("list")List<String> list){
		return sqlSessionTemplate.delete("delUnitBatch", list);
	}

	@Override
	public List<ProductUnit> selectList(String statement, Object params) {
		if(params==null){
			return sqlSessionTemplate.selectList(statement);
		}
		return sqlSessionTemplate.selectList(statement, params);
	}

	@Override
	public ProductUnit selectOne(String statement, Object params) {
		if(params==null){
			return sqlSessionTemplate.selectOne(statement);
		}
		return sqlSessionTemplate.selectOne(statement, params);
	}

	@Override
	public int update(String statement, ProductUnit unit) {
		return sqlSessionTemplate.update(statement, unit);
	}


}
