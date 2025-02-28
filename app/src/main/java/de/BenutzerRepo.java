package de;

import java.util.List;

import de.entities.Benutzer;
import de.entities.BenutzerDao;
import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.inject.Inject;

@Stateless
public class BenutzerRepo {

    @Inject
    private BenutzerDao benutzerDao;

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public List<Benutzer> getAllBenutzer(){
        return benutzerDao.getAll();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void createBenutzer(final Benutzer benutzer){
        benutzerDao.save(benutzer);
    }
    
}
