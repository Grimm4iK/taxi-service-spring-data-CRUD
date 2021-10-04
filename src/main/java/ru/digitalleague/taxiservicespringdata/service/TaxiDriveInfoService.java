package ru.digitalleague.taxiservicespringdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.taxiservicespringdata.model.TaxiDriveInfo;
import ru.digitalleague.taxiservicespringdata.repository.TaxiDriveInfoRepository;

import java.util.List;

@Service
public class TaxiDriveInfoService {

    private final TaxiDriveInfoRepository taxiDriveInfoRepository;

    @Autowired
    public TaxiDriveInfoService(TaxiDriveInfoRepository taxiDriverInfoRepository) {
        this.taxiDriveInfoRepository = taxiDriverInfoRepository;
    }

    public List<TaxiDriveInfo> getAllDrivers() {
        return taxiDriveInfoRepository.findAll();
    }

    public TaxiDriveInfo addDriver(TaxiDriveInfo taxiDriverInfo) {
        return taxiDriveInfoRepository.save(taxiDriverInfo);
    }

    public void deleteDriver(TaxiDriveInfo taxiDriverInfo) {
        taxiDriveInfoRepository.delete(taxiDriverInfo);
    }

    public TaxiDriveInfo updateDriver(TaxiDriveInfo taxiDriverInfo) {
        return taxiDriveInfoRepository.save(taxiDriverInfo);
    }
}