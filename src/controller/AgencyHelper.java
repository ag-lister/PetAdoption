package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Agency;

public class AgencyHelper {
static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PetAdoption");
	

	public void insertItem(Agency li) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(li);
		em.getTransaction().commit();
		em.close();
	}

	public List<Agency> showAllItems() {
		EntityManager em = emfactory.createEntityManager();
		List<Agency> allItems = em.createQuery("SELECT li FROM agency li").getResultList();
		return allItems;
	}

	public void deleteItem(Agency toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Agency> typedQuery = em.createQuery(
				"select li from agency li where li.agency_name = :selectedName and li.agency_address = :selectedAddress and li.agency_phone = :selectedPhone and li.agency_email = :selectedEmail",
				Agency.class);

		typedQuery.setParameter("selectedName", toDelete.getAgencyName());
		typedQuery.setParameter("selectedAddress", toDelete.getAgencyAddress());
		typedQuery.setParameter("selectedPhone", toDelete.getAgencyPhone());
		typedQuery.setParameter("selectedEmail", toDelete.getAgencyEmail());

		typedQuery.setMaxResults(1);

		Agency result = typedQuery.getSingleResult();

		em.remove(result);
		em.getTransaction().commit();
		em.close();
	}

	public Agency searchForItemById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Agency found = em.find(Agency.class, idToEdit);
		em.close();
		return found;
	}

	public void updateItem(Agency toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();

		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();

	}

	public List<Agency> searchForItemByName(String name) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Agency> typedQuery = em.createQuery("select li from agency li where li.agency_name = :selectedName",
				Agency.class);
		typedQuery.setParameter("selectedName", name);

		List<Agency> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<Agency> searchForItemByAddress(String address) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Agency> typedQuery = em.createQuery("select li from agency li where li.agency_address = :selectedAddress",
				Agency.class);
		typedQuery.setParameter("selectedAddress", address);

		List<Agency> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<Agency> searchForItemByPhone(String phone) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Agency> typedQuery = em.createQuery("select li from agency li where li.agency_phone = :selectedPhone",
				Agency.class);
		typedQuery.setParameter("selectedPhone", phone);

		List<Agency> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}
	
	public List<Agency> searchForItemByEmail(String email) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Agency> typedQuery = em.createQuery("select li from agency li where li.agency_email = :selectedEmail",
				Agency.class);
		typedQuery.setParameter("selectedEmail", email);

		List<Agency> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public void cleanUp() {
		emfactory.close();
	}
}
