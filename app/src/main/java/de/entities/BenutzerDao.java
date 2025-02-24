package de.entities;

import jakarta.ejb.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Startup
@ApplicationScoped
public class BenutzerDao {

    @PersistenceContext(unitName = "DATABASE_UNIT")
    EntityManager em;
    
}
