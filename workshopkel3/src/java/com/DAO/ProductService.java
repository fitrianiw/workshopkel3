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
import javax.persistence.TemporalType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductService implements ProductInteface {

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
        Query query = em.createQuery("SELECT p from Product p ");
        List<Product> product = query.getResultList();
        return product;
    }

    @Override
    public List<Product> findProductByKategori(String kategori) {
        //Product productKategori = new Product();
        em = emf.createEntityManager();
        Query query = em.createQuery("SELECT P FROM Product P WHERE kategori =:kategori");
        query.setParameter("kategori", kategori);
        List<Product> productKategori = query.getResultList();
        return productKategori;
    }

    @Override
    public List<Product> findProductByName(String name) {
        //Product productName = new Product();
        em = emf.createEntityManager();
        Query query = em.createQuery("SELECT P FROM Product P WHERE name =:name");
        query.setParameter("name", name);
        List<Product> productName = query.getResultList();
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
    public List<Product> findProductByKategori(String kategori, String keyword) {
        em = emf.createEntityManager();
        Query q = em.createQuery("select from Product p where p.idKategori.kategori = :kategori and UPPER(p.namaProduct) LIKE '%'||UPPER(:keyword)||'%'");
        q.setParameter("kategori", kategori);
        q.setParameter("keyword", keyword);
        List<Product> prod = q.getResultList();
        return prod;
    }
    
   public Product findProductById(int id)
   {
       em = emf.createEntityManager();
       Product pro = em.find(Product.class, id);
       return pro;
   }

}
