package application.mappers;


import application.domain.Person;
import application.views.PersonDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person personFrom(PersonDTO carDTO);

    @InheritInverseConfiguration
    PersonDTO dtoFrom(Person car);
}
