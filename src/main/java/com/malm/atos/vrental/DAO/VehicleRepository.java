package com.malm.atos.vrental.DAO;

import com.malm.atos.vrental.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
