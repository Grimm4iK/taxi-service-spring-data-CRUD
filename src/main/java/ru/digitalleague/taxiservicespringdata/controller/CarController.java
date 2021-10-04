package ru.digitalleague.taxiservicespringdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.taxiservicespringdata.model.Car;
import ru.digitalleague.taxiservicespringdata.service.CarService;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> findAll(){
        return carService.getAllCar();
    }

    @PostMapping("/addCar")
    public Long addCar(@RequestBody Car car){
        Car newCar = carService.addCar(car);
        return newCar.getId();
    }

    @DeleteMapping("/deleteCar")
    public void deleteCar(@RequestBody Car car){
        carService.deleteCar(car);
    }

    @PutMapping("/updateCar")
    public Long updateCar(@RequestBody Car car){
        Car updateCar = carService.updateCar(car);
        return updateCar.getId();
    }
}