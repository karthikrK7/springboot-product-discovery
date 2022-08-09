package com.coderulagam.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@GetMapping("/api/products")
	public String products() {
		return "products";
	}

}
