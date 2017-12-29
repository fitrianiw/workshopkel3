/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_product")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByIdProduct", query = "SELECT p FROM Product p WHERE p.idProduct = :idProduct")
    , @NamedQuery(name = "Product.findByDeskripsi", query = "SELECT p FROM Product p WHERE p.deskripsi = :deskripsi")
    , @NamedQuery(name = "Product.findByQty", query = "SELECT p FROM Product p WHERE p.qty = :qty")
    , @NamedQuery(name = "Product.findByHarga", query = "SELECT p FROM Product p WHERE p.harga = :harga")
    , @NamedQuery(name = "Product.findByBerat", query = "SELECT p FROM Product p WHERE p.berat = :berat")
    , @NamedQuery(name = "Product.findByNamaProduct", query = "SELECT p FROM Product p WHERE p.namaProduct = :namaProduct")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_product")
    private Integer idProduct;
    @Basic(optional = false)
    @Column(name = "deskripsi")
    private String deskripsi;
    @Basic(optional = false)
    @Column(name = "qty")
    private int qty;
    @Basic(optional = false)
    @Column(name = "harga")
    private double harga;
    @Basic(optional = false)
    @Column(name = "berat")
    private int berat;
    @Basic(optional = false)
    @Column(name = "nama_product")
    private String namaProduct;
    @Basic(optional = false)
    @Lob
    @Column(name = "image")
    private String image;
    @JoinColumn(name = "id_kategori", referencedColumnName = "id_ketegori")
    @ManyToOne(optional = false)
    private Kategori idKategori;

    public Product() {
    }

    public Product(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Product(Integer idProduct, String deskripsi, int qty, double harga, int berat, String namaProduct, String image) {
        this.idProduct = idProduct;
        this.deskripsi = deskripsi;
        this.qty = qty;
        this.harga = harga;
        this.berat = berat;
        this.namaProduct = namaProduct;
        this.image = image;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getNamaProduct() {
        return namaProduct;
    }

    public void setNamaProduct(String namaProduct) {
        this.namaProduct = namaProduct;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Kategori getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(Kategori idKategori) {
        this.idKategori = idKategori;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduct != null ? idProduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.idProduct == null && other.idProduct != null) || (this.idProduct != null && !this.idProduct.equals(other.idProduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Model.Product[ idProduct=" + idProduct + " ]";
    }
    
}
