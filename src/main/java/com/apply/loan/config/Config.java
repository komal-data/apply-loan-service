package com.apply.loan.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	public String check = "true";

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}
	

}
