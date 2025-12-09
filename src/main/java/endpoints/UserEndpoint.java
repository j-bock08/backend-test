package endpoints;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import services.UserService;

@Path("/users")
public class UserEndpoint {

    @Inject
    UserService service;

    @GET
    public Response getAllUsers(){
        return Response.ok(service.getAllUsers()).build();
    }

    @GET
    @Path("{/id}")
    public Response getUserById(int id){
        return Response.ok(service.getUserById(id)).build();
    }

}
