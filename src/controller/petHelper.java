package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.pet;

public class petHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PetAdoption");
	public void insertPet(pet p) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}
	public List<pet> showAllPets() {
		EntityManager em = emfactory.createEntityManager();
		List<pet> allPets = em.createQuery("Select s from Seller s").getResultList();
		return allPets;
		
	}
	public pet searchForPetByName(String petName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<pet> typedQuery = em.createQuery("select p from pet p where p.pet_name = :selectedName", pet.class);
		typedQuery.setParameter("selectedName", petName);
		typedQuery.setMaxResults(1);

		pet found = typedQuery.getSingleResult();
		em.close();
		return found;
	}
	public pet searchForPetById(Integer tempId) {
		// TODO Auto-generated method stub
		return null;
	}
	public void deletePet(pet petToDelete) {
		// TODO Auto-generated method stub
		
	}
	
	}


