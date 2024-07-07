package com.karthick.videocall;

import com.karthick.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.karthick.videocall.user.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
					.username("bala")
					.email("bala@mail.com")
					.password("1205")
					.build());

			service.register(User.builder()
					.username("siva")
					.email("siva@mail.com")
					.password("1205")
					.build());

			service.register(User.builder()
					.username("Arun")
					.email("anna@mail.com")
					.password("1205")
					.build());
		};
	}
}
