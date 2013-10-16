package main.java.com.fruitshop.back.web;

import main.java.com.fruitshop.back.po.Product;
import main.java.com.fruitshop.back.service.ProductService;
import main.java.com.fruitshop.back.service.ProductUnitService;
import main.java.com.fruitshop.back.service.SpeciesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	@RequestMapping(value="/addproductval.do")
	public String addProductValue(Model model,@ModelAttribute("product")Product product,String producrAttrs,String producrNames){
		System.out.println("商品"+product);
		System.out.println("属性"+producrAttrs);
		System.out.println("定价"+product.getProductPurchase());
		model.addAttribute("units", unitService.getAllProductUnit());
		model.addAttribute("specieses", speciesService.findAllSpecies());
		return FOLD+"addproduct";
	}
	
	
	
	
	
	
}
