package org.khasanof;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Slf4j
public class App {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var repository = context.getBean(PersonRepository.class);

        var peter = new User("Peter", "Sagan", 17);
        var nasta = new User("Nasta", "Kuzminova", 25);
        var john = new User("John", "lawrence", 35);
        var terry = new User("Terry", "Law", 36);

        List<User> users = List.of(peter, nasta, john, terry);

        repository.saveAll(users);

        repository
                .findOne(new UserSpecification.NameEqualSpec("John"))
                .ifPresent(p -> System.out.println("John find!"));

        List<User> all = repository.findAll(new UserSpecification.AgeBetweenSpec(20, 40));
        System.out.println("all = " + all);

        context.close();
    }
}
