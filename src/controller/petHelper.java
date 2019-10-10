package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Pet;

public class petHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PetAdoption");
	public void insertPet(Pet p) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
	}
	public List<Pet> showAllPets() {
		EntityManager em = emfactory.createEntityManager();
		List<Pet> allPets = em.createQuery("Select s from Seller s").getResultList();
		return allPets;
		
	}
	public Pet searchForPetByName(String petName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Pet> typedQuery = em.createQuery("select p from pet p where p.pet_name = :selectedName", Pet.class);
		typedQuery.setParameter("selectedName", petName);
		typedQuery.setMaxResults(1);

		Pet found = typedQuery.getSingleResult();
		em.close();
		return found;
	}
	public Pet searchForPetById(Integer tempId) {
		// TODO Auto-generated method stub
		return null;
	}
	public void deletePet(Pet petToDelete) {
		// TODO Auto-generated method stub
		
	}
	
	}


