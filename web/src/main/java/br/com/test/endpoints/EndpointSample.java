package br.com.test.endpoints;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Gabriel Francisco - gabfssilva@gmail.com
 */
@Path("/test")
@Stateless
public class EndpointSample {

    @GET
    public Response get(){
        return Response.ok("ok!").build();
    }
}
