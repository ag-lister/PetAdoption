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
		List<Pet> allPets = em.createQuery("Select p from Pet p").getResultList();
		return allPets;
		
	}
	public Pet searchForPetByName(String petName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Pet> typedQuery = em.createQuery("select p from Pet p where p.name = :selectedName", Pet.class);
		typedQuery.setParameter("selectedName", petName);
		typedQuery.setMaxResults(1);

		Pet found = typedQuery.getSingleResult();
		em.close();
		return found;
	}
	public Pet searchForPetById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Pet found = em.find(Pet.class, idToEdit);
		em.close();
		return found;
	}
	public void deletePet(Pet petToDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Pet> typedQuery = em.createQuery(
				"select p from Pet p where p.species = :selectedSpecies and p.breed = :selectedBreed "
				+ "and p.name = :selectedName", Pet.class);

		typedQuery.setParameter("selectedSpecies", petToDelete.getSpecies());
		typedQuery.setParameter("selectedBreed", petToDelete.getBreed());
		typedQuery.setParameter("selectedName", petToDelete.getName());

		typedQuery.setMaxResults(1);

		Pet result = typedQuery.getSingleResult();

		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}
	public void updatePet(Pet toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();

	}
		
	}
	


