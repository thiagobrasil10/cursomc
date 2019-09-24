package br.com.curso.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.curso.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService service; 
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		service.instantiateTestDatabase();
		return true;
	}

}
