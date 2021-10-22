package com.malm.atos.vrental.DTO;

public class VehiclePriceDTO {
    private Long id;
    private Double price_per_day;
    private Double price_per_week;
    private Double price_per_month;
    private Double insurance_price;
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
     * @return Double return the price_per_day
     */
    public Double getPrice_per_day() {
        return price_per_day;
    }

    /**
     * @param price_per_day the price_per_day to set
     */
    public void setPrice_per_day(Double price_per_day) {
        this.price_per_day = price_per_day;
    }

    /**
     * @return Double return the price_per_week
     */
    public Double getPrice_per_week() {
        return price_per_week;
    }

    /**
     * @param price_per_week the price_per_week to set
     */
    public void setPrice_per_week(Double price_per_week) {
        this.price_per_week = price_per_week;
    }

    /**
     * @return Double return the price_per_month
     */
    public Double getPrice_per_month() {
        return price_per_month;
    }

    /**
     * @param price_per_month the price_per_month to set
     */
    public void setPrice_per_month(Double price_per_month) {
        this.price_per_month = price_per_month;
    }

    /**
     * @return Double return the insurance_price
     */
    public Double getInsurance_price() {
        return insurance_price;
    }

    /**
     * @param insurance_price the insurance_price to set
     */
    public void setInsurance_price(Double insurance_price) {
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
