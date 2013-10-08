//package test.dao;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import main.java.com.fruitshop.back.dao.AuthDao;
//import main.java.com.fruitshop.back.po.Auth;
//
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
//import org.unitils.UnitilsJUnit4;
//import org.unitils.spring.annotation.SpringApplicationContext;
//import org.unitils.spring.annotation.SpringBean;
//public class AuthDaoTest extends UnitilsJUnit4 {
//	@SpringApplicationContext( {"classpath:/applicationContext.xml" })
//	private ApplicationContext applicationContext;
//	private AuthDao authDao;
////	@SpringBean("authinc")
//	private static MySQLMaxValueIncrementer maxValue;
//	
//	public void testFindObject(){
//		authDao=(AuthDao)applicationContext.getBean("authDao");
//		List<Auth> auths=authDao.findAllAuth();
//		for(Auth auth:auths){
//			System.out.println(auth.getSystemAuthName());
//		}
//	}
//	public void addObject(){
//		authDao=(AuthDao)applicationContext.getBean("authDao");
////		long authIdSeq=maxValue.nextLongValue();
//		String authId="100";
//		System.out.println(authId);
//		System.out.println("用户ID"+authId);
//		System.out.println("权限ID"+authId);
//		Auth auth=new Auth();
//		auth.setSystemAuthId(authId);
//		auth.setSystemAuthName("测试管理员");
//		auth.setSystemAuthLevel(2);
//		auth.setSystemAuthDesc("测试用例");
//		
//		Auth auth2=new Auth();
//		auth2.setSystemAuthId("1001");
//		auth2.setSystemAuthName("测试管理员2");
//		auth2.setSystemAuthLevel(3);
//		auth2.setSystemAuthDesc("测试用例");
//		List<Auth> auths=new ArrayList<Auth>();
//		auths.add(auth);
//		auths.add(auth2);
//		authDao.addAuth(auths);
//	}
//	@Test
//	public void delObject(){
//		authDao=(AuthDao)applicationContext.getBean("authDao");
//		Auth auth=new Auth();
//		auth.setSystemAuthId("31");
//		List<String> authId=new ArrayList<String>();
//		authId.add("100");
//		authId.add("1001");
//		authDao.delAuth(authId);
//	}
//}
