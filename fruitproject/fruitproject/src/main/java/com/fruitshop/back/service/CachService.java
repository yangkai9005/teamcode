package main.java.com.fruitshop.back.service;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
public class CachService {
	protected Cache cache;
	public CachService(Cache cache) {
		this.cache=cache;
	}
	/**
	 * 单量添加或更新到缓存中
	 * @param obj
	 * @param cache
	 * @param key
	 * @param result
	 */
	protected  void addOrUpdateCache(Object key,Object obj,int result) {
		//如果操作数据库成功需要添加到缓存中
		if(result>0&&key!=null&&obj!=null){
			Element ele=new Element(key,obj);
			cache.put(ele);
		}
	}
	
	/**
	 * 批量添加或更新到缓存中
	 * @param obj
	 * @param cache
	 * @param key
	 * @param result
	 */
	protected  void addOrUpdateCache(Object[] key,Object[] obj,int[] result) {
		//如果操作数据库成功需要添加到缓存中
		for(int i=0;i<key.length;i++){
			if(result[i]>0&&key[i]!=null&&obj[i]!=null){
				Element ele=new Element(key[i],obj[i]);
				cache.put(ele);
			}
		}
	}
	/**
	 * 单量从缓存中删掉对象
	 * @param key
	 * @param result
	 */
	protected void delCache(Object key,int result){
		if(result>0&&key!=null){
			cache.remove(key);
		}
	}
	/**
	 * 批量从缓存中删掉对象
	 * @param key
	 * @param result
	 */
	protected void delCache(Object[] key,int[] result){
		for(int i=0;i<key.length;i++){
			if(result[i]>0&&key[i]!=null){
				cache.remove(key);
			}
		}
	}
	
	/**
	 * 获取缓存对象
	 * @param key
	 * @param result
	 */
	protected Object getObjectValue(Object key){
		Element ele=cache.get(key);
		if(ele!=null){
			return ele.getObjectValue();
		}
		return null;
	}
	
	
}
