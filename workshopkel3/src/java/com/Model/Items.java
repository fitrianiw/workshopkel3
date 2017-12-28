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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "tbl_items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Items.findAll", query = "SELECT i FROM Items i")
    , @NamedQuery(name = "Items.findByIdItems", query = "SELECT i FROM Items i WHERE i.idItems = :idItems")
    , @NamedQuery(name = "Items.findByQtyBeli", query = "SELECT i FROM Items i WHERE i.qtyBeli = :qtyBeli")
    , @NamedQuery(name = "Items.findByDiscount", query = "SELECT i FROM Items i WHERE i.discount = :discount")
    , @NamedQuery(name = "Items.findBySubTotal", query = "SELECT i FROM Items i WHERE i.subTotal = :subTotal")})
public class Items implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_items")
    private Integer idItems;
    @Basic(optional = false)
    @Column(name = "qty_beli")
    private int qtyBeli;
    @Basic(optional = false)
    @Column(name = "discount")
    private double discount;
    @Basic(optional = false)
    @Column(name = "sub_total")
    private double subTotal;
    @JoinColumn(name = "id_product", referencedColumnName = "id_product")
    @ManyToOne(optional = false)
    private Product idProduct;
    @JoinColumn(name = "id_detail", referencedColumnName = "id_items")
    @ManyToOne(optional = false)
    private Orders idDetail;

    public Items() {
    }

    public Items(int qtyBeli, double discount, double subTotal, Product idProduct) {
        this.idItems = idItems;
        this.qtyBeli = qtyBeli;
        this.discount = discount;
        this.subTotal = subTotal;
        this.idProduct = idProduct;
    }

    public Integer getIdItems() {
        return idItems;
    }

    public void setIdItems(Integer idItems) {
        this.idItems = idItems;
    }

    public int getQtyBeli() {
        return qtyBeli;
    }

    public void setQtyBeli(int qtyBeli) {
        this.qtyBeli = qtyBeli;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public Orders getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Orders idDetail) {
        this.idDetail = idDetail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idItems != null ? idItems.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.idItems == null && other.idItems != null) || (this.idItems != null && !this.idItems.equals(other.idItems))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Model.Items[ idItems=" + idItems + " ]";
    }

}
