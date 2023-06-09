package co.wisesystems.mihaigiurgeanu.testoauth2client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@Service("accessTokenProvider")
public class ClientCredentialsAccessToken implements ServiceClientAccessToken {

	@Value("${oauth2.client.id}")
	String clientId;
	
	@Value("${oauth2.client.secret}")
	String clientSecret;
	
	@Override
	public String getToken() {
		Form form = new Form();
		form.param("client_id", clientId);
		form.param("client_secret", clientSecret);
		form.param("grant_type", "client_credentials");
		form.param("scope", "roles");
		
		Client client = ClientBuilder.newClient();
    	String token = client
    			.target("http://auth-server:8080")
    			.path("/realms/mihaitest/protocol/openid-connect/token")
    			.request(MediaType.APPLICATION_FORM_URLENCODED)
    			.accept(MediaType.APPLICATION_JSON)
    			.post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED), TokenResponse.class)
    			.getToken();
		return token;
	}

}
