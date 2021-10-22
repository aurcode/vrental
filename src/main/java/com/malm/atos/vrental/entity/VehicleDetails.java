package com.malm.atos.vrental.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "vehicle_details" )
public class VehicleDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_vehicle")
    private Vehicle idVehicle;

    @ManyToOne
    @JoinColumn(name = "id_rent_order")
    private RentOrder idRentOrder;

    @Column(name = "detail")
    private String detail;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "status")
    private int status;

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
     * @return Vehicle return the idVehicle
     */
    public Vehicle getIdVehicle() {
        return idVehicle;
    }

    /**
     * @param idVehicle the idVehicle to set
     */
    public void setIdVehicle(Vehicle idVehicle) {
        this.idVehicle = idVehicle;
    }

    /**
     * @return RentOrder return the idRentOrder
     */
    public RentOrder getIdRentOrder() {
        return idRentOrder;
    }

    /**
     * @param idRentOrder the idRentOrder to set
     */
    public void setIdRentOrder(RentOrder idRentOrder) {
        this.idRentOrder = idRentOrder;
    }

    /**
     * @return String return the detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * @return Double return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return int return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
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

}
