package main.java.com.fruitshop.back.service;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.dao.Test1Dao;
import main.java.com.fruitshop.back.po.Test;

public class TestService1 {
	@Autowired
	private Test1Dao dao1;
	public int addTest(Test test){
		return dao1.addTest(test);
	}
	public int delTest(String testId){
		return dao1.delTest(testId);
	}
	public int updateTest(Test test){
		return dao1.updateTest(test);
	}
}
