package co.wisesystems.mihaigiurgeanu.testoauth2server;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import jakarta.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/testoauth2server/v1")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(TestResource.class);
	}
}
