package org.example;

import jakarta.persistence.EntityManager;

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