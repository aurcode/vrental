package com.malm.atos.vrental.DAO;

import com.malm.atos.vrental.entity.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Long> {
}
