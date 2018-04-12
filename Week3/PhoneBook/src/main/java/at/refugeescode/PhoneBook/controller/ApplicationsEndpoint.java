package at.refugeescode.PhoneBook.controller;

import at.refugeescode.PhoneBook.model.Person;
import at.refugeescode.PhoneBook.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("phonebook")
public class ApplicationsEndpoint {

    private ContactRepository contactRepository;

    public ApplicationsEndpoint(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @PostMapping
    void SetPersons(@RequestBody Person person) {
        contactRepository.save(person);
    }


    @GetMapping
    List<Person> findall () {
        return contactRepository.findAll();
    }


}
