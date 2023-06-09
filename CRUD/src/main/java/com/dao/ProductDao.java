package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernatetemplete;
	
	
	//for creating
	@Transactional
	public void createProduct(Product p) {
		this.hibernatetemplete.saveOrUpdate(p);
	}
	
	//for get all products
	@Transactional
	public List<Product> getAllproducts(){
		List<Product> products = this.hibernatetemplete.loadAll(Product.class);
		return products;
	}
	
	//delete
	@Transactional
	public void deleteProduct(int pid) {
		Product p = this.hibernatetemplete.load(Product.class, pid);
		this.hibernatetemplete.delete(p);
	}
	
	//get single product
	@Transactional
	public Product getprodProduct(int pid) {
		return this.hibernatetemplete.get(Product.class,pid);
	}
}
