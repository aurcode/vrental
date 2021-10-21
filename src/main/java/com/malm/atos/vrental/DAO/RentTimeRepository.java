package com.malm.atos.vrental.DAO;

import com.malm.atos.vrental.entity.RentTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentTimeRepository extends JpaRepository<RentTime, Long> {
}
