package com.app.nre.repository;

import com.app.nre.model.Training;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class TrainingRepository extends SimpleJpaRepository<Training, String> {
    private final EntityManager em;
    public TrainingRepository(EntityManager em) {
        super(Training.class, em);
        this.em = em;
    }
    @Override
    public List<Training> findAll() {
        return em.createNativeQuery("Select * from \"nre\".\"Training\"", Training.class).getResultList();
    }
}