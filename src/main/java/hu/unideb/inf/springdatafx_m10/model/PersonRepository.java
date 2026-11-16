package hu.unideb.inf.springdatafx_m10.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Object> deletePersonByDateOfBirthAfter(LocalDate of);
}
