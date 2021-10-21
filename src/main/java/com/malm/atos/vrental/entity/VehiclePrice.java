package com.malm.atos.vrental.entity;

import javax.persistence.*;
import java.io.Serializable;

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
    
    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return Long return the price_per_day
     */
    public Long getPrice_per_day() {
        return price_per_day;
    }

    /**
     * @param price_per_day the price_per_day to set
     */
    public void setPrice_per_day(Long price_per_day) {
        this.price_per_day = price_per_day;
    }

    /**
     * @return Long return the price_per_week
     */
    public Long getPrice_per_week() {
        return price_per_week;
    }

    /**
     * @param price_per_week the price_per_week to set
     */
    public void setPrice_per_week(Long price_per_week) {
        this.price_per_week = price_per_week;
    }

    /**
     * @return Long return the price_per_month
     */
    public Long getPrice_per_month() {
        return price_per_month;
    }

    /**
     * @param price_per_month the price_per_month to set
     */
    public void setPrice_per_month(Long price_per_month) {
        this.price_per_month = price_per_month;
    }

    /**
     * @return Long return the insurance_price
     */
    public Long getInsurance_price() {
        return insurance_price;
    }

    /**
     * @param insurance_price the insurance_price to set
     */
    public void setInsurance_price(Long insurance_price) {
        this.insurance_price = insurance_price;
    }

    /**
     * @return int return the deleted
     */
    public int getDeleted() {
        return deleted;
    }

    /**
     * @param deleted the deleted to set
     */
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return  id + ". " + price_per_day + "$";
    }

}
