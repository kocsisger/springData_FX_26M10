package hu.unideb.inf.springdatafx_m10;

import hu.unideb.inf.springdatafx_m10.model.Person;
import hu.unideb.inf.springdatafx_m10.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.method.ParameterErrors;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataFxM10Application implements CommandLineRunner {
    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataFxM10Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Person person = new Person();
        person.setName("Gyergyószentmiklóssy Gyöngyvér");
        person.setDateOfBirth(LocalDate.of(2002,12,2));*/
        Person person = Person.builder()
                    .name("John Smith")
                    .dateOfBirth(LocalDate.of(2002,11,9))
                .build();

        personRepository.save(person);
    }
}
