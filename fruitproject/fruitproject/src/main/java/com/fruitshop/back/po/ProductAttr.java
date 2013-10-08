package main.java.com.fruitshop.back.po;

import java.sql.Date;

public class ProductAttr {
	private String productAttrId;
	private String productId;
	private String productAttrName;
	private String productAttrValue;
	private Date productAttrDate;
	public String getProductAttrId() {
		return productAttrId;
	}
	public void setProductAttrId(String productAttrId) {
		this.productAttrId = productAttrId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductAttrName() {
		return productAttrName;
	}
	public void setProductAttrName(String productAttrName) {
		this.productAttrName = productAttrName;
	}
	public String getProductAttrValue() {
		return productAttrValue;
	}
	public void setProductAttrValue(String productAttrValue) {
		this.productAttrValue = productAttrValue;
	}
	public Date getProductAttrDate() {
		return productAttrDate;
	}
	public void setProductAttrDate(Date productAttrDate) {
		this.productAttrDate = productAttrDate;
	}
	
	
}
