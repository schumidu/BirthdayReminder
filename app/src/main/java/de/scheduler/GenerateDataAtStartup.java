package de.scheduler;

import java.time.LocalDate;

import de.entities.Benutzer;
import de.entities.BenutzerDao;
import de.entities.GeburtstagsPerson;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
@Startup
public class GenerateDataAtStartup {

    @Inject
    private BenutzerDao benutzerDao;
    
    @PostConstruct
    void postConstruct(){
        final Benutzer benutzer = new Benutzer("Bernd", "sdfsdfsdf");

        GeburtstagsPerson geburtstagsPerson1 = new GeburtstagsPerson("Dieter", "Auer", LocalDate.now());
        GeburtstagsPerson geburtstagsPerson2 = new GeburtstagsPerson("Wolfgang", "Schumann", LocalDate.now().minusDays(100));

        benutzer.addGeburtstagsPerson(geburtstagsPerson1);
        benutzer.addGeburtstagsPerson(geburtstagsPerson2);

        benutzerDao.save(benutzer);
    }

}
