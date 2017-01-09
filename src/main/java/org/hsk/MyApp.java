package org.hsk;

import org.hsk.model.mongo.User;
import org.hsk.repository.mongo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by cartman on 11.12.16.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories
@EnableJpaRepositories
public class MyApp implements CommandLineRunner{

   public static void main(String... args) {
     SpringApplication.run(MyApp.class,args);
   }

   @Autowired
  UserRepository userRepository;

  @Override
  public void run(String... strings) throws Exception {
    System.out.println("Starting app...");
//    User u = new User();
//    u.setPesel("84111102132");
//    u.setFirstName("Przemek");
//    u.setLastName("Jakubowski");
//    userRepository.save(u);

    System.out.println(userRepository.findAll());


    System.out.println("End startup...");
  }
}
