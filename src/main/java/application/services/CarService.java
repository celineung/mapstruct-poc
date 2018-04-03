package application.services;

import application.domain.Car;
import application.mappers.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import application.views.CarDTO;

@Service
public class CarService {

    @Autowired
    private CarMapper carMapper;

    public Car mapCarDTOToCar() {
        CarDTO carDTO = new CarDTO();
        carDTO.setColor("blue");
        carDTO.setLicensePlate(77);
        carDTO.setNbSeats(7);

        return carMapper.carFrom(carDTO);
    }

    public CarDTO mapCarToCarDTO() {
        Car car = new Car();
        car.setColor("blue");
        car.setLicensePlate(77);
        car.setNbSeats(7);

        return carMapper.dtoFrom(car);
    }
}
