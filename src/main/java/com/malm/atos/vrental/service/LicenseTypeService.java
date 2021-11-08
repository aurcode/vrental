package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DTO.LicenseTypeDTO;
import com.malm.atos.vrental.entity.LicenseType;

import java.util.List;

public interface LicenseTypeService {
    List<LicenseType> getAll();
    LicenseType getById(Long id);
    void save(LicenseTypeDTO licenseType);
    void delete(Long id);
    void put(LicenseTypeDTO licenseType, Long id);
}
