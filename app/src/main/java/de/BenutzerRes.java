package de;

import java.util.List;

import de.entities.Benutzer;
import jakarta.annotation.Generated;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("benutzer")
@RequestScoped
public class BenutzerRes {

    @Inject
    private BenutzerRepo repo;

    @GET
    @Path("{benutzerid}")
    public Response getBestimmtenBenutzer(@PathParam("benutzerid") final String benutzerid){
        return Response.ok(new Benutzer()).build();
    }

    @GET
    public Response getAlleBenutzer(){
        return Response.ok(
            repo.getAllBenutzer()
        ).build();
    }

    @DELETE
    @Path("{benutzerid}")
    public Response deleteBestimmterBenutzer(@PathParam("benutzerid}") final String benutzerid){
        return Response.ok().build();
    }

    @POST
    public Response createNeueBenutzer(final Benutzer benutzer){
        repo.createBenutzer(benutzer);
        return Response.ok().build();
    }

    @GET
    @Path("simple")
    public Response create(){
        repo.createBenutzer(new Benutzer("lala", "sdfasdf"));
        return Response.ok().build();
    }
    
}
