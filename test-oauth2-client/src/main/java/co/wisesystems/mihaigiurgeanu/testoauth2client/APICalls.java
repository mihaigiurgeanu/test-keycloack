package co.wisesystems.mihaigiurgeanu.testoauth2client;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface APICalls {
	
	@Headers("Authorization: Bearer {token}")
	@RequestLine("GET testoauth2server/v1/resources/{resMame}")
	TestData testResource(
			@Param("resName") String resName, 
			@Param("token") String token);
}
