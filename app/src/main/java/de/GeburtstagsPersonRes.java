package de;

import jakarta.annotation.security.DeclareRoles;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.security.enterprise.SecurityContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;;

@Path("geburtstagsperson")
@RequestScoped
@DeclareRoles("user")
public class GeburtstagsPersonRes {

    @Inject
    private SecurityContext securityContext;

    // @GET
    // public Response getGeburtstagsPerson(){
    //     return Response.ok(new GeburtstagsPerson()).build();
    // }

    @GET
    @RolesAllowed({"user"})
    @Produces(MediaType.TEXT_PLAIN)
    public String getCallerAndRole(){
        return "Hier war ich " + securityContext.getCallerPrincipal().getName();// + " : " + securityContext.isCallerInRole("user");
    }
}
