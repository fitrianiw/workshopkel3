/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Inteface.OrderInterface;
import com.Model.Items;
import com.Model.Orders;
import com.Model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Harry
 */
@Repository
@Transactional
public class OrderService implements OrderInterface {

    @PersistenceUnit
    private EntityManagerFactory emf;
    private EntityManager em;

    public OrderService() {
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
    public void saveOrder(Orders order) {
    em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(order);
        em.getTransaction().commit();
        em.close();}

    @Override
    public List<Orders> showHistoryOrder() {
    em = emf.createEntityManager();
        Query query = em.createQuery("SELECT o FROM Order o");
        List<Orders> order = query.getResultList();
        return order;    
    }

   
    
    

}
