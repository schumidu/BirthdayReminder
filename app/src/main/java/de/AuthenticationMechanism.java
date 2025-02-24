package de;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthenticationMechanism { // implements HttpAuthenticationMechanism{

    // @Inject
    // private IdentityStoreHandler identityStoreHandler;

    // @Override
    // public AuthenticationStatus validateRequest(
    //     HttpServletRequest request,
    //     HttpServletResponse response,
    //     HttpMessageContext httpMessageContext) throws AuthenticationException {

    //     var callerName = request.getHeader("callername");
    //     var password = request.getHeader("callerpassword");
        
    //     if (callerName == null || password == null) {
    //         return httpMessageContext.doNothing();
    //     }

    //     var result = identityStoreHandler.validate(
    //         new UsernamePasswordCredential(callerName, password));
        
    //     if (result.getStatus() != VALID) {
    //         return httpMessageContext.responseUnauthorized();
    //     }

    //     return httpMessageContext.notifyContainerAboutLogin(
    //         result.getCallerPrincipal(), 
    //         result.getCallerGroups());

    // }
    
}
