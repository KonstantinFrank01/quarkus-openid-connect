package at.htl;

import io.quarkus.security.identity.SecurityIdentity;
import org.jboss.resteasy.annotations.cache.NoCache;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {

    @Inject
    SecurityIdentity identity;

    @GET
    @RolesAllowed("users")
    @Produces(MediaType.APPLICATION_JSON)
    @NoCache
    public SecurityIdentity getUser() {
        return identity;
    }
}
