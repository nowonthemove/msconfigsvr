package com.corp.lob.app.msconfigsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsconfigsvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsconfigsvrApplication.class, args);
	}

}
