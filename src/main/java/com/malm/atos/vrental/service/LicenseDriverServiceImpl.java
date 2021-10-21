package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.LicenseDriverRepository;
import com.malm.atos.vrental.entity.LicenseDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("licenseDriverServiceImpl")
public class LicenseDriverServiceImpl implements LicenseDriverService {

    @Autowired
    private LicenseDriverRepository licenseDriverRepository;

    @Override
    public List<LicenseDriver> getAll() {
        List<LicenseDriver> licenseDrivers = licenseDriverRepository.findAll();
        return licenseDrivers;
    }
}
