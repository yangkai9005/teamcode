package main.java.com.fruitshop.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.dao.BusinessDao;
import main.java.com.fruitshop.back.po.Business;

public class BusinessService {
	@Autowired
	private BusinessDao businessDao;
	//添加商家信息
	public int addBusiness(Business business){
		return businessDao.add("addbusiness", business);
	}
	//修改商家信息
	public int updateBusiness(Business business){
		return businessDao.update("updatebusiness", business);
	}
	//删除商家信息
	public int delBusiness(String businessId){
		return businessDao.delete("delbusiness", businessId);
	}
	//通过ID查找商家信息
	public Business getBusinessById(String businessId){
		return businessDao.selectOne("getbusinessbyid", businessId);
	}
	
	//查询所有的商家信息
	
	public List<Business> getAllBusiness(){
		return businessDao.selectList("getallbusiness", null);
	}
}
