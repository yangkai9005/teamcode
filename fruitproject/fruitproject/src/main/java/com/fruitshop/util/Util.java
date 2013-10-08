package main.java.com.fruitshop.util;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import main.java.com.fruitshop.back.po.Auth;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import sun.misc.BASE64Encoder;


public class Util {
	/**
	 * MD5加密
	 * @param text
	 * @return
	 */
	public static String encryptByMD5(String text){
		MessageDigest md5=null;
		String str="";
		try {
			md5 = MessageDigest.getInstance("MD5");
			BASE64Encoder encoder=new BASE64Encoder();
			str=encoder.encode(md5.digest(text.getBytes("UTF-8")));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	/**
	 * 获取map的值
	 * @param map
	 * @param key
	 * @return
	 */
	public static String getMapValue(Map<String, String> map,String key){
		if(map==null||map.size()==0){
			return "";
		}
		return map.get(key)==null?"":map.get(key);
	}
	
}
