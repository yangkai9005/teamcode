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
//public class AllDaoTest extends UnitilsJUnit4 {
//	@SpringApplicationContext( {"classpath:/applicationContext.xml" })
//	private ApplicationContext applicationContext;
//	private AuthDao authDao;
//	@SpringBean("authinc")
//	private static MySQLMaxValueIncrementer maxValue;
//	public void testFindObject(){
//		authDao=(AuthDao)applicationContext.getBean("authDao");
//		List<Auth> auths=authDao.findAllAuth();
//		for(Auth auth:auths){
//			System.out.println(auth.getSystemAuthName());
//		}
//	}
//	@Test
//	public void addObject(){
//		authDao=(AuthDao)applicationContext.getBean("authDao");
//		String authId=maxValue.nextLongValue()+"";
//		System.out.println(authId);
//		System.out.println("权限ID"+authId);
//		Auth auth=new Auth();
//		auth.setSystemAuthId(authId);
//		auth.setSystemAuthName("系统管理员");
//		auth.setSystemAuthDesc("具有最高权限,能够查看所有的栏目");
////		authDao.addAuth(auth);
//	}
//	public void delObject(){
//		authDao=(AuthDao)applicationContext.getBean("authDao");
//		Auth auth=new Auth();
//		auth.setSystemAuthId("1");
//		authDao.delAuth("");
//	}
//	
//	public static void main(String[] args) {
//		List<String> list=(ArrayList<String>)null;
//		for(String s:list){
//			System.out.println(s);
//		}
//	}
//}
