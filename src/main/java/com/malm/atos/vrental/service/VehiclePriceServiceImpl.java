package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.VehiclePriceRepository;
import com.malm.atos.vrental.entity.VehiclePrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("VehiclePriceServiceImpl")
public class VehiclePriceServiceImpl implements VehiclePriceService {

    @Autowired
    private VehiclePriceRepository vehiclePriceRepository;

    @Override
    public List<VehiclePrice> getAll() {
        List<VehiclePrice> vehiclePrices = vehiclePriceRepository.findAll();
        return vehiclePrices;
    }
}
