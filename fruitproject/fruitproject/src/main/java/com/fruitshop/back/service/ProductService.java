package main.java.com.fruitshop.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.dao.ProductAttrDao;
import main.java.com.fruitshop.back.dao.ProductDao;
import main.java.com.fruitshop.back.po.Product;
import main.java.com.fruitshop.back.po.ProductAttr;

public class ProductService {
	@Autowired
	private ProductDao productDao;
	@Autowired 
	private ProductAttrDao attrDao;
	//添加商品
	public int addProduct(Product product){
		return productDao.add("", product);
	}
	//批量添加商品属性
	public void addProductAttr(List<ProductAttr> productAttrList){
		attrDao.addBatch("", productAttrList);
	}
}
