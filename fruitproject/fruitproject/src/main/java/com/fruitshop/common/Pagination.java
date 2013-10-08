package main.java.com.fruitshop.common;

public class Pagination {
	private int dataTotal;//总共有多少数据
	private int pageSize;//页面大小，即每页显示的数量
	private int pageNum;//有几页
	public Pagination(int pageSize,int dataTotal){
		this.pageSize=pageSize;
		this.dataTotal=dataTotal;
	}
	
	/**
	 * 得到可以分的页数
	 * @return
	 */
	public int getPageNum(){
		if(dataTotal%pageSize==0){
			pageNum=dataTotal/pageSize;
		}
		else{
			pageNum=dataTotal/pageSize+1;
		}
		return pageNum;
	}
}
