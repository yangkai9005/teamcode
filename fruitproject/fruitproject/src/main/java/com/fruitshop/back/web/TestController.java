package main.java.com.fruitshop.back.web;

import main.java.com.fruitshop.back.po.Test;
import main.java.com.fruitshop.back.service.TestService1;
import main.java.com.fruitshop.back.service.TestService2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@Autowired
	private TestService1 testService1;
	@Autowired
	private TestService2 testService2;
	
	@RequestMapping(value="/addTest.do")
	public String addTest(){
		Test test1=new Test();
		Test test2=new Test();
		test1.setTestName("杨凯");
		test2.setTestName("yanglei");
		testService1.addTest(test1);
		testService2.addTest(test2);
		return "";
	}
	
	@RequestMapping(value="/updateTest.do")
	public String updateTest(){
		Test test1=new Test();
		Test test2=new Test();
		test1.setTestId("1");
		test1.setTestName("杨凯111");
		test2.setTestId("1");
		test2.setTestName("yangkai");
		testService1.updateTest(test1);
		testService2.updateTest(test2);
		return "";
	}
	
	@RequestMapping(value="/delTest.do")
	public String delTest(){
		testService1.delTest("3");
		testService2.delTest("3");
		return "";
	}
}
