package com.malm.atos.vrental.DAO;

import com.malm.atos.vrental.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingRepository extends JpaRepository<Billing, Long> {
}
