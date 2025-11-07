package atu.ie.cicdweek7;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonCommand  implements CommandLineRunner {
    private final  PersonRepository personRepository;

    public PersonCommand(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Person person1 = new Person("paul","56789","p@atu.ie","Senior Lecturer","Engineering");
        personRepository.save(person1);
        Person person2 = new Person("pa","5679","pa@atu.ie","Lecturer","Engineering");
        personRepository.save(person2);
    }


}
