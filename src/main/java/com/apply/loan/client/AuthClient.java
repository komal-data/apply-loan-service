package com.apply.loan.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.apply.loan.dto.JWTResponse;

@FeignClient(name="customerRegistrationService", url = "http://localhost:8082/")
public interface AuthClient {
	
	 @PostMapping("/validate")
	    public String validateToken(@RequestBody JWTResponse response);

}
