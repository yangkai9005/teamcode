package main.java.com.fruitshop.back.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.po.Species;

public class SpeciesDao implements BaseDao<Species>{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public Species selectOne(String statement,Object params) {
		return null;
	}

	@Override
	public int add(String statement,Species species) {//addSpecies
		return sqlSessionTemplate.insert(statement, species);
	}

	@Override
	public int delete(String statement,Object speciesId) {//delSpeceisById
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete(statement, speciesId);
	}

	@Override
	public List<Species> selectList(String statement,Object params) {//findAllSpecies
		return sqlSessionTemplate.selectList(statement,params);
	}

	@Override
	public int update(String statement,Species species) {//updateSpecies
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update(statement, species);
	}
	
}
