package com.apps.inventory.repository;


import com.apps.inventory.model.Restuarant;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class RestuarantRepository extends SimpleJpaRepository<Restuarant, String> {
    private final EntityManager em;
    public RestuarantRepository(EntityManager em) {
        super(Restuarant.class, em);
        this.em = em;
    }
    @Override
    public List<Restuarant> findAll() {
        return em.createNativeQuery("Select * from \"inventoryv619\".\"Restuarant\"", Restuarant.class).getResultList();
    }
}