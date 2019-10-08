package controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class petHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PetAdoption");

}
