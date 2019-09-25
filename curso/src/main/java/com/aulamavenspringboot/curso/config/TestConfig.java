package com.aulamavenspringboot.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aulamavenspringboot.curso.entities.User;
import com.aulamavenspringboot.curso.respositories.UserRepository;

@Configuration 
@Profile("test") //nome tem que ser igual ao colocado no application.properties
public class TestConfig implements CommandLineRunner {
	
	@Autowired //injeta automaticamente a dependência;
	private UserRepository userRepository;

	//tudo que for digitado nesse método (RUN), será executado qdo a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
	
}
