package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.VehicleDetailsRepository;
import com.malm.atos.vrental.entity.VehicleDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("vehicleDetailsServiceImpl")
public class VehicleDetailsServiceImpl implements VehicleDetailsService {

    @Autowired
    private VehicleDetailsRepository vehicleDetailsRepository;

    @Override
    public List<VehicleDetails> getAll() {
        List<VehicleDetails> vehicleDetails = vehicleDetailsRepository.findAll();
        return vehicleDetails;
    }
}
