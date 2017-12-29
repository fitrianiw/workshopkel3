/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.LoginFormBean;
import com.DAO.UserService;
import com.Model.User;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Harry
 */
@Controller
@RequestMapping("/login")
public class Login {
    @Autowired
    UserService us;

    @RequestMapping()
    public String goToLogin(Model model) {
        LoginFormBean loginBean = new LoginFormBean();
        model.addAttribute("loginBean", loginBean);
        return "login";
    }

    @RequestMapping(value = "/check")
    public String checkLogin(HttpSession session, @ModelAttribute("loginBean") LoginFormBean loginBean, Model model) {
        User user = us.findByUsername(loginBean.getUsername());
        if(user.getUsername()==null) {
            model.addAttribute("errMsg", "Username salah");
            return "login";
        }
//        String encryptedPassword = PasswordDigest.createEncryptedPassword(loginBean.getPassword());
//        if(!encryptedPassword.equals(customer.getPassword())) {
//            model.addAttribute("errMsg", "Password salah");
//            return "login";
//        }
        
        session.setAttribute("user", user);
        
        return "successlogin";
    
}
}
