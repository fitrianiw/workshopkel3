/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Harry
 */
@Controller
@RequestMapping(value="/login")
public class Login {
    
    @RequestMapping()
    public String test() {
        return "Login";
    }
    
}
