package com.malm.atos.vrental.DAO;

import com.malm.atos.vrental.entity.VehicleDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleDetailsRepository extends JpaRepository<VehicleDetails, Long> {
}
