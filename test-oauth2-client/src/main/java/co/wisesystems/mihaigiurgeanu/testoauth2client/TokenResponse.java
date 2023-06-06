package co.wisesystems.mihaigiurgeanu.testoauth2client;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TokenResponse {
	
	private String token;

	public String getToken() {
		return token;
	}

	@XmlElement(name = "access_token")
	public void setToken(String token) {
		this.token = token;
	}
	
	

}
