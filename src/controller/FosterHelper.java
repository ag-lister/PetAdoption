package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Foster;

public class FosterHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PetAdoption");

	public void insertItem(Foster li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}

	public List<Foster> showAllItems() {
		EntityManager em = emfactory.createEntityManager();
		List<Foster> allItems = em.createQuery("SELECT li FROM Foster li").getResultList();
		return allItems;
	}

	public void deleteItem(Foster toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Foster> typedQuery = em.createQuery(
				"select li from foster li where li.name = :selectedName and li.address = :selectedAddress and li.phone = :selectedPhone",
				Foster.class);

		typedQuery.setParameter("selectedTitle", toDelete.getName());
		typedQuery.setParameter("selectedAuthor", toDelete.getAddress());
		typedQuery.setParameter("selectedGenre", toDelete.getPhoneNumber());

		typedQuery.setMaxResults(1);

		Foster result = typedQuery.getSingleResult();

		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	public Foster searchForItemById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Foster found = em.find(Foster.class, idToEdit);
		em.close();
		return found;
	}

	public void updateItem(Foster toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();

	}

	public List<Foster> searchForItemByTitle(String name) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Foster> typedQuery = em.createQuery("select li from foster li where li.name = :selectedName",
				Foster.class);
		typedQuery.setParameter("selectedTitle", name);

		List<Foster> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<Foster> searchForItemByAuthor(String address) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Foster> typedQuery = em.createQuery("select li from foster li where li.address = :selectedAddress",
				Foster.class);
		typedQuery.setParameter("selectedAuthor", address);

		List<Foster> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<Foster> searchForItemByGenre(String phone) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Foster> typedQuery = em.createQuery("select li from foster li where li.phone = :selectedPhone",
				Foster.class);
		typedQuery.setParameter("selectedGenre", phone);

		List<Foster> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public void cleanUp() {
		emfactory.close();
	}
}
