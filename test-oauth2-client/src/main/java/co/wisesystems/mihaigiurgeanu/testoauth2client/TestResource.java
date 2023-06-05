package co.wisesystems.mihaigiurgeanu.testoauth2client;

import java.util.UUID;

import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/resources/[resourceName]")
public class TestResource {
    @GET
    @Produces("application/json")
    public TestData getResource(@PathParam("resuourceName") String resourceName) {
    	TestData data = new TestData();
    	data.setId(UUID.randomUUID().toString());
    	data.setName(resourceName);
        return data;
    }
}
