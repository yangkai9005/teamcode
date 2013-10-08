//package test.dao;
//
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//import main.java.com.fruitshop.back.dao.AuthDao;
//import main.java.com.fruitshop.back.dao.MenuChildDao;
//import main.java.com.fruitshop.back.po.Auth;
//import main.java.com.fruitshop.back.po.MenuChild;
//
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
//import org.unitils.UnitilsJUnit4;
//import org.unitils.spring.annotation.SpringApplicationContext;
//import org.unitils.spring.annotation.SpringBean;
//public class MenuChildDaoTest extends UnitilsJUnit4 {
//	@SpringApplicationContext( {"classpath:/applicationContext.xml" })
//	private ApplicationContext applicationContext;
//	private MenuChildDao menuChildDao;
////	@SpringBean("incrval")
//	private static MySQLMaxValueIncrementer maxValue;
//	@Test
//	public void testFindObject(){
//		menuChildDao=(MenuChildDao)applicationContext.getBean("menuChildDao");
//		List<MenuChild> menuChilds=menuChildDao.findMenuChildByMenuId("22");
//		for(MenuChild menuChild:menuChilds){
//			System.out.println(menuChild.getMenuChildId());
//			System.out.println(menuChild.getMenuChildName());
//			System.out.println(menuChild.getMenuChildAddr());
//			System.out.println(menuChild.getMenuId());
//		}
//	}
//	public void addObject(){
//		menuChildDao=(MenuChildDao)applicationContext.getBean("menuChildDao");
//		String menuChildId=maxValue.nextLongValue()+"";
//		System.out.println(menuChildId);
//		System.out.println("权限ID"+menuChildId);
//		MenuChild menuChild=new MenuChild();
//		menuChild.setMenuChildId(menuChildId);
//		menuChild.setMenuChildName("菜单栏管理");
//		menuChild.setMenuChildAddr("menu.do");
//		menuChild.setMenuId("21");
//		menuChildDao.addMenuChild(menuChild);
//	}
//	public void delObject(){
//		menuChildDao=(MenuChildDao)applicationContext.getBean("menuChildDao");
//		MenuChild menuChild=new MenuChild();
//		menuChild.setMenuChildId("31");
//		menuChildDao.delMenuChild(menuChild.getMenuChildId());
//	}
//
//	public void updateObjectBatch(){
//		menuChildDao=(MenuChildDao)applicationContext.getBean("menuChildDao");
//		MenuChild menuChild1=new MenuChild();
//		menuChild1.setMenuChildId("-9");
//		menuChild1.setMenuChildName("用户管理1");
//		menuChild1.setMenuChildAddr("user.do1");
//		menuChild1.setMenuId("22");
//		MenuChild menuChild2=new MenuChild();
//		menuChild2.setMenuChildId("-8");
//		menuChild2.setMenuChildName("用户分配管理1");
//		menuChild2.setMenuChildAddr("userpane.do1");
//		menuChild2.setMenuId("-9");
//		MenuChild menuChild3=new MenuChild();
//		menuChild3.setMenuChildId("-7");
//		
//		menuChild3.setMenuChildName("权限分配管理1");
//		menuChild3.setMenuChildAddr("userauthpane.do");
//		menuChild3.setMenuId("-9");
//		List<MenuChild> menuChilds=new ArrayList<MenuChild>();
//		menuChilds.add(menuChild1);
//		menuChilds.add(menuChild2);
//		menuChilds.add(menuChild3);
////		menuChildDao.updateMenuChildBatch(menuChilds);
//	}
//}
