package com.attendancesync.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Combination of three annotations
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class SamsTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamsTrackApplication.class, args);
	}

}
