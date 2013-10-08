package main.java.com.fruitshop.cons;

import main.java.com.fruitshop.util.Util;

/**
 * 常量类
 * @author yangkai
 *
 */
public class Conts {
	public static final String USER_CODE_FLAG="usercodeflag";
	public static final String USER_CODE=Util.encryptByMD5("shopuser");
	public static final String STRING="java.lang.String";//数据类型
	public static final String INT="int";//整型
	public static final String UTIL_DATE="java.util.Date";//日起
	public static final String LONG="java.util.Long";
	public static final String MENU_FLAG="menu";//菜单缓存标识
	public static final String MENU_REL_CHILD_FLAG="menurelchild";
	public static final String AUTH_FLAG="auth";
	public static final String AUTH_REL_MENU_FLAG="menurelmenu";
	public static final String MENU_CHILD_FLAG="menuchild";
	public static final String USER_AUTH="userAuth";
}
