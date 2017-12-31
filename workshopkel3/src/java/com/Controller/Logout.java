/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.CartBean;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/logout")
public class Logout {
    @RequestMapping()
    public String logout(HttpSession session,CartBean cb, Model model) {

        if (session.getAttribute("cart") != null) {
            cb = (CartBean) session.getAttribute("cart");
            //cb.getCarts().clear();
        }
        session.removeAttribute("cart");
        session.invalidate();
        return "index";
    }
}
