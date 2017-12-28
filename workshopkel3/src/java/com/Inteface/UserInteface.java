/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Inteface;

import com.Model.User;
import java.util.List;

/**
 *
 * @author rudy
 */



//Inteface DAO
public interface UserInteface {
    public void saveUser();
    public List<User> showAllUser();
    public User findUserById(int id);
    public User findUserByName(String name);
    public void deleteUser();
    public void editUser();
}
