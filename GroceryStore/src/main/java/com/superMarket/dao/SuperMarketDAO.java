package com.superMarket.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.superMarket.dto.Grocery;
import com.superMarket.dto.Stationary;
import com.superMarket.dto.Vegetables;

public class SuperMarketDAO {
	private static SuperMarketDAO repository;
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("mydeen");
	private SuperMarketDAO() {
		
	}
	
	public static SuperMarketDAO getInstance() {
		if(repository==null) {
			repository=new SuperMarketDAO();
		}
		return repository;
	}

	public void addItem(Grocery g) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(g);
		et.commit();
	}
	public List getAll() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select g from Grocery g");
		return q.getResultList();
	}

	public String updateItem(int id, int count) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Grocery g = em.find(Grocery.class, id);
		
		if (g != null) {
			g.setCount(count);
			
			et.begin();
			em.merge(g);
			et.commit();
			
			return "Updatetd";
		}else {
			return "invalid Id";
		}
	}

	public void addItem(Vegetables v) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(v);
		et.commit();
	}

	public void addItem(Stationary s) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(s);
		et.commit();
	}

	public List<Vegetables> getAllVeg() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select v from Vegetables v");
		return q.getResultList();
	}

	public String updateVeg(int id, int count) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Vegetables v = em.find(Vegetables.class, id);
		
		if (v != null) {
			v.setCount(count);
			
			et.begin();
			em.merge(v);
			et.commit();
			
			return "Updatetd";
		}else {
			return "invalid Id";
		}
	}

	public List<Stationary> getAllStationary() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select s from Stationary s");
		return q.getResultList();
	}

	public String updateStationary(int id, int count) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Stationary s = em.find(Stationary.class, id);
		
		if (s != null) {
			s.setCount(count);
			
			et.begin();
			em.merge(s);
			et.commit();
			
			return "Updatetd";
		}else {
			return "invalid Id";
		}
	}
}
