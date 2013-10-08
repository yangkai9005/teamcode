package main.java.com.fruitshop.back.po;

/**
 * 商品表
 * @author yangkai
 * @date Sep 20, 2013
 * @version 1.0
 */
public class Commodity {
	private String commodityId;
	private String productId;
	private String commodityName;
	private int commodityNum;
	private String commodityNotice;
	private String commodityDesc;
	private String commodityFlag;
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public int getCommodityNum() {
		return commodityNum;
	}
	public void setCommodityNum(int commodityNum) {
		this.commodityNum = commodityNum;
	}
	public String getCommodityNotice() {
		return commodityNotice;
	}
	public void setCommodityNotice(String commodityNotice) {
		this.commodityNotice = commodityNotice;
	}
	public String getCommodityDesc() {
		return commodityDesc;
	}
	public void setCommodityDesc(String commodityDesc) {
		this.commodityDesc = commodityDesc;
	}
	public String getCommodityFlag() {
		return commodityFlag;
	}
	public void setCommodityFlag(String commodityFlag) {
		this.commodityFlag = commodityFlag;
	}
	
}
