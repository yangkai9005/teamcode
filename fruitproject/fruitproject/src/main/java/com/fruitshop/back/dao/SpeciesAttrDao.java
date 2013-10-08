package main.java.com.fruitshop.back.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.po.SpeciesAttr;

public class SpeciesAttrDao implements BatchBaseDao<SpeciesAttr>{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public int addSpeciesAttr(@Param("list")List<SpeciesAttr> speciesAttrs){
		return sqlSessionTemplate.insert("addSpeciesAttr", speciesAttrs);
	}
	
	public int delSpeceisAttrById(String speciesId){
		return sqlSessionTemplate.delete("delSpeceisAttrById", speciesId);
	}
	
	public int updateSpeciesAttr(SpeciesAttr speciesAttr){
		return sqlSessionTemplate.update("updateSpeciesAttr", speciesAttr);
	}

	@Override
	public void addBatch(String statement, @Param("list")List<SpeciesAttr> objs) {
		sqlSessionTemplate.insert(statement, objs);
	}

	@Override
	public void delBatch(String statement, List<SpeciesAttr> params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBatch(String statement, List<SpeciesAttr> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SpeciesAttr selectOne(String statement, Object params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(String statement, SpeciesAttr t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String statement, Object params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SpeciesAttr> selectList(String statement, Object params) {
		if(params==null){
			return sqlSessionTemplate.selectList(statement);
		}
		return sqlSessionTemplate.selectList(statement, params);
	}

	@Override
	public int update(String statement, SpeciesAttr t) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
