package com.malm.atos.vrental.DAO;

import com.malm.atos.vrental.entity.LicenseType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseTypeRepository extends JpaRepository<LicenseType, Long> {
}
