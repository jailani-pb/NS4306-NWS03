package com.nep.data;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.nep.models.Product;

@Transactional
public interface ProductDAO extends CrudRepository<Product, Long> {

	List<Product> findByNameIgnoreCase(String name);
	
}
