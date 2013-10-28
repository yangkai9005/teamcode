package main.java.com.fruitshop.back.web;

import java.util.ArrayList;
import java.util.List;

import main.java.com.fruitshop.back.po.ProductUnit;
import main.java.com.fruitshop.back.service.ProductUnitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductUnitController {
	private static final String FOLD="back/product/";
	@Autowired
	private ProductUnitService unitService;
	@Autowired
	private MySQLMaxValueIncrementer maxInc;
	@RequestMapping(value="/addtunitpane.do")
	public String jumpToAddProductUnitPane(){
		return FOLD+"addproductunit";
	}
	
	@RequestMapping(value="/unitpane.do")
	public String jumpToProductUnitPane(Model model){
		model.addAttribute("units", unitService.getAllProductUnit());
		return FOLD+"productunit";
	}
	
	@RequestMapping(value="/addunitval.do")
	public String addProductUnit(Model model,@ModelAttribute("form1")ProductUnit unit){
		unit.setUnitId(maxInc.nextLongValue()+"");
		unitService.addProductUnit(unit);
		model.addAttribute("units", unitService.getAllProductUnit());
		return FOLD+"productunit";
	}
	/**
	 * 更新单位
	 * @param model
	 * @param unit
	 * @return
	 */
	@RequestMapping(value="/updateunit.do")
	@ResponseBody
	public String updateProductUnit(Model model,String unitId,String unitName,String unitValue){
		ProductUnit unit=new ProductUnit();
		unit.setUnitId(unitId);
		unit.setUnitName(unitName);
		unit.setUnitValue(unitValue);
		int num=unitService.updateProductUnit(unit);
		return returnOperResult(num);
	}
	/**
	 * 删除单位
	 * @param model
	 * @param unitId
	 * @return
	 */
	@RequestMapping(value="/delunit.do")
	public String delProductUnit(Model model,String unitId){
		unitService.delProductUnit(unitId);
		model.addAttribute("units", unitService.getAllProductUnit());
		return FOLD+"productunit";
	}
	
	@RequestMapping(value="/delbathunit.do")
	public String delBathUnit(Model model,@RequestParam String ids){
		String idArray[]=ids.split(",");
		List<String> list=new ArrayList<String>();
		for (String id:idArray) {
			list.add(id);
		}
		unitService.delUnitBatch(list);
		model.addAttribute("units", unitService.getAllProductUnit());
		return FOLD+"productunit";
	}

	/**
	 * 返回操作结果
	 * @param num
	 * @return
	 */
	private String returnOperResult(int num) {
		if(num>0){//删除成功
			return "1";
		}
		else{//删除失败
			return "0";
		}
	}
}
