package de;

import java.util.List;

import de.entities.GeburtstagsPerson;
import de.entities.GeburtstagsPersonDao;
import jakarta.ejb.Stateless;
import jakarta.ejb.TransactionAttribute;
import jakarta.ejb.TransactionAttributeType;
import jakarta.inject.Inject;

@Stateless
public class GeburtstagsPersonRepo {

    @Inject
    private GeburtstagsPersonDao geburtstagsPersonDao;

    public List<GeburtstagsPerson> getAllGeburtstagsPersons(){
        return geburtstagsPersonDao.getAll();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void createNeuGeburtstagsPerson(final GeburtstagsPerson geburtstagsPerson){
        geburtstagsPersonDao.save(geburtstagsPerson);
    }
    
}
