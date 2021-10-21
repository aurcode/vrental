package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.LicenseTypeRepository;
import com.malm.atos.vrental.entity.LicenseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("licenseTypeServiceImpl")
public class LicenseTypeServiceImpl implements LicenseTypeService {

    @Autowired
    private LicenseTypeRepository licenseTypeRepository;

    @Override
    public List<LicenseType> getAll() {
        List<LicenseType> licenseTypes = licenseTypeRepository.findAll();
        return licenseTypes;
    }
}
