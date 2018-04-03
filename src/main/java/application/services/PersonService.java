package application.services;

import application.domain.Person;
import application.mappers.PersonMapper;
import application.views.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonMapper personMapper;

    public Person mapPersonDTOToPerson() {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName("constructor fullname");

        return personMapper.personFrom(personDTO);
    }

    public PersonDTO mapPersonToPersonDTO() {
        Person person = new Person();
        person.setName("constructor fullname");

       return personMapper.dtoFrom(person);
    }
}
