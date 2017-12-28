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
    private int discount;
    @Basic(optional = false)
    @Column(name = "sub_total")
    private int subTotal;
    @JoinColumn(name = "id_detail", referencedColumnName = "id_items")
    @ManyToOne(optional = false)
    private Orders idDetail;
    @JoinColumn(name = "id_product", referencedColumnName = "id_product")
    @ManyToOne(optional = false)
    private Product idProduct;

    public Items() {
    }

    public Items(Integer idItems) {
        this.idItems = idItems;
    }

    public Items(Integer idItems, int qtyBeli, int discount, int subTotal) {
        this.idItems = idItems;
        this.qtyBeli = qtyBeli;
        this.discount = discount;
        this.subTotal = subTotal;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public Orders getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Orders idDetail) {
        this.idDetail = idDetail;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
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
