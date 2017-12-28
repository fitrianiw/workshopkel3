/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Inteface.ProductInteface;
import com.Model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductService implements ProductInteface{
    
    @PersistenceUnit
    private EntityManagerFactory emf;
    private EntityManager em;

    public ProductService() {
    }
    
    /**
     * @return the emf
     */
    public EntityManagerFactory getEmf() {
        return emf;
    }

    /**
     * @param emf the emf to set
     */
    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    @Override
    public void deleteProduct(int idProduct) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(idProduct);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Product> showAllProduct() {
        em = emf.createEntityManager();
        Query query = em.createQuery("SELECT P FROM Product P");
        List<Product> product = query.getResultList();
        return product;
    }

    @Override
    public Product findProductByKategori(String kategori) {
        Product productKategori = new Product();
        em = emf.createEntityManager();
        Query query = em.createQuery("SELECT P FROM Product P WHERE kategori =:kategori");
        query.setParameter("kategori", kategori);
        productKategori = (Product) query.getResultList();
        return productKategori;
    }

    @Override
    public Product findProductByName(String name) {
        Product productName = new Product();
        em = emf.createEntityManager();
        Query query = em.createQuery("SELECT P FROM Product P WHERE name =:name");
        query.setParameter("name", name);
        productName = (Product) query.getResultList();
        return productName;        
    }

    @Override
    public void saveProduct(Product product) {        
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Product findProductByKategori(String kategori, String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
