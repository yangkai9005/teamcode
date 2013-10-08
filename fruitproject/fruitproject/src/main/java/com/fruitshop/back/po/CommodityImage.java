package main.java.com.fruitshop.back.po;

/**
 * 商品图片类
 * @author yangkai
 * @date Sep 20, 2013
 * @version 1.0
 */
public class CommodityImage {
	private String commodityImageId;//商品图片主键
	private String commodityImageName;//商品图片名称
	private String commodityImageUrl;//商品图片地址
	private String commodityId;//商品主键
	private String commodityImageFlag;//商品图片标识
	public String getCommodityImageId() {
		return commodityImageId;
	}
	public void setCommodityImageId(String commodityImageId) {
		this.commodityImageId = commodityImageId;
	}
	public String getCommodityImageName() {
		return commodityImageName;
	}
	public void setCommodityImageName(String commodityImageName) {
		this.commodityImageName = commodityImageName;
	}
	public String getCommodityImageUrl() {
		return commodityImageUrl;
	}
	public void setCommodityImageUrl(String commodityImageUrl) {
		this.commodityImageUrl = commodityImageUrl;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityImageFlag() {
		return commodityImageFlag;
	}
	public void setCommodityImageFlag(String commodityImageFlag) {
		this.commodityImageFlag = commodityImageFlag;
	}
	
}
