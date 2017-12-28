/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.ProductFormBean;
import com.DAO.KategoriService;
import com.DAO.ProductService;
import com.Model.Kategori;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/product")
public class Product {
    
    @Autowired
    ProductService prodService;
    @Autowired
    KategoriService kat;
    
    @RequestMapping("/allproduct")
    public String getAllProduct(Model model){        
        List<com.Model.Product> products = prodService.showAllProduct();
        model.addAttribute("products", products);
        return "product";
    }
    
    @RequestMapping("/kategoriproduct")
    public String getProductByCategori(@PathVariable String categori, Model model){
        com.Model.Product prodKategori = (com.Model.Product) prodService.findProductByKategori(categori);
        model.addAttribute("prodKategori", prodKategori);
        return "product_kategori";
    }
    
    @RequestMapping("/saveproduct")
    public String saveProduct(@ModelAttribute("productBean") ProductFormBean productBean, Model model){
        com.Model.Product prod = new com.Model.Product();
        prod.setDeskripsi(productBean.getDekskripsi());
        prod.setQty(productBean.getQty());
        prod.setHarga(productBean.getHarga());
        prod.setBerat(productBean.getBerat());
        prod.setIdKategori(kat.findById(productBean.getId_kategori()));
        prod.setNamaProduct(productBean.getNama_product());
        model.addAttribute("data", prod);
        return "save_product";
    }
    
}
