package ru.digitalleague.taxiservicespringdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.taxiservicespringdata.model.CityQueue;
import ru.digitalleague.taxiservicespringdata.repository.CityQueueRepository;

import java.util.List;


@Service
public class CityQueueService {

    private final CityQueueRepository cityQueueRepository;

    @Autowired
    public CityQueueService(CityQueueRepository cityQueueRepository) {
        this.cityQueueRepository = cityQueueRepository;
    }

    public List<CityQueue> getAllQueues() {
        return cityQueueRepository.findAll();
    }

    public CityQueue addQueue(CityQueue queue) {
        return cityQueueRepository.save(queue);
    }

    public void deleteQueue(CityQueue queue) {
        cityQueueRepository.delete(queue);
    }

    public CityQueue updateQueue(CityQueue queue) {
        return cityQueueRepository.save(queue);
    }
}
