package com.cg.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.cg.jpa.dao.UserRepository;
import com.cg.jpa.entities.User;


@SpringBootApplication
public class BootjpaexampleApplication {
// main class master
	public static void main(String[] args) {
		SpringApplication.run(BootjpaexampleApplication.class, args);
		//ApplicationContext context=
	/*UserRepository userRepository=	context.getBean(UserRepository.class);
	 User user=new User();
	 // user.setId(2);
	 user.setName("my name is abhishek");
	 user.setCity("Latur");
	 user.setStatus("Java learning");
	User user2= userRepository.save(user);
	System.out.println(user2);
	//BootjpaexampleApplication.getNextUserId(); */
    
	}
//	private static int getNextUserId() {
//        // Implement logic to retrieve the next value from the "user_seq" sequence
//        // This might involve querying the sequence or using a dedicated service to manage IDs
//        // For simplicity, you can initially set it to a constant value for testing.
//        return 1;
//
//}
}