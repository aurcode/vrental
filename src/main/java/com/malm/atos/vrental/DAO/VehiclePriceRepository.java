package com.malm.atos.vrental.DAO;

import com.malm.atos.vrental.entity.VehiclePrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclePriceRepository extends JpaRepository<VehiclePrice, Long> {
}
