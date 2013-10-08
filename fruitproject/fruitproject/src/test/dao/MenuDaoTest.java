//package test.dao;
//
//
//import java.util.List;
//
//import main.java.com.fruitshop.back.dao.MenuDao;
//import main.java.com.fruitshop.back.po.Auth;
//import main.java.com.fruitshop.back.po.Menu;
//import main.java.com.fruitshop.back.po.MenuChild;
//
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
//import org.unitils.UnitilsJUnit4;
//import org.unitils.spring.annotation.SpringApplicationContext;
//import org.unitils.spring.annotation.SpringBean;
//public class MenuDaoTest extends UnitilsJUnit4 {
//	@SpringApplicationContext( {"classpath:/applicationContext.xml" })
//	private ApplicationContext applicationContext;
//	private MenuDao menuDao;
////	@SpringBean("incrval")
//	private static MySQLMaxValueIncrementer maxValue;
//	@Test
//	public void testFindObject(){
//		menuDao=(MenuDao)applicationContext.getBean("menuDao");
//		List<Menu> menus=menuDao.findMenuByAuthId("61");
//		for(Menu menu:menus){
//			System.out.println(menu.getMenuId());
//			System.out.println(menu.getMenuName());
//			System.out.println(menu.getSystemAuthId());
//			List<MenuChild> childs=menu.getMenuChilds();
//			for(MenuChild child:childs){
//				System.out.println(child.getMenuChildId());
//				System.out.println(child.getMenuChildName());
//				System.out.println(child.getMenuChildAddr());
//				System.out.println(child.getMenuId());
//			}
//		}
//	}
//	
//	public void addObject(){
//		menuDao=(MenuDao)applicationContext.getBean("menuDao");
//		String menuId=maxValue.nextLongValue()+"";
//		System.out.println(menuId);
//		System.out.println("权限ID"+menuId);
//		Menu menu=new Menu();
//		menu.setMenuId(menuId);
//		menu.setMenuName("系统扩展栏目");
//		menu.setSystemAuthId("61");
//		menuDao.addMenu(menu);
//	}
//	public void delObject(){
//		menuDao=(MenuDao)applicationContext.getBean("menuDao");
//		Menu menu=new Menu();
//		menu.setMenuId("11");
////		menuDao.delMenu(menu);
//	}
//}
