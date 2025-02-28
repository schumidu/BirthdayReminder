package de;

import java.time.LocalDate;

import de.entities.Benutzer;
import de.entities.BenutzerDao;
import de.entities.GeburtstagsPerson;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;;

@Path("geburtstagsperson")
@RequestScoped
public class GeburtstagsPersonRes {

    @Inject
    private GeburtstagsPersonRepo geburtstagsPersonRepo;

    @Inject
    private BenutzerDao benutzerDao;

    @GET
    public Response getAllGeburtstagsPersons(){
        return Response.ok(geburtstagsPersonRepo.getAllGeburtstagsPersons()).build();
    }

    @POST
    public Response createNeueGeburtstagsPerson(final GeburtstagsPerson geburtstagsPerson){
        geburtstagsPersonRepo.createNeuGeburtstagsPerson(geburtstagsPerson);
        return Response.ok().build();
    }

    @GET
    @Path("simple")
    public Response createSimple(){
        final Benutzer nutzer = benutzerDao.getAll().getLast();
        final GeburtstagsPerson geburtstagsPerson = new GeburtstagsPerson("Peter", "Macher", LocalDate.now().minusMonths(3), nutzer);
        geburtstagsPersonRepo.createNeuGeburtstagsPerson(geburtstagsPerson);
        return Response.ok().build();
    }
}
