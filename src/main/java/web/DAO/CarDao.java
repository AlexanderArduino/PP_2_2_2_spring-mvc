package web.DAO;

import web.models.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCarsByCount(Integer count);
}
