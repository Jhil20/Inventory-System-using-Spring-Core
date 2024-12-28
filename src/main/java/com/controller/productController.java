package com.controller;

import com.DAO.dbDAO;
import com.bean.categories;
import com.bean.product;
import com.bean.suppliers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class productController {
    @Autowired
    dbDAO dbDAO;

    @RequestMapping(value = "/showProductForm")
    public String showForm(Model model)
    {
        model.addAttribute("product", new product());
        model.addAttribute("suppliers", new suppliers());
        model.addAttribute("categories", new categories());
        return "productRegister";
    }

    @RequestMapping(value = "/registerProduct",method = RequestMethod.POST)
    public void RegisterProduct(
            @ModelAttribute("product") product products,
            @ModelAttribute("suppliers") suppliers suppliers,
            @ModelAttribute("categories") categories categories)
    {
        List<product> product = new ArrayList<>();
        List<suppliers> supplier = new ArrayList<>();
        Set<product> productCategory = new HashSet<>();

        productCategory.add(products);
        product.add(products);
        supplier.add(suppliers);

        products.setSupplierId(supplier);
        suppliers.setProductId(product);
        categories.setProductsId(productCategory);
        products.setCategoryId(categories);

        dbDAO.registerProduct(products,suppliers,categories);

    }

}
