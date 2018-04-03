package application.mappers;

import application.domain.Person;
import application.views.PersonDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {PersonMapperImpl.class})
public class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void shouldMapPersonDTOToPerson() {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setName("constructor fullname");

        Person person = personMapper.personFrom(personDTO);

        assertThat(person.getName()).isEqualTo(personDTO.getName());
    }

    @Test
    public void shouldMapPersonToPersonDTO() {
        Person person = new Person();
        person.setName("constructor fullname");

        PersonDTO personDTO = personMapper.dtoFrom(person);

        assertThat(personDTO.getName()).isEqualTo(person.getName());
    }

}
