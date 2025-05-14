package com.vergueiro_group.bp_user_bank_backend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class BpUserBankBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(BpUserBankBackendApplication.class, args);

		String get_name;

		User u1 = new User("Diego Vergueiro", "42260554890", "diego.ssv@outlook.com", "12982027359", "Oic224");

		get_name = u1.getFullName();
		System.out.println("get_name: " + get_name);

		u1.setFullName("Felipe");
		get_name = u1.getFullName();
		System.out.println("get_name: " + get_name);

	}
}