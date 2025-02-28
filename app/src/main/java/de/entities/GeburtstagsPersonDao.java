package de.entities;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.ejb.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Startup
@ApplicationScoped
public class GeburtstagsPersonDao implements Dao<GeburtstagsPerson> {

    @PersistenceContext(unitName = "DATABASE_UNIT")
    EntityManager em;

    @Override
    public Optional<GeburtstagsPerson> get(UUID id) {
        return Optional.of(em.find(GeburtstagsPerson.class, id));
    }

    @Override
    public List<GeburtstagsPerson> getAll() {
        return em.createNamedQuery("getallgp", GeburtstagsPerson.class).getResultList();
    }

    @Override
    public void save(GeburtstagsPerson t) {
        em.persist(t);
    }

    @Override
    public void update(GeburtstagsPerson t) {
        em.merge(t);
    }

    @Override
    public void delete(GeburtstagsPerson t) {
        em.remove(t);
    }

}
