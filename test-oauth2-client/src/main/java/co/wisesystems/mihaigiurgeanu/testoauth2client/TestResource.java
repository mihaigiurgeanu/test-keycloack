package co.wisesystems.mihaigiurgeanu.testoauth2client;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/resources")
public class TestResource {
	
	@Autowired
	ServiceClientAccessToken accessTokenProvider;
	
	@Autowired
	APICalls resourceAPI;
	
    @GET
    @Path("/{resourceName}")
    @Produces("application/json")
    public TestData getResource(@PathParam("resourceName") String resourceName) {
    	String token = accessTokenProvider.getToken();
    	TestData data = resourceAPI.testResource(resourceName, token);
    	
    	return data;
    }
}
