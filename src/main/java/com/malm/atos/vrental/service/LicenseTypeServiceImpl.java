package com.malm.atos.vrental.service;

import com.malm.atos.vrental.DAO.LicenseTypeRepository;
import com.malm.atos.vrental.DTO.ClientDTO;
import com.malm.atos.vrental.DTO.LicenseTypeDTO;
import com.malm.atos.vrental.entity.Client;
import com.malm.atos.vrental.entity.LicenseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service("licenseTypeServiceImpl")
public class LicenseTypeServiceImpl implements LicenseTypeService {

    @Autowired
    private LicenseTypeRepository licenseTypeRepository;

    @Override
    public List<LicenseType> getAll() {
        List<LicenseType> licenseTypes = licenseTypeRepository.findAll();
        return licenseTypes;
    }

    @Override
    public LicenseType getById(Long id) { return licenseTypeRepository.findById(id).orElseThrow(LicenseTypeNotFoundException::new); }

    @ResponseStatus(NOT_FOUND)
    public class LicenseTypeNotFoundException extends RuntimeException {
        public LicenseTypeNotFoundException() {
            super();
        }
    }


    public void save(LicenseTypeDTO licenseTypeDTO) {
        LicenseType licenseType = new LicenseType();
        licenseType.setId(licenseTypeDTO.getId());
        licenseType.setType(licenseTypeDTO.getType());
        licenseType.setDeleted(licenseTypeDTO.getDeleted());
        licenseTypeRepository.save(licenseType);
    }

    @Override
    public void delete(Long id) {
        List<LicenseType> licenseTypes = licenseTypeRepository.findAllById(Arrays.asList(new Long[]{id}));
        LicenseType licenseType = licenseTypes.get(0);
        if (licenseType.getDeleted() == 0) {
            licenseType.setDeleted(1);
        } else {
            licenseType.setDeleted(0);
        }

        licenseTypeRepository.save(licenseType);
    }

    public void put(LicenseTypeDTO licenseTypeDTO, Long id) {
        LicenseType licenseType = new LicenseType();
        licenseType.setId(licenseTypeDTO.getId());
        licenseType.setType(licenseTypeDTO.getType());
        licenseType.setDeleted(licenseTypeDTO.getDeleted());
        licenseTypeRepository.save(licenseType);
    }
}
