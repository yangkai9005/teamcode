//package test.dao;
//
//
//import java.util.List;
//
//import main.java.com.fruitshop.back.dao.AuthDao;
//import main.java.com.fruitshop.back.dao.UserDao;
//import main.java.com.fruitshop.back.po.Auth;
//import main.java.com.fruitshop.back.po.User;
//import main.java.com.fruitshop.util.Util;
//
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
//import org.unitils.UnitilsJUnit4;
//import org.unitils.spring.annotation.SpringApplicationContext;
//import org.unitils.spring.annotation.SpringBean;
//public class UserDaoTest extends UnitilsJUnit4 {
//	@SpringApplicationContext( {"classpath:/applicationContext.xml" })
//	private ApplicationContext applicationContext;
//	private UserDao userDao;
//	private static MySQLMaxValueIncrementer incrval;
//	@Test
//	public void testFindObject(){
//		userDao=(UserDao)applicationContext.getBean("userDao");
//		List<User> users=userDao.findAllUser();
//		for(User user:users){
//			System.out.println(user.getSystemUserName());
//			System.out.println(user.getSystemUserPwd());
//			System.out.println(user.getSystemAuthId());
//		}
//	}
//	
//	public void addObject(){
//		userDao=(UserDao)applicationContext.getBean("userDao");
//		System.out.println(incrval);
//		String userId=incrval.nextLongValue()+"";
//		User user=new User();
//		user.setSystemAuthId("61");
//		user.setSystemUserId(userId+"");
//		user.setSystemUserName("zhangsan");
//		user.setSystemUserPwd(Util.encryptByMD5("123"));
//		System.out.println(userDao.addUser(user));
//	}
//	public void delObject(){
//		userDao=(UserDao)applicationContext.getBean("userDao");
//		User user=new User();
//		user.setSystemUserId("-9");
////		System.out.println(userDao.delUser(user));
//	}
//}
