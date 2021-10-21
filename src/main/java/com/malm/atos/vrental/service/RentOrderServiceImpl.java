package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.RentOrderRepository;
import com.malm.atos.vrental.entity.RentOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("rentOrderServiceImpl")
public class RentOrderServiceImpl implements RentOrderService {

    @Autowired
    private RentOrderRepository rentOrderRepository;

    @Override
    public List<RentOrder> getAll() {
        List<RentOrder> rentOrders = rentOrderRepository.findAll();
        return rentOrders;
    }
}
