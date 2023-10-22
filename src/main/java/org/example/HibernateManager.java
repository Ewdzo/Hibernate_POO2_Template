package org.example;

import java.util.HashMap;
import java.util.Map;

import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class HibernateManager {
    static String puName = "pu-name";
    static Map<String, String> props = new HashMap<>();
    static EntityManagerFactory emf;
    static EntityManager em;

    static {
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "create");

        emf = new HibernatePersistenceProvider().createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(puName), props);
        em = emf.createEntityManager();
    }


}
