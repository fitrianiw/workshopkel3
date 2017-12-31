/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bean;

import com.Model.Orders;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RegistrationFormBean {
    private String nama;
    private String password;
    private String jenis_kelamin;
    private String level;
    private String telp;
    private String alamat;
    private Date tgl_lahir;
    private String email;
    private String username;
    //private List<Orders> ordersList;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public RegistrationFormBean() {
    }

    public RegistrationFormBean(String nama, String password, String jenis_kelamin, String level, String telp, String alamat, String tgl_lahir, String email, String username) {
        this.nama = nama;
        this.password = password;
        this.jenis_kelamin = jenis_kelamin;
        this.level = level;
        this.telp = telp;
        this.alamat = alamat;
        this.tgl_lahir = new Date(tgl_lahir);
        this.email = email;
        this.username = username;
        //this.ordersList = ordersList;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return the telp
     */
    public String getTelp() {
        return telp;
    }

    /**
     * @param telp the telp to set
     */
    public void setTelp(String telp) {
        this.telp = telp;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the tgl_lahir
     */
    public Date getTgl_lahir() {
        return tgl_lahir;
    }

    /**
     * @param tgl_lahir the tgl_lahir to set
     */
    public void setTgl_lahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the ordersList
     */
   /*public List<Orders> getOrdersList() {
        return ordersList;
    }

    /**
     * @param ordersList the ordersList to set
     */
    /*public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }*/

   
}
