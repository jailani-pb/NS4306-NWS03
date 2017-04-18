package com.nep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nep.data.ProductDAO;
import com.nep.data.ProductRepository;
import com.nep.models.Product;

@Controller
public class ControllerClass {
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(value="/")
	public String index(ModelMap modelMap) {
//		List<Product> products = productRepository.getAllProducts();
		List<Product> products =
				(List<Product>) productDAO.findAll();
		modelMap.put("products", products);
		return "index";
	}
	
	@RequestMapping(value="/product/{id}")
	public String product(@PathVariable String id, ModelMap modelMap) {
		try {
			long idInLong = Long.parseLong(id);
			if(productDAO.exists(idInLong)) {
				Product product = productDAO.findOne(idInLong);
				modelMap.put("product", product);
			}
		} catch (NumberFormatException e) {
			
		}
//		Product product = productRepository.findProductByName(name);
//		modelMap.put("product", product);
		return "product";
	}
	
	@RequestMapping(value="/search")
	public String search(@RequestParam(required=false) String productName, ModelMap modelMap) {
		List<Product> products;
		if(productName == null) {
//			products = productRepository.getAllProducts();
			products = (List<Product>) productDAO.findAll();
		} else {
//			products = productRepository.findProductWithName(productName);
			products = productDAO.findByNameIgnoreCase(productName);
		}
		modelMap.put("products", products);
		return "search";
	}
	
	@RequestMapping(value="/addproduct")
	public String addProduct(
			@RequestParam(required=false) String name,
			@RequestParam(required=false) String price,
			@RequestParam(required=false) String file,
			@RequestParam(required=false) String instock,
			ModelMap modelMap
			) {
		boolean addSuccessful;
		boolean addFailed;
		if(name==null && price==null && file==null && instock==null) {
			addSuccessful = false;
			addFailed = false;
		} else {
			if(name==null || price==null || file==null || instock==null) {
				addSuccessful = false;
				addFailed = true;
			} else {
				try {
					double priceInDouble = Double.parseDouble(price);
					boolean instockInBoolean = Boolean.parseBoolean(instock);
					Product product = new Product(name, priceInDouble,
							file, instockInBoolean);
					productDAO.save(product);
					addSuccessful = true;
					addFailed = false;
				} catch (NumberFormatException e) {
					addSuccessful = false;
					addFailed = true;
				}
			}
		}
		modelMap.put("successful", addSuccessful);
		modelMap.put("failed", addFailed);
		return "addproduct";
	}
	
	@RequestMapping(value="/removeproduct")
	public String removeProduct(
			@RequestParam(required=false) String id,
			ModelMap modelMap
			) {
		boolean removeSuccessful = false;
		boolean removeFailed = false;
		if(id==null) {
			removeSuccessful = false;
			removeFailed = false;
		} else {
			try {
				long idInLong = Long.parseLong(id);
				if(productDAO.exists(idInLong)) {
					productDAO.delete(idInLong);
					removeSuccessful = true;
					removeFailed = false;
				} else {
					removeSuccessful = false;
					removeFailed = true;
				}
			} catch (NumberFormatException e) {
				removeSuccessful = false;
				removeFailed = true;
			}
		}
		return "removeproduct";
	}
	
	@RequestMapping(value="/findproduct")
	public String findProduct(
			@RequestParam(required=false) String id
			) {
		if(id == null) {
			return "findproduct";
		} else {
			try {
				long idInLong = Long.parseLong(id);
				if(productDAO.exists(idInLong)) {
					return "redirect:/updateproduct/" + idInLong;
				} else {
					return "findproduct";
				}
			} catch (NumberFormatException e) {
				return "findproduct";
			}
		}
	}
	
	@RequestMapping(value="/updateproduct/{id}")
	public String updateProduct(
			@PathVariable String id,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String price,
			@RequestParam(required = false) String file,
			@RequestParam(required = false) String instock,
			ModelMap modelMap
			) {
		try {
			long idInLong = Long.parseLong(id);
			Product product = productDAO.findOne(idInLong);
			if(product == null) {
				return "redirect:/findproduct";
			} else {
				if(name==null && price==null
						&& file==null && instock==null) {
					
				} else {
					if(name==null || price==null
							|| file==null || instock==null) {
						
					} else {
						try {
							double priceInDouble = Double.parseDouble(price);
							boolean instockInBoolean = Boolean.parseBoolean(instock);
							
							product.setName(name);
							product.setPrice(priceInDouble);
							product.setPicFile(file);
							product.setInStock(instockInBoolean);
							productDAO.save(product);
							modelMap.put("product", product);
							return "updateproduct";
						} catch (NumberFormatException e) {
							
						}
					}
				}
				modelMap.put("product", product);
				return "updateproduct";
			}
		} catch (NumberFormatException e) {
			return "redirect:/findproduct";
		}
	}
	
	
}













