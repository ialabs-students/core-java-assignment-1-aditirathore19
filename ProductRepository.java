package com.assignment1;

import java.util.*;

public class ProductRepository {

	private List<Product> pro;
	ProductRepository(){
		pro = new ArrayList<Product>();
		Product pr1 = new Product(101,"earphones",500.00,"electronic");
		Product pr2 = new Product(102,"T-shirt",200.00,"clothing");
		Product pr3 = new Product(103,"headphones",700.00,"electronic");
		Product pr4 = new Product(104,"mobile",10000.00,"electronic");
		Product pr5 = new Product(105,"Jeans",1000.00,"clothing");
		Product pr6 = new Product(106,"Ketchup",300.00,"Food");
		pro.add(pr1);
		pro.add(pr2);
		pro.add(pr3);
		pro.add(pr4);
		pro.add(pr5);
		pro.add(pr6);
	}
	public List<Product> getList(){
		return pro;
	}
}