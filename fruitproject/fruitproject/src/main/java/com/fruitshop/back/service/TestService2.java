package main.java.com.fruitshop.back.service;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.dao.Test2Dao;
import main.java.com.fruitshop.back.po.Test;

public class TestService2 {
	@Autowired
	private Test2Dao dao2;
	public int addTest(Test test){
		return dao2.addTest(test);
	}
	public int delTest(String testId){
		return dao2.delTest(testId);
	}
	public int updateTest(Test test){
		return dao2.updateTest(test);
	}
}
