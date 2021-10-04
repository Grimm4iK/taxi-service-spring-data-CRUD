package ru.digitalleague.taxiservicespringdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.taxiservicespringdata.model.Car;
import ru.digitalleague.taxiservicespringdata.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCar(){
        return carRepository.findAll();
    }


    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(Car car) {
        carRepository.delete(car);
    }

    public Car updateCar(Car car) {
        return carRepository.save(car);
    }
}