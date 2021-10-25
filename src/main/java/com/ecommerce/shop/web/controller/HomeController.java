package com.ecommerce.shop.web.controller;

import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ProductService productServiceImpl;

    @GetMapping("/say-hello")
    public @ResponseBody String getWelcomeMessage(){
        return "Welcome to my first spring application";
    }

    @GetMapping("/index1")
    public String getIndex(Model model){
        List<Product> productList= productServiceImpl.findAll();
        model.addAllAttributes(productList);
        return "index1";
    }
    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }
    @GetMapping("/product1")
    public String getProduct(){
        return "product1";
    }
    @GetMapping("/services")
    public String getService(){
        return "services";
    }
    @GetMapping("/single")
    public String getSingle(){
        return "single";
    }
    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
}
