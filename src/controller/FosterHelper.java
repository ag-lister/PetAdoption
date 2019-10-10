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
				"select li from Foster li where li.name = :selectedName and li.address = :selectedAddress and li.phoneNumber = :selectedPhone",
				Foster.class);

		typedQuery.setParameter("selectedName", toDelete.getName());
		typedQuery.setParameter("selectedAddress", toDelete.getAddress());
		typedQuery.setParameter("selectedPhone", toDelete.getPhoneNumber());

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

	public List<Foster> searchForItemByName(String name) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Foster> typedQuery = em.createQuery("select li from Foster li where li.name = :selectedName",
				Foster.class);
		typedQuery.setParameter("selectedName", name);

		List<Foster> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<Foster> searchForItemByAddress(String address) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Foster> typedQuery = em.createQuery("select li from Foster li where li.address = :selectedAddress",
				Foster.class);
		typedQuery.setParameter("selectedAddress", address);

		List<Foster> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<Foster> searchForItemByPhone(String phone) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Foster> typedQuery = em.createQuery("select li from Foster li where li.phone = :selectedPhone",
				Foster.class);
		typedQuery.setParameter("selectedPhone", phone);

		List<Foster> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public void cleanUp() {
		emfactory.close();
	}
}
