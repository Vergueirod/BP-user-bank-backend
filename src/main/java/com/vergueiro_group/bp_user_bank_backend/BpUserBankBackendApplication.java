package com.vergueiro_group.bp_user_bank_backend;
import com.vergueiro_group.bp_user_bank_backend.infrastructure.db.entity.UserEntity;
import com.vergueiro_group.bp_user_bank_backend.infrastructure.db.repository.UserJpaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
@ComponentScan(basePackages = "com.vergueiro_group.bp_user_bank_backend")
public class BpUserBankBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(BpUserBankBackendApplication.class, args);

	}
/*
	@Bean
	CommandLineRunner run(UserJpaRepository userJpaRepository) {
		return args -> {

			List<UserEntity> entities = userJpaRepository.findAll();

			List<User> users = entities.stream()
					.map(UserEntityMapper::toDomain)
					.toList();

			for (User user : users) {
				System.out.println("Usuário: " + user.getFullName() + ", Email: " + user.getEmail());
			}
		};
	}
}

*/

@Bean
CommandLineRunner run(UserJpaRepository userJpaRepository) {
	return args -> {

		List<UserEntity> users = userJpaRepository.findAll();

		/*
		for (UserEntity user : users) {
			System.out.println("Usuário: " + user.getFullName() + ", Email: " + user.getEmail());

			System.out.println("id: " + user.getId());
			System.out.println("#################");
		}
*/
		UUID id = UUID.fromString("a3c6c491-a1f9-4efc-b181-5ba2feae2a1e");

		userJpaRepository.findById(id).ifPresentOrElse(
				user -> System.out.println("Encontrado: " + user.getFullName()),
				() -> System.out.println("Usuário com ID " + id + " não encontrado")
		);
	};
}
}