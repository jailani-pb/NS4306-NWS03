package com.nep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nep.data.ProductRepository;
import com.nep.models.Product;

@Controller
public class ControllerClass {
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(value="/")
	public String index(ModelMap modelMap) {
		List<Product> products = productRepository.getAllProducts();
		modelMap.put("products", products);
		return "index";
	}
	
	@RequestMapping(value="/product/{name}")
	public String product(@PathVariable String name, ModelMap modelMap) {
		Product product = productRepository.findProductByName(name);
		modelMap.put("product", product);
		return "product";
	}
	
	@RequestMapping(value="/search")
	public String search(@RequestParam(required=false) String productName, ModelMap modelMap) {
		List<Product> products;
		if(productName == null) {
			products = productRepository.getAllProducts();
		} else {
			products = productRepository.findProductWithName(productName);
		}
		modelMap.put("products", products);
		return "search";
	}
	
	
}








