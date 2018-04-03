package application.controllers;


import application.domain.Person;
import application.services.PersonService;
import application.views.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Person mapPersonDTOToPerson() {
        return personService.mapPersonDTOToPerson();
    }

    @RequestMapping(value = "/dot", method = RequestMethod.GET)
    public PersonDTO mapPersonDTOToPersonDTO() {
        return personService.mapPersonToPersonDTO();
    }

}
