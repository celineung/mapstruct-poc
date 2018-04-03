package application.mappers;

import application.domain.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import application.views.CarDTO;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {CarMapperImpl.class})
public class CarMapperTest {

    @Autowired
    private CarMapper carMapper;

    @Test
    public void shouldMapCarDTOToCar() {
        CarDTO carDTO = new CarDTO();
        carDTO.setColor("blue");
        carDTO.setLicensePlate(77);
        carDTO.setNbSeats(7);

        Car car = carMapper.carFrom(carDTO);

        assertThat(car.getColor()).isEqualTo(carDTO.getColor());
    }

    @Test
    public void shouldMapCarToCarDTO() {
        Car car = new Car();
        car.setColor("blue");
        car.setLicensePlate(77);
        car.setNbSeats(7);

        CarDTO carDTO = carMapper.dtoFrom(car);

        assertThat(carDTO.getColor()).isEqualTo(car.getColor());
    }
}