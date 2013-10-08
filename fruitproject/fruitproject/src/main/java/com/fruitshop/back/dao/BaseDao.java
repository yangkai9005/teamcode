package main.java.com.fruitshop.back.dao;

import java.util.List;
/**
 * 所有dao层的接口
 * @author yangkai
 * @date Sep 19, 2013
 * @version 1.0
 * @param <T>
 */
public interface BaseDao<T>{
	public int add(String statement,T t);//添加某个对象
	public int delete(String statement,Object params);//通过条件删除
	public int update(String statement,T t);//更新某个对象
	public T selectOne(String statement,Object params);//根据条件查询某一个对象
	public List<T> selectList(String statement,Object params);//根据条件查询某一个对象
}
