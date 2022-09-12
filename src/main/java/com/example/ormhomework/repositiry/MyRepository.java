package com.example.ormhomework.repositiry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Repository
public class MyRepository implements CommandLineRunner {

    @PersistenceContext /*аналог @Autowired, но потокобез*/
    EntityManager entityManager;


    @Override
    @Transactional
    public void run(String... args) throws Exception {

    }
}
