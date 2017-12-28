/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_kategori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "lKategori.findAll", query = "SELECT l FROM lKategori l")
    , @NamedQuery(name = "lKategori.findByIdKetegori", query = "SELECT l FROM lKategori l WHERE l.idKetegori = :idKetegori")
    , @NamedQuery(name = "lKategori.findByKategori", query = "SELECT l FROM lKategori l WHERE l.kategori = :kategori")})
public class Kategori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ketegori")
    private Integer idKetegori;
    @Basic(optional = false)
    @Column(name = "kategori")
    private String kategori;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKategori")
    private List<Product> productList;

    public Kategori() {
    }

    public Kategori(Integer idKetegori) {
        this.idKetegori = idKetegori;
    }

    public Kategori(Integer idKetegori, String kategori) {
        this.idKetegori = idKetegori;
        this.kategori = kategori;
    }

    public Integer getIdKetegori() {
        return idKetegori;
    }

    public void setIdKetegori(Integer idKetegori) {
        this.idKetegori = idKetegori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKetegori != null ? idKetegori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kategori)) {
            return false;
        }
        Kategori other = (Kategori) object;
        if ((this.idKetegori == null && other.idKetegori != null) || (this.idKetegori != null && !this.idKetegori.equals(other.idKetegori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Model.lKategori[ idKetegori=" + idKetegori + " ]";
    }
    
}
