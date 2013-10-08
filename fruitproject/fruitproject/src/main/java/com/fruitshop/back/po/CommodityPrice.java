package main.java.com.fruitshop.back.po;

/**
 * 商品定价计划
 * @author yangkai
 * @date Sep 20, 2013
 * @version 1.0
 */
public class CommodityPrice {
	private String commodityPriceId;//商品定价主键
	private String commodityId;//商品ID
	private String commodityPriceIsReduce;//商品是否降价
	private String commodityHistoryPrice;//商品原价
	private String commodityNowPrice;//商品现价
	public String getCommodityPriceId() {
		return commodityPriceId;
	}
	public void setCommodityPriceId(String commodityPriceId) {
		this.commodityPriceId = commodityPriceId;
	}
	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityPriceIsReduce() {
		return commodityPriceIsReduce;
	}
	public void setCommodityPriceIsReduce(String commodityPriceIsReduce) {
		this.commodityPriceIsReduce = commodityPriceIsReduce;
	}
	public String getCommodityHistoryPrice() {
		return commodityHistoryPrice;
	}
	public void setCommodityHistoryPrice(String commodityHistoryPrice) {
		this.commodityHistoryPrice = commodityHistoryPrice;
	}
	public String getCommodityNowPrice() {
		return commodityNowPrice;
	}
	public void setCommodityNowPrice(String commodityNowPrice) {
		this.commodityNowPrice = commodityNowPrice;
	}
	
	
}
