package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.VehicleRepository;
import com.malm.atos.vrental.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("vehicleServiceImpl")
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = vehicleRepository.findAll();
        return vehicles;
    }
}
