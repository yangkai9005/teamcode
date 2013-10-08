package main.java.com.fruitshop.back.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.fruitshop.back.po.Test;

public class Test2Dao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public int addTest(Test test){
		return sqlSessionTemplate.insert("addTest2", test);
	}
	public int delTest(String testId){
		return sqlSessionTemplate.delete("delTest2", testId);
	}
	public int updateTest(Test test){
		return sqlSessionTemplate.update("updateTest2", test);
	}
}
