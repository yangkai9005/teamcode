package main.java.com.fruitshop.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.dao.ProductUnitDao;
import main.java.com.fruitshop.back.po.ProductUnit;

public class ProductUnitService {
	@Autowired
	private ProductUnitDao unitDao;
	
	public int addProductUnit(ProductUnit unit){
		return unitDao.add("addproductunit", unit);
	}
	
	public List<ProductUnit> getAllProductUnit(){
		return unitDao.selectList("getallproductunit", null);
	}
	
	public int delProductUnit(String unitId){
		return unitDao.delete("delproductUnit", unitId);
	}
	
	public int delUnitBatch(List<String> list){
		return unitDao.delBatch("delUnitBatch", list);
	}
	
	public int updateProductUnit(ProductUnit unit){
		return unitDao.update("updateproductunit", unit);
	}
}
