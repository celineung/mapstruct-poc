package application.controllers;


import application.domain.Person;
import application.services.PersonService;
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
    public Person mapCarDTOToCar() {
        return personService.mapPersonDTOToPerson();
    }
}
