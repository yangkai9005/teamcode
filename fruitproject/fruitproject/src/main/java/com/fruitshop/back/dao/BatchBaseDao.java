package main.java.com.fruitshop.back.dao;

import java.util.List;

/**
 * 含有批量操作的接口
 * @author yangkai
 * @date Sep 19, 2013
 * @version 1.0
 */
public interface BatchBaseDao<T> extends BaseDao<T> {
	public void addBatch(String statement,List<T> objs);//批量添加
	public void delBatch(String statement,List<T> params);//批量删除
	public void updateBatch(String statement,List<T> objs);//批量更新 
}
