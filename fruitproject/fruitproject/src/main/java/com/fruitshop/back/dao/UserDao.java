package main.java.com.fruitshop.back.dao;

import java.util.List;

import main.java.com.fruitshop.back.po.Auth;
import main.java.com.fruitshop.back.po.User;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDao implements BatchBaseDao<User>{
	private static final Logger logger=Logger.getLogger(UserDao.class);
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	/**
	 * 查找所有的用户
	 * @return
	 */
	public List<User> findAllUser(){
		return sqlSessionTemplate.selectList("findAllUser");
	}
	
	/**
	 * 通过用户名查找用户
	 * @return
	 */
	public User getUserByUserName(String userName){
		return sqlSessionTemplate.selectOne("getUserByUserName",userName);
	}
	
	/**
	 * 添加用户
	 * @param user
	 */
	@Override
	public int add(String statement, User user) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert(statement, user);
	}
	
	/**
	 * 通过id删除用户
	 * @param user
	 */
	@Override
	public int delete(String statement, Object userId) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete(statement, userId);
	}
	@Override
	public List<User> selectList(String statement, Object params) {
		if(params==null){
			return sqlSessionTemplate.selectList(statement);
		}
		
		return sqlSessionTemplate.selectList(statement, params);
	}
	@Override
	public User selectOne(String statement, Object params) {
		return sqlSessionTemplate.selectOne(statement, params);
	}
	@Override
	public int update(String statement, User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addBatch(String statement, List<User> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delBatch(String statement, List<User> params) {
		sqlSessionTemplate.delete("delUserBatch", params);
	}
	
	public int delBath(String statement,@Param("list")List<String> list){
		return sqlSessionTemplate.delete("delUserBatch", list);
	}

	@Override
	public void updateBatch(String statement, List<User> objs) {
		// TODO Auto-generated method stub
		
	}
	
	
}
