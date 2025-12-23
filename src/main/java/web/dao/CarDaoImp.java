package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImp implements CarDao{

    private final List<Car> cars = new ArrayList<>();
    {
        cars.add (new Car("Трактор", "коричневый", 2000));
        cars.add (new Car("Лимузин", "розовый", 2001));
        cars.add (new Car("Внедорожник", "черный", 2002));
        cars.add (new Car("Кабриолет", "белый", 2003));
        cars.add (new Car ("Грузовик", "синий", 2004));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count == 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
