package co.wisesystems.mihaigiurgeanu.testoauth2server;
import java.util.UUID;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/resources")
public class TestResource {
    @GET
    @Path("/{resourceName}")
    @Produces("application/json")
    public TestData getResource(@PathParam("resourceName") String resourceName) {
    	TestData data = new TestData();
    	data.setId(UUID.randomUUID().toString());
    	data.setName(resourceName);
        return data;
    }
}
