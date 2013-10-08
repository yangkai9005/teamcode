package test.dao;

import java.util.ArrayList;
import java.util.List;

import main.java.com.fruitshop.back.po.Menu;

/**
 * @author yangkai
 * @date Sep 3, 2013
 * @version 1.0
 */
public class Test {
	public static void main(String[] args) {
		List<String> lists=new ArrayList<String>();
		lists.add("yangkai");
		lists.add("yanglei");
		lists.add("123");
		for(int i=lists.size()-1;i>=0;i--){
			System.out.println(lists.remove(lists.get(i)));
		}
	}
}
