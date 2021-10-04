package ru.digitalleague.taxiservicespringdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.taxiservicespringdata.model.TaxiDriveInfo;
import ru.digitalleague.taxiservicespringdata.service.TaxiDriveInfoService;

import java.util.List;

@RestController
public class TaxiDriveInfoController {

    private final TaxiDriveInfoService taxiDriveInfoService;

    @Autowired
    public TaxiDriveInfoController(TaxiDriveInfoService taxiDriveInfoService) {
        this.taxiDriveInfoService = taxiDriveInfoService;
    }

    @GetMapping("/allDrivers")
    public List<TaxiDriveInfo> findAll(){
        return taxiDriveInfoService.getAllDrivers();
    }

    @PostMapping("/addDriver")
    public TaxiDriveInfo addQueue(@RequestBody TaxiDriveInfo taxiDriveInfo){
     return taxiDriveInfoService.addDriver(taxiDriveInfo);
    }

    @DeleteMapping("/deleteDriver")
    public void deleteDriver(@RequestBody TaxiDriveInfo taxiDriverInfo){
        taxiDriveInfoService.deleteDriver(taxiDriverInfo);
    }

    @PutMapping("/updateDriver")
    public Long updateQueue(@RequestBody TaxiDriveInfo taxiDriveInfo){
        TaxiDriveInfo taxiDriveInfoUpdate = taxiDriveInfoService.updateDriver(taxiDriveInfo);
        return taxiDriveInfoUpdate.getId();
    }
}