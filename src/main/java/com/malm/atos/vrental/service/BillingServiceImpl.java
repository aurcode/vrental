package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.BillingRepository;
import com.malm.atos.vrental.entity.Billing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("billingServiceImpl")
public class BillingServiceImpl implements BillingService {

    @Autowired
    private BillingRepository billingRepository;

    @Override
    public List<Billing> getAll() {
        List<Billing> billings = billingRepository.findAll();
        return billings;
    }
}
