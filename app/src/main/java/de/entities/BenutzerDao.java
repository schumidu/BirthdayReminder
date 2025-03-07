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
public class BenutzerDao implements Dao<Benutzer> {

    @PersistenceContext(unitName = "DATABASE_UNIT")
    EntityManager em;

    @Override
    public Optional<Benutzer> get(UUID id) {
        return Optional.of(em.find(Benutzer.class, id));
    }

    @Override
    public List<Benutzer> getAll() {
        return em.createNamedQuery("getappbenutzer", Benutzer.class).getResultList();
    }

    @Override
    public void save(Benutzer t) {
        em.persist(t);
    }

    @Override
    public void update(Benutzer t) {
        em.merge(t);
    }

    @Override
    public void delete(Benutzer t) {
        em.remove(t);
    }
    
}
