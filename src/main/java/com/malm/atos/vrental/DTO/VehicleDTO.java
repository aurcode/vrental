package com.malm.atos.vrental.DTO;

import com.malm.atos.vrental.entity.VehiclePrice;
import com.malm.atos.vrental.entity.VehicleType;

public class VehicleDTO {
    private Long id;
    private String plateNumber;
    private VehicleType idVehicleType;
    private VehiclePrice idVehiclePrice;
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
     * @return String return the plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * @param plateNumber the plateNumber to set
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * @return VehicleType return the idVehicleType
     */
    public VehicleType getIdVehicleType() {
        return idVehicleType;
    }

    /**
     * @param idVehicleType the idVehicleType to set
     */
    public void setIdVehicleType(VehicleType idVehicleType) {
        this.idVehicleType = idVehicleType;
    }

    /**
     * @return VehiclePrice return the idVehiclePrice
     */
    public VehiclePrice getIdVehiclePrice() {
        return idVehiclePrice;
    }

    /**
     * @param idVehiclePrice the idVehiclePrice to set
     */
    public void setIdVehiclePrice(VehiclePrice idVehiclePrice) {
        this.idVehiclePrice = idVehiclePrice;
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