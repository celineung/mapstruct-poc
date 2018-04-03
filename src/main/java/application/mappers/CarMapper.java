package application.mappers;

import application.domain.Car;
import application.views.CarDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    Car carFrom(CarDTO carDTO);

    @InheritInverseConfiguration
    CarDTO dtoFrom(Car car);
}
