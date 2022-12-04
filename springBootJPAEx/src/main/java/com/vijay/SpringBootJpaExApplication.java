package com.vijay;

import com.vijay.Dao.UserRepository;
import com.vijay.Entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootJpaExApplication.class, args);
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		User u1 = new User();
		u1.setName("Vijay Prakash Singh");
		u1.setCity("Nawada Bihar");
		u1.setStatus("Currently i am in learning phase");
		User user1 = userRepository.save(u1);
		System.out.println(user1);
	}

}
