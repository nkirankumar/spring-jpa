package com.my.pack.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseDaoImpl {
	@PersistenceContext
	private EntityManager entityManager;
	public BaseDaoImpl(){
		super();
	}
    public EntityManager getEm() {
        return entityManager;
    }
 
    public void setEm(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
