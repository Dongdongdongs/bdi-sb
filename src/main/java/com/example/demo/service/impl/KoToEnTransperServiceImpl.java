package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.KoToEnTransperService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KoToEnTransperServiceImpl implements KoToEnTransperService {

	private String clientId = "JDstKYWKgTeMALPNX8g0";
	private String clientSecret ="P7vk4wUDO9";
	
	@Override
	public String transper(String koText) {
		log.info("input Test=>{}",koText);		
		return null;
	}

}
