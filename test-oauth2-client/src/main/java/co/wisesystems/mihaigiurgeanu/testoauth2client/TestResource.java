package co.wisesystems.mihaigiurgeanu.testoauth2client;

import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

@Path("/resources/{resourceName}")
public class TestResource {
    @GET
    @Produces("application/json")
    public TestData getResource(@PathParam("resuourceName") String resourceName) {

    	Client client = ClientBuilder.newClient();
    	TestData data = client
    			.target("http://resource-server:8080/testoauth2server/v1")
    			.path("/resouirces/testResource")
    			.request()
    			.accept(MediaType.APPLICATION_JSON)
    			.get(TestData.class);
    	
    	return data;
    }
}
