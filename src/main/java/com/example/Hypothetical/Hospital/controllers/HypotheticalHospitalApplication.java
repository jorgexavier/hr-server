package com.example.Hypothetical.Hospital.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HypotheticalHospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HypotheticalHospitalApplication.class, args);
	}

}
