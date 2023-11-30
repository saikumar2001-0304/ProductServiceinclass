package com.example.productServiceinclass;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/product")
public class ProductServiceController {
	
	@GetMapping(path="/getp")
	public void getproducts(@RequestParam String product_name,@RequestParam int cost)
	{
		System.out.println(product_name + cost);
	}
	@GetMapping(path="geta")
	public void saveProducts(@RequestParam String product_name,@RequestParam int cost)
	{
		System.out.println("saving is "+product_name +" "+cost);
	}

}
