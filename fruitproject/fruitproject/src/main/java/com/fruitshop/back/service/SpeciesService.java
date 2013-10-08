package main.java.com.fruitshop.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.dao.BaseDao;
import main.java.com.fruitshop.back.dao.BatchBaseDao;
import main.java.com.fruitshop.back.dao.SpeciesDao;
import main.java.com.fruitshop.back.po.Species;
import main.java.com.fruitshop.back.po.SpeciesAttr;

/**
 * @author yangkai
 * @date Sep 19, 2013
 * @version 1.0
 */
public class SpeciesService {
	@Autowired
	private BaseDao<Species> speciesDao;
	@Autowired
	private BatchBaseDao<SpeciesAttr> speciesAttrDao;
	
	public void addSpecies(Species species){
		speciesDao.add("addSpecies", species);
		speciesAttrDao.addBatch("addBatchSpeciesAttr", species.getAttrList());
	}
	
	public int delSpecies(String speciesId){
		return speciesDao.delete("delSpeceisById", speciesId);
	}
	
	public int updateSpecies(Species species){
		return speciesDao.update("update Species", species);
	}
	
	public List<Species> findAllSpecies(){
		return speciesDao.selectList("findAllSpecies", null);
	}
	
}
