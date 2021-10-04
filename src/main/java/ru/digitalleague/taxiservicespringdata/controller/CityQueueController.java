package ru.digitalleague.taxiservicespringdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.taxiservicespringdata.model.CityQueue;
import ru.digitalleague.taxiservicespringdata.service.CityQueueService;

import java.util.List;

@RestController
public class CityQueueController {

    private final CityQueueService cityQueueService;

    @Autowired
    public CityQueueController(CityQueueService cityQueueService) {
        this.cityQueueService = cityQueueService;
    }

    @GetMapping("/cityQueues")
    public List<CityQueue> findAll(){
        return cityQueueService.getAllQueues();
    }

    @PostMapping("/addQueues")
    public CityQueue addQueue(@RequestBody CityQueue queue){
        return cityQueueService.addQueue(queue);
    }

    @DeleteMapping("/deleteQueues")
    public void deleteQueue(@RequestBody CityQueue queue){
        cityQueueService.deleteQueue(queue);
    }

    @PutMapping("/updateQueue")
    public Long updateQueue(@RequestBody CityQueue queue){
        CityQueue updateQueue = cityQueueService.updateQueue(queue);
        return updateQueue.getId();
    }
}