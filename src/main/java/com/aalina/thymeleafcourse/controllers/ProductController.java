package com.aalina.thymeleafcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @RequestMapping({"/product", "/product.html"})
    public String getProduct() {
        return "product";
    }
}
