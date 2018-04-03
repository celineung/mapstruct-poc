package application.controllers;


import application.domain.Car;
import application.services.CarService;
import application.views.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Car mapCarDTOToCar() {
        return carService.mapCarDTOToCar();
    }

    @RequestMapping(value = "/dto", method = RequestMethod.GET)
    public CarDTO mapCarToCarDTO() {
        return carService.mapCarToCarDTO();
    }
}
