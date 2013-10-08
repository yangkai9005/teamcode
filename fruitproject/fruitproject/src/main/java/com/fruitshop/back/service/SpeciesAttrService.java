package main.java.com.fruitshop.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.dao.SpeciesAttrDao;
import main.java.com.fruitshop.back.po.SpeciesAttr;

/**
 * @author yangkai
 * @date Sep 19, 2013
 * @version 1.0
 */
public class SpeciesAttrService {
	@Autowired
	private SpeciesAttrDao attrDao;
	public void addBatchAttr(List<SpeciesAttr> attrs){
		attrDao.addBatch("addBatchSpeciesAttr", attrs);
	}
	
	public List<SpeciesAttr> getAttrBySpeciesId(String speciesId){
		return attrDao.selectList("getAttrBySpeciesId", speciesId);
	}
}
