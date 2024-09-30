package com.app.nre.repository;

import com.app.nre.model.PerformanceAppraisal;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PerformanceAppraisalRepository extends SimpleJpaRepository<PerformanceAppraisal, String> {
    private final EntityManager em;
    public PerformanceAppraisalRepository(EntityManager em) {
        super(PerformanceAppraisal.class, em);
        this.em = em;
    }
    @Override
    public List<PerformanceAppraisal> findAll() {
        return em.createNativeQuery("Select * from \"nre\".\"PerformanceAppraisal\"", PerformanceAppraisal.class).getResultList();
    }
}