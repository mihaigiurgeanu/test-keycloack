package co.wisesystems.mihaigiurgeanu.testoauth2server;
import java.util.UUID;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/resources")
//@RolesAllowed("TEST")
public class TestResource {
	
    @GET
    @Path("/{resourceName}")
    @Produces("application/json")
    public TestData getResource(@PathParam("resourceName") String resourceName) {
    	SecurityContext sc = SecurityContextHolder.getContext();
    	if(sc != null) {
    		Authentication auth = sc.getAuthentication();
    		if(auth != null) {
    			System.out.print("User:");
    			System.out.println(auth.getName());
    			
    			for(GrantedAuthority ga: auth.getAuthorities()) {
    				System.out.println(ga.getAuthority());
    			}
    		} else {
    			System.out.println("User not authenticated.");
    		}
    	} else {
    		System.out.println("No security context.");
    	}
    	
    	TestData data = new TestData();
    	data.setId(UUID.randomUUID().toString());
    	data.setName(resourceName);
        return data;
    }
}
