package com.malm.atos.vrental.entity;

import javax.persistence.*;
import java.io.Serializable;

/*
CREATE TABLE `vrental`.`vehicle_price` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `price_per_day` DOUBLE NOT NULL,
    `price_per_week` FLOAT NOT NULL DEFAULT 0.9,
    `price_per_month` FLOAT NOT NULL DEFAULT 0.7,
    `insurance_price` FLOAT NOT NULL DEFAULT 1.25,
    `deleted` BOOL NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`)
);
 */

@Entity
@Table( name = "vehicle_price" )
public class VehiclePrice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "price_per_day")
    private Long price_per_day;

    @Column(name = "price_per_week")
    private Long price_per_week;

    @Column(name = "price_per_month")
    private Long price_per_month;

    @Column(name = "insurance_price")
    private Long insurance_price;

    @Column(name = "deleted")
    private int deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice_per_day() {
        return price_per_day;
    }

    public void setPrice_per_day(Long price_per_day) {
        this.price_per_day = price_per_day;
    }

    public Long getPrice_per_week() {
        return price_per_week;
    }

    public void setPrice_per_week(Long price_per_week) {
        this.price_per_week = price_per_week;
    }

    public Long getPrice_per_month() {
        return price_per_month;
    }

    public void setPrice_per_month(Long price_per_month) {
        this.price_per_month = price_per_month;
    }

    public Long getInsurance_price() {
        return insurance_price;
    }

    public void setInsurance_price(Long insurance_price) {
        this.insurance_price = insurance_price;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return  id + ". " + price_per_day;
    }

}
