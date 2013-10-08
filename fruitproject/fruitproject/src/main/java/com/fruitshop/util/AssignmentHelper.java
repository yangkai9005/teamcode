package main.java.com.fruitshop.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import main.java.com.fruitshop.cons.Conts;


/**
 * 赋值帮助类，其主要任务是赋值将数据库的值赋到po对象中
 * 严格要求po对象的属性要与数据库中的字段相对应
 * @author yangkai
 *
 */
public class AssignmentHelper {
	/**
	 * 
	 * @param obj 需要赋值对象
	 * @return 已经赋值的对象
	 * @throws SQLException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public  synchronized  static Object setObjectValue(Object obj,ResultSet result) throws SQLException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		Field[] fields=obj.getClass().getDeclaredFields();
		for(Field field:fields){
			RowName rowName=field.getAnnotation(RowName.class);
			if(rowName!=null){
				String type=field.getType().getName();
				String fieldName=field.getName();
				if(haveRowName(result, rowName.value())){
					Method method=obj.getClass().getMethod(getMethodName(fieldName), field.getType());
					method.invoke(obj, choiceCorrespondType(type, rowName.value(), result));
				}
			}
		}
		return obj;
	}
	/**
	 * 选择对应个类型进行赋值
	 * @throws SQLException 
	 */
	private static Object choiceCorrespondType(String type,String fieldName,ResultSet result) throws SQLException{
		if(Conts.STRING.equals(type)){
			return result.getString(fieldName);
		}
		if(Conts.INT.equals(type)){
			return result.getInt(fieldName);
			
		}
		if(Conts.LONG.equals(type)){
			return result.getLong(fieldName);
		}
		return null;
	}
	/**
	 * 判断结果集中是否含有需要查询的字段
	 * @param result
	 * @param fieldName
	 * @return
	 * @throws SQLException
	 */
	private static boolean haveRowName(ResultSet result,String fieldName) throws SQLException{
		ResultSetMetaData metaData=result.getMetaData();//ResultSet的meta数据
		for(int i=1,length=metaData.getColumnCount();i<=length;i++){
			String rowName=metaData.getColumnLabel(i);
			if(rowName.equalsIgnoreCase(fieldName)){
				return true;
			}
		}
		return false;
	}
	
	private static String getMethodName(String fieldName){
		StringBuffer sb=new StringBuffer();
		sb.append("set").append(fieldName.substring(0, 1).toUpperCase()).append(fieldName.substring(1));
		return sb.toString();
	}
	
	public static void main(String[] args) {
//		Auth auth=new Auth();
//		setObjectValue(auth, null);
		System.out.println(getMethodName("yangkai"));
	}
}
