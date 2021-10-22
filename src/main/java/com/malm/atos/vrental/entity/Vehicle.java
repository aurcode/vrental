package com.malm.atos.vrental.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "vehicle" )
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "plate_number")
    private String plateNumber;

    @ManyToOne
    @JoinColumn(name = "id_vehicle_type")
    private VehicleType idVehicleType;

    @OneToOne
    @JoinColumn(name = "id_vehicle_price")
    private VehiclePrice idVehiclePrice;

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