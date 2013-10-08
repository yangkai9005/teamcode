package main.java.com.fruitshop.back.web;

import main.java.com.fruitshop.back.service.ProductService;
import main.java.com.fruitshop.back.service.ProductUnitService;
import main.java.com.fruitshop.back.service.SpeciesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	private static final String FOLD="back/product/";
	@Autowired
	private SpeciesService speciesService;
	@Autowired
	private ProductUnitService unitService;
	@Autowired
	private ProductService productService;
	@RequestMapping(value="/newpurchase.do")
	public String jumpToAddProductPane(Model model){
		model.addAttribute("units", unitService.getAllProductUnit());
		model.addAttribute("specieses", speciesService.findAllSpecies());
		return FOLD+"addproduct";
	}
	
	
	@RequestMapping(value="/addproduct.do")
	public String addProductValue(Model model){
		model.addAttribute("units", unitService.getAllProductUnit());
		model.addAttribute("specieses", speciesService.findAllSpecies());
		return FOLD+"addproduct";
	}
	
	
	
	
	
}
