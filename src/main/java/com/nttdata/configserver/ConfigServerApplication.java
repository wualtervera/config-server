package com.nttdata.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

	//Conexion a base de datos local
	//mongodb://localhost:27017/bootcamp

	//Conexion a base de datos remoto
	//mongodb://bootcampmongodb:NoaWZiyLwiCNVwrhhKTBY5cN9QZ5L5tuupnA1mByoZsbGYCdC5fuZ5EIf0ynoM2T08hEaQ3SRwA0nJaBQSAEkA==@bootcampmongodb.mongo.cosmos.azure.com:10255/?ssl=true&retrywrites=false&replicaSet=globaldb&maxIdleTimeMS=120000&appName=@bootcampmongodb@


}
