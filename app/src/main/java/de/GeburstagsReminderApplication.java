package de;

import java.util.Set;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.security.enterprise.authentication.mechanism.http.BasicAuthenticationMechanismDefinition;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationScoped
@BasicAuthenticationMechanismDefinition(
    realmName = "basicAuth"
)
@ApplicationPath("api")
public class GeburstagsReminderApplication extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(
            BenutzerRes.class,
            GeburtstagsPersonRes.class
        );
    }
        
}
