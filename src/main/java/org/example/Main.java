package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        EntityManager em = HibernateManager.em;


        try {
            em.getTransaction().begin();

            //em.persist();
            em.getTransaction().commit(); // end of transaction
        } finally {
            em.close();
        }
    }

}