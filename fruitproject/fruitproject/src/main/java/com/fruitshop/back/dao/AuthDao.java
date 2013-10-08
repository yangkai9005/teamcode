/**
 * 权限dao
 */
package main.java.com.fruitshop.back.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import main.java.com.fruitshop.back.po.Auth;
import main.java.com.fruitshop.back.po.AuthMenu;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.mybatis.caches.ehcache.EhcacheCache;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangkai
 *
 */
public class AuthDao  implements BatchBaseDao<Auth>{
	private static final Logger logger=Logger.getLogger(AuthDao.class);
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	
	public List<Auth> getAuthByLevelOrName(Auth auth){
		return sqlSessionTemplate.selectList("getAuthByLevelOrName", auth);
	}
	/**
	 * 添加权限和菜单的关系
	 * @return
	 */
	public int addAuthAndMenuId(@Param("list")List<AuthMenu> authMenus){
		int result=0;
		if(authMenus.size()>0){//存在的话就做添加
			result= sqlSessionTemplate.insert("addAuthAndMenu", authMenus);
		}
		return result;
	}

	@Override
	public void addBatch(String statement, @Param("list")List<Auth> auths) {
		sqlSessionTemplate.insert("inserAuthBatch",auths);
	}

	@Override
	public void delBatch(String statement, @Param("list")List<Auth> params) {
		sqlSessionTemplate.delete("delAuthBatch", params);
	}

	@Override
	public void updateBatch(String statement, List<Auth> objs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Auth selectOne(String statement, Object authId) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne(statement,authId);
	}

	@Override
	public int add(String statement, Auth auth) {
		return sqlSessionTemplate.insert(statement,auth);
	}

	@Override
	public int delete(String statement, Object params) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete(statement,params);
	}

	@Override
	public List<Auth> selectList(String statement, Object params) {
		// TODO Auto-generated method stub
		if(params==null){
			return sqlSessionTemplate.selectList(statement);
		}
		return sqlSessionTemplate.selectList(statement,params);
	}

	@Override
	public int update(String statement, Auth auth) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update(statement, auth);
	}


}
