package de;

import java.util.List;

import de.entities.Benutzer;
import jakarta.enterprise.context.RequestScoped;
import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("benutzer")
@RequestScoped
public class BenutzerRes {

    @GET
    @Path("{benutzerid}")
    public Response getBestimmtenBenutzer(@PathParam("benutzerid") final String benutzerid){
        return Response.ok(new Benutzer()).build();
    }

    @GET
    public Response getAlleBenutzer(){
        return Response.ok(
            List.of(
                new Benutzer(), 
                new Benutzer())
        ).build();
    }

    @DELETE
    @Path("{benutzerid}")
    public Response deleteBestimmterBenutzer(@PathParam("benutzerid}") final String benutzerid){
        return Response.ok().build();
    }

    @POST
    public Response createNeueBenutzer(final Benutzer benutzer){
        return Response.ok().build();
    }
    
}
