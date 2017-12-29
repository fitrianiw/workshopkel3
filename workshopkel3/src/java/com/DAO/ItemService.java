/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import com.Model.Items;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class ItemService {
    
    @PersistenceUnit
    private EntityManagerFactory emf;
    private EntityManager em;

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
    
    public Items findItemsById(int id){
        em=emf.createEntityManager();
        Items items=em.find(Items.class,id);
        return items;
    }
   
    public void saveOrderDet(Items item) {
    em=emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(item);
    em.getTransaction().commit();
    em.close();
    }
}
