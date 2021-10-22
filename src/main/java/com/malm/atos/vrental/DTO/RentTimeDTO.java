package com.malm.atos.vrental.DTO;

import com.malm.atos.vrental.entity.RentOrder;

public class RentTimeDTO {
    private Long id;
    private RentOrder idRentOrder;
    private String startRent;
    private String rentLimit;
    private String returnVehicle;
    private int status;
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
