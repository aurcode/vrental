package com.malm.atos.vrental.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "rent_time" )
public class RentTime implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "id_rent_order")
    private Long idRentOrder;

    @Column(name = "start_rent") // DATETIME
    private String startRent;

    @Column(name = "rent_limit") // DATETIME
    private String rentLimit;

    @Column(name = "return_vehicle") // DATETIME
    private String returnVehicle;

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
     * @return Long return the idRentOrder
     */
    public Long getIdRentOrder() {
        return idRentOrder;
    }

    /**
     * @param idRentOrder the idRentOrder to set
     */
    public void setIdRentOrder(Long idRentOrder) {
        this.idRentOrder = idRentOrder;
    }

    /**
     * @return String return the startRent
     */
    public String getStartRent() {
        return startRent;
    }

    /**
     * @param startRent the startRent to set
     */
    public void setStartRent(String startRent) {
        this.startRent = startRent;
    }

    /**
     * @return String return the rentLimit
     */
    public String getRentLimit() {
        return rentLimit;
    }

    /**
     * @param rentLimit the rentLimit to set
     */
    public void setRentLimit(String rentLimit) {
        this.rentLimit = rentLimit;
    }

    /**
     * @return String return the returnVehicle
     */
    public String getReturnVehicle() {
        return returnVehicle;
    }

    /**
     * @param returnVehicle the returnVehicle to set
     */
    public void setReturnVehicle(String returnVehicle) {
        this.returnVehicle = returnVehicle;
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
