package com.malm.atos.vrental.DAO;

import com.malm.atos.vrental.entity.RentOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentOrderRepository extends JpaRepository<RentOrder, Long> {
}
