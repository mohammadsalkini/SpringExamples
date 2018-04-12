package at.refugeescode.PhoneBook.repository;

import at.refugeescode.PhoneBook.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Person, Long> {
}
