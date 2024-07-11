package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDao;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private CarDao carsDao;

    @Autowired
    public CarServiceImpl(CarDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        count = count != null ? count : 6;
        return carsDao.getCarsByCount(count);
    }
}
