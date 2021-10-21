package com.malm.atos.vrental.DTO;

public class VehicleDTO {
    private Long id;
    private String plateNumber;
    private Long idVehicleType;
    private Long idVehiclePrice;
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
     * @return Long return the idVehicleType
     */
    public Long getIdVehicleType() {
        return idVehicleType;
    }

    /**
     * @param idVehicleType the idVehicleType to set
     */
    public void setIdVehicleType(Long idVehicleType) {
        this.idVehicleType = idVehicleType;
    }

    /**
     * @return Long return the idVehiclePrice
     */
    public Long getIdVehiclePrice() {
        return idVehiclePrice;
    }

    /**
     * @param idVehiclePrice the idVehiclePrice to set
     */
    public void setIdVehiclePrice(Long idVehiclePrice) {
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