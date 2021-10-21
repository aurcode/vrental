package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.RentTimeRepository;
import com.malm.atos.vrental.entity.RentTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("rentTimeServiceImpl")
public class RentTimeServiceImpl implements RentTimeService {

    @Autowired
    private RentTimeRepository rentTimeRepository;

    @Override
    public List<RentTime> getAll() {
        List<RentTime> rentTimes = rentTimeRepository.findAll();
        return rentTimes;
    }
}
