package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car>cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2019));
        cars.add(new Car("Honda", "Civic", 2020));
        cars.add(new Car("Ford", "Mustang", 2018));
        cars.add(new Car("Chevrolet", "Camaro", 2017));
        cars.add(new Car("BMW", "X5", 2019));
    }

    public List<Car>getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
