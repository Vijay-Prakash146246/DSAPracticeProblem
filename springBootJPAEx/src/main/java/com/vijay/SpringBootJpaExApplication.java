package com.vijay;

import com.vijay.Dao.UserRepository;
import com.vijay.Entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class SpringBootJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootJpaExApplication.class, args);
		UserRepository userRepository = ctx.getBean(UserRepository.class);
//		User u1 = new User();
//		u1.setName("Vijay Prakash Singh");
//		u1.setCity("Nawada Bihar");
//		u1.setStatus("Currently i am in learning phase");
		//saving single user
//		User user1 = userRepository.save(u1);
//		System.out.println(user1);



		//create multiple onject of User
//		User user = new User();
//		user.setName("Niraj");
//		user.setCity("Nawada");
//		user.setStatus("Java Programmaer");
//		User user1 = new User();
//		user1.setName("Vijay");
//		user1.setCity("Delhi");
//		user1.setStatus("Web Developer");
//		List<User> persons = new ArrayList<>();
//		persons.add(user);
//		persons.add(user1);
//		//save multiple object
//		Iterable<User> result = userRepository.saveAll(persons);
//		result.forEach(n ->{ System.out.println(n);
//		});
//		System.out.println("We are successfully save the List of User Object");



		//Updating the user with id
//		Optional<User> findById =  userRepository.findById(2);
//		User user = findById.get();
//		System.out.println("User Details Before Upddting the details");
//		System.out.println(user);
//		user.setName("Suman Singh");
//		User result = userRepository.save(user);
//		System.out.println("User Details After Updating the details");
//		System.out.println(result);


		//How to get the data
		//findById(id)-return optional containging your data
		Iterable<User> itr = userRepository.findAll();
		//traversing through data method 1
//		Iterator<User> iterator = itr.iterator();
//		while (iterator.hasNext())
//		{
//			User user= iterator.next();
//			System.out.println(user);
//		}
		//traversing through data method 2
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//				System.out.println(user);
//			}
//		});

		//traversing through data method 3
//		itr.forEach(
//				user -> {
//					System.out.println(user);
//				});



		//How to delete the user element
		//There are four method to delete
//		userRepository.deleteById(153);
//		System.out.println("User get deleted successfully ");

		//deleting multiple user using iterable
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(user -> {System.out.println(user);});
//		userRepository.deleteAll(allusers);

		//Deleting user bu id
		//userRepository.deleteById(302);
		//creating user
//		User user = new User();
//		user.setName("Sonu");
//		user.setCity("Patna");
//		user.setStatus("SQL Developer");
//		userRepository.save(user);



		//Custom finder method
		//find by name
//		List<User> findByName = userRepository.findByName("Niraj");
//		System.out.println("Print data findByName method");
//		findByName.forEach(person -> {System.out.println(person);});

		//find by city
//		List<User> findByCity = userRepository.findByCity("Delhi");
//		System.out.println("Print data findByCity method");
//		findByCity.forEach(user1 -> {System.out.println(user1);});

		//Query creation from method names
//		System.out.println("Print data findByNameAndCity method");
//		List<User> user1 = userRepository.findByNameAndCity("Niraj","Nawada");
//		user1.forEach(x -> {System.out.println(x);});

//		System.out.println("Print data findByNameOrCity method");
//		List<User> user2 = userRepository.findByNameOrCity("Vijay","Patna");
//		user2.forEach(x -> {System.out.println(x);});

//		List<User> user3 = userRepository.findByNameStartingWith("V");
//		user3.forEach(n-> {System.out.println(n);});

//		List<User> user = userRepository.findByNameEndingWith("u");
//		user.forEach(user1 -> {System.out.println(user1);});

//		List<User> user = userRepository.findByNameContaining("i");
//		user.forEach(user1 -> {System.out.println(user1);});

		//.....................................#15Executing JPQL and NAtive Query............................................

//		List<User> allUser = userRepository.getAllUser();
//		allUser.forEach(n->{System.out.println(n);});

//	List<User> u1 =	userRepository.getUserByName("Vijay");
//	u1.forEach(n->{System.out.println(n);});

//		List<User> u1 =	userRepository.getUserByNameAndCity("Vijay","Delhi");
//		u1.forEach(n->{System.out.println(n);});

		List<User> u1 =	userRepository.getUsers();
		u1.forEach(n->{System.out.println(n);});

	}

}
