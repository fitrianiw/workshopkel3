/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bean;

/**
 *
 * @author user
 */
public class ProductFormBean {
    private String dekskripsi;
    private int qty;
    private int id_kategori;
    private double harga;
    private int berat;
    private String nama_product;

    /**
     * @return the dekskripsi
     */
    public String getDekskripsi() {
        return dekskripsi;
    }

    /**
     * @param dekskripsi the dekskripsi to set
     */
    public void setDekskripsi(String dekskripsi) {
        this.dekskripsi = dekskripsi;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the id_kategori
     */
    public int getId_kategori() {
        return id_kategori;
    }

    /**
     * @param id_kategori the id_kategori to set
     */
    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }

    /**
     * @return the berat
     */
    public int getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(int berat) {
        this.berat = berat;
    }

    /**
     * @return the nama_product
     */
    public String getNama_product() {
        return nama_product;
    }

    /**
     * @param nama_product the nama_product to set
     */
    public void setNama_product(String nama_product) {
        this.nama_product = nama_product;
    }
}
