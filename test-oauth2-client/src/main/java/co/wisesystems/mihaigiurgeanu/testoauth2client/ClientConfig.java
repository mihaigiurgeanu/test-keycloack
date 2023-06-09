package co.wisesystems.mihaigiurgeanu.testoauth2client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Feign;
import feign.jackson.jaxb.JacksonJaxbJsonDecoder;

@Configuration
public class ClientConfig {

	@Bean
	public APICalls resourceAPI() {
		return Feign.builder()
				.decoder(new JacksonJaxbJsonDecoder())
				.target(APICalls.class, "http://resource-server:8080");
	}
}
