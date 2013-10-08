package main.java.com.fruitshop.common;

import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

public class CacheOper {
	private Cache cache;
	public CacheOper(Cache cache) {
		this.cache=cache;
	}
	/**
	 * 添加或更新到缓存中
	 * @param obj
	 * @param cache
	 * @param key
	 * @param result
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws NoSuchMethodException
	 */
	public  void addOrUpdateCache(Object obj,Object key,int result) throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
		//如果操作数据库成功需要添加到缓存中
		if(result>0){
			Element ele=new Element(key,obj);
			cache.put(ele);
		}
	}
	
	public void delCache(Object key,int result){
		if(result>0){
			cache.remove(key);
		}
	}
	
}
