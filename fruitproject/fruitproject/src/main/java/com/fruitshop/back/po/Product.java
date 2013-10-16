package main.java.com.fruitshop.back.po;

import java.sql.Date;
import java.util.List;
/**
 * 产品类
 * @author yangkai
 * @date Sep 20, 2013
 * @version 1.0
 */
public class Product {
	private String productId;
	private String productName;
	private String productUnit;
	private int productNum;
	private int productLevel;
	private String productSpecies;
	private float productPurchase;
	private Date productDate;
	private String productDesc;
	private String[] producrAttrs;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public int getProductLevel() {
		return productLevel;
	}
	public void setProductLevel(int productLevel) {
		this.productLevel = productLevel;
	}
	public String getProductSpecies() {
		return productSpecies;
	}
	public void setProductSpecies(String productSpecies) {
		this.productSpecies = productSpecies;
	}
	public float getProductPurchase() {
		return productPurchase;
	}
	public void setProductPurchase(float productPurchase) {
		this.productPurchase = productPurchase;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String[] getProducrAttrs() {
		return producrAttrs;
	}
	public void setProducrAttrs(String[] producrAttrs) {
		this.producrAttrs = producrAttrs;
	}
	
}
