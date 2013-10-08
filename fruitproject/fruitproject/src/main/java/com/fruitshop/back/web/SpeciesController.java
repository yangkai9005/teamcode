package main.java.com.fruitshop.back.web;

import java.util.List;

import main.java.com.fruitshop.back.dao.AuthDao;
import main.java.com.fruitshop.back.po.Species;
import main.java.com.fruitshop.back.po.SpeciesAttr;
import main.java.com.fruitshop.back.service.SpeciesAttrService;
import main.java.com.fruitshop.back.service.SpeciesService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.MySQLMaxValueIncrementer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yangkai
 * @date Sep 19, 2013
 * @version 1.0
 */
@Controller
public class SpeciesController {
	private static final String FOLDER="back/product/";//后台控制文件夹
	private static final Logger logger=Logger.getLogger(SpeciesController.class);
	@Autowired
	private SpeciesService speciesService;
	@Autowired
	private SpeciesAttrService attrService;
	@Autowired
	private MySQLMaxValueIncrementer maxInc;
	@RequestMapping("/speciespane.do")
	public String jumpToSpeciesPane(Model model){
		model.addAttribute("speciesList", speciesService.findAllSpecies());
		return FOLDER+"productspecies";
	}
	@RequestMapping(value="/addspeciespane.do")
	public String jumpToAddSpeciesPane(){
		return FOLDER+"addspecies";
	}
	@RequestMapping("/addspeciesval.do")
	public String addSpecies(Model model,String speciesName,String attrname,String attrval){
		Species species=new Species();
		String speciesId=maxInc.nextLongValue()+"";//商品种类主键ID
		species.setProductSpeciesId(speciesId);
		species.setProductSpeciesValue("SPECIES"+speciesId);
		species.setProductSpeciesName(speciesName);
		List<SpeciesAttr> attrList=species.getAttrList();
		String[] speciesAttrNames=attrname.split(",");
		String[] speciesAttrFlags=attrval.split(",");
		for(int i=0,length=speciesAttrNames.length;i<length;i++){
			SpeciesAttr attr=new SpeciesAttr();
			attr.setSpeciesAttrId(maxInc.nextLongValue()+"");
			attr.setProductSpeciesId(speciesId);
			attr.setSpeciesAttrFlag(speciesId+speciesAttrFlags[i]);
			attr.setSpeciesAttrName(speciesAttrNames[i]);
			attrList.add(attr);
		}
		speciesService.addSpecies(species);
		model.addAttribute("speciesList", speciesService.findAllSpecies());
		return FOLDER+"productspecies";
	}
	@RequestMapping("/getspeciesattr.do")
	public String findAttrInfor(Model model,String speciesId){
		List<SpeciesAttr> attrList=attrService.getAttrBySpeciesId(speciesId);
		model.addAttribute("attrList", attrList);
		return FOLDER+"speciesattrInfor";
	}
	
	public void delSpecies(String speciesId){
		speciesService.delSpecies(speciesId);
	}
	
	public void updateSpecies(Species species){
		speciesService.updateSpecies(species);
	}
}
