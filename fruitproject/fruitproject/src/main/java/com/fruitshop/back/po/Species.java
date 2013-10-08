package main.java.com.fruitshop.back.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品种类
 * @author yangkai
 * @date Sep 19, 2013
 * @version 1.0
 */
@SuppressWarnings("serial")
public class Species implements Serializable{
	private String productSpeciesId;
	private String productSpeciesName;
	private String productSpeciesValue;
	private List<SpeciesAttr> attrList=new ArrayList<SpeciesAttr>();
	public String getProductSpeciesId() {
		return productSpeciesId;
	}
	public void setProductSpeciesId(String productSpeciesId) {
		this.productSpeciesId = productSpeciesId;
	}
	public String getProductSpeciesName() {
		return productSpeciesName;
	}
	public void setProductSpeciesName(String productSpeciesName) {
		this.productSpeciesName = productSpeciesName;
	}
	public String getProductSpeciesValue() {
		return productSpeciesValue;
	}
	public void setProductSpeciesValue(String productSpeciesValue) {
		this.productSpeciesValue = productSpeciesValue;
	}
	public List<SpeciesAttr> getAttrList() {
		return attrList;
	}
	public void setAttrList(List<SpeciesAttr> attrList) {
		this.attrList = attrList;
	}
	
	
}
