package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import model.foster;

public class FosterHelper {
static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PetAdoption");
	
	public void insertItem(foster li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<foster> showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<foster> allItems = em.createQuery("SELECT i FROM foster i").getResultList();
		return allItems;
	}
	
	public void deleteItem(foster toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<foster> typedQuery = em.createQuery("select li from foster li where li.name = :selectedName and li.address = :selectedAddress and li.phone = :selectedPhone", foster.class);
		
		typedQuery.setParameter("selectedTitle", toDelete.getName());
		typedQuery.setParameter("selectedAuthor", toDelete.getAddress());
		typedQuery.setParameter("selectedGenre", toDelete.getPhoneNumber());
		
		typedQuery.setMaxResults(1);
		
		foster result = typedQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	public foster searchForItemById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		foster found = em.find(foster.class, idToEdit);
		em.close();
		return found;
	}

	public void updateItem(foster toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();
		
	}

	public List<foster> searchForItemByTitle(String name) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery <foster> typedQuery = em.createQuery("select li from foster li where li.name = :selectedName", foster.class);
		typedQuery.setParameter("selectedTitle", name);
		
		List<foster> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<foster> searchForItemByAuthor(String address) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery <foster> typedQuery = em.createQuery("select li from foster li where li.address = :selectedAddress", foster.class);
		typedQuery.setParameter("selectedAuthor", address);
		
		List<foster> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<foster> searchForItemByGenre(String phone) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery <foster> typedQuery = em.createQuery("select li from foster li where li.phone = :selectedPhone", foster.class);
		typedQuery.setParameter("selectedGenre", phone);
		
		List<foster> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}
	
	public void cleanUp() {
		emfactory.close();
	}
}
