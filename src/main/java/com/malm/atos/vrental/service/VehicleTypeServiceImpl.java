package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.VehicleTypeRepository;
import com.malm.atos.vrental.entity.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("vehicleTypeServiceImpl")
public class VehicleTypeServiceImpl implements VehicleTypeService {

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    @Override
    public List<VehicleType> getAll() {
        List<VehicleType> vehicleTypes = vehicleTypeRepository.findAll();
        return vehicleTypes;
    }
}
