package co.wisesystems.mihaigiurgeanu.testoauth2client;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import jakarta.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/testoauth2client/v1")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(TestResource.class);
	}
}
