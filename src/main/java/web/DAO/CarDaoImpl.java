package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Tesla", "ModelX", "A111AA178RUS"));
        carList.add(new Car("Moskvich", "412", "B222BB98RUS"));
        carList.add(new Car("Volga", "Syber", "C333CC198RUS"));
        carList.add(new Car("LADA", "Samara", "E444EE47RUS"));
        carList.add(new Car("YAZ", "Patriot", "H555HH147RUS"));
        carList.add(new Car("ZAZ", "Zaporojec", "X666XX178RUS"));
    }

    public List<Car> getCarsByCount(Integer count) {
        return carList.stream().limit(count).toList();
    }
}
