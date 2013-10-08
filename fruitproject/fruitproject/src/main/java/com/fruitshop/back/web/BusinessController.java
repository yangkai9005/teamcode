package main.java.com.fruitshop.back.web;

import main.java.com.fruitshop.back.po.Business;
import main.java.com.fruitshop.back.service.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BusinessController {
	private static final String FOLD="back/product/";
	@Autowired
	private BusinessService businessService;
	
	@Autowired
	private MySQLMaxValueIncrementer maxInc;
	
	@RequestMapping(value="/addbusinesspane.do")
	public String jumpToProductBusinesPane(){
		return FOLD+"addbusiness";
	}
	
	
	
	@RequestMapping(value="/businesspane.do")
	public String jumpToBusinesspanePane(Model model){
		model.addAttribute("businesses", businessService.getAllBusiness());
		return FOLD+"businesspane";
	}
	
	@RequestMapping(value="/addbusinessval.do")
	public String addBusinessVal(Model model,@ModelAttribute("business")Business business){
		businessService.addBusiness(business);
		model.addAttribute("businesses", businessService.getAllBusiness());
		return FOLD+"businesspane";
	}
	
	@RequestMapping(value="/getbusinessbyid.do")
	public String getBusinessById(Model model,String businessId){
		model.addAttribute("business", businessService.getBusinessById(businessId));
		return FOLD+"businesscard";
	}
	
	@RequestMapping(value="/updatebusinessval.do")
	public String updateBusinessVal(Model model,@ModelAttribute("business")Business business){
		businessService.updateBusiness(business);
		model.addAttribute("businesses", businessService.getAllBusiness());
		return FOLD+"businesspane";
	}
	
	@RequestMapping(value="/updatebusinesspane.do")
	public String jumpBusinesspane(Model model,String businessId){
		model.addAttribute("business", businessService.getBusinessById(businessId));
		return FOLD+"updatebusiness";
	}
	
	@RequestMapping(value="/delbusiness.do")
	public String delBusinessVal(Model model,String businessId){
		businessService.delBusiness(businessId);
		model.addAttribute("businesses", businessService.getAllBusiness());
		return FOLD+"businesspane";
	}
}
