package main.java.com.fruitshop.back.po;
import java.io.Serializable;
/**
 * 商品种类属性
 * @author yangkai
 * @date Sep 19, 2013
 * @version 1.0
 */
@SuppressWarnings("serial")
public class SpeciesAttr implements Serializable{
	private String speciesAttrId;
	private String speciesAttrName;
	private String speciesAttrFlag;
	private String productSpeciesId;
	public String getSpeciesAttrId() {
		return speciesAttrId;
	}
	public void setSpeciesAttrId(String speciesAttrId) {
		this.speciesAttrId = speciesAttrId;
	}
	public String getSpeciesAttrName() {
		return speciesAttrName;
	}
	public void setSpeciesAttrName(String speciesAttrName) {
		this.speciesAttrName = speciesAttrName;
	}
	public String getSpeciesAttrFlag() {
		return speciesAttrFlag;
	}
	public void setSpeciesAttrFlag(String speciesAttrFlag) {
		this.speciesAttrFlag = speciesAttrFlag;
	}
	public String getProductSpeciesId() {
		return productSpeciesId;
	}
	public void setProductSpeciesId(String productSpeciesId) {
		this.productSpeciesId = productSpeciesId;
	}
	
}
