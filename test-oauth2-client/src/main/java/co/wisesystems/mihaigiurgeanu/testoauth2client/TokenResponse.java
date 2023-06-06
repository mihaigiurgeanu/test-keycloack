package co.wisesystems.mihaigiurgeanu.testoauth2client;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TokenResponse {
	
	private String token;
	private int expiresIn;
	private int refreshExpiresIn;
	private String tokenType;
	private int notBeforePolicy;
	private String scope;

	public String getToken() {
		return token;
	}

	@XmlElement(name = "access_token")
	public void setToken(String token) {
		this.token = token;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	@XmlElement(name = "expires_in")
	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public int getRefreshExpiresIn() {
		return refreshExpiresIn;
	}

	@XmlElement(name = "refresh_expires_in")
	public void setRefreshExpiresIn(int refreshExpiresIn) {
		this.refreshExpiresIn = refreshExpiresIn;
	}

	public String getTokenType() {
		return tokenType;
	}

	@XmlElement(name = "token_type")
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public int getNotBeforePolicy() {
		return notBeforePolicy;
	}

	@XmlElement(name = "not-before-policy")
	public void setNotBeforePolicy(int notBeforePolicy) {
		this.notBeforePolicy = notBeforePolicy;
	}

	public String getScope() {
		return scope;
	}

	@XmlElement(name = "scope")
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	

}
