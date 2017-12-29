/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.CartBean;
import com.DAO.ItemService;
import com.DAO.OrderService;
import com.DAO.ProductService;
import com.Model.Items;
import com.Model.Orders;
import com.Model.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Harry
 */
@Controller
@RequestMapping("/order")
public class Order {

    @Autowired
    OrderService os;
    @Autowired
    ItemService iss;
    @Autowired
    ProductService ps;

    @RequestMapping(value = "/save")
    public String saveItems(HttpSession session, ModelMap model) {
        CartBean carts = (CartBean) session.getAttribute("cart");
        double discount=0.0;
        double hargadiscount=0.0;
        Items items=new Items();
        List<Items> itm = new ArrayList<>();
        for (Map.Entry<Integer, Items> entry : carts.getCartlist().entrySet()) {
            Integer key = entry.getKey();
            Object value = entry.getValue();
            itm.add(iss.findItemsById(entry.getValue().getIdItems()));
            items.setIdProduct(entry.getValue().getIdProduct());
            items.setQtyBeli(entry.getValue().getQtyBeli());
            if(entry.getValue().getQtyBeli()>3){
                discount+=0.05;
                hargadiscount=(entry.getValue().getQtyBeli()* entry.getValue().getIdProduct().getHarga()*discount);
            }
            if(entry.getValue().getQtyBeli()<3){
                hargadiscount=(entry.getValue().getQtyBeli()* entry.getValue().getIdProduct().getHarga()*discount);
           
            }
            items.setSubTotal(entry.getValue().getQtyBeli()*entry.getValue().getIdProduct().getHarga()-hargadiscount);
        }
        
        User user=(User) session.getAttribute("user");
        items.setCreatedby(user.getIdUser());
        items.setDiscount(discount);
        items.setUpdatedby(user.getIdUser());
        items.setCreateddate(new Date());
        items.setUpdateddate(new Date());
        
        iss.saveOrderDet(items);
        
        return "redirect:/pembayaran";
    }
    @RequestMapping(value = "/saveord")
    public String saveOrder(HttpSession session,ModelMap model){
        CartBean cart=(CartBean) session.getAttribute("cart");
        Orders order=new Orders();
        User user=(User) session.getAttribute("user");
        order.setIdUser(user.getIdUser());
            
        return "/welcome";
    }
}
