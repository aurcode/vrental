package com.malm.atos.vrental.DTO;

import com.malm.atos.vrental.entity.Client;
import com.malm.atos.vrental.entity.Vehicle;

public class RentOrderDTO {
    private Long id;
    private Vehicle idVehicle;
    private Client idClient;
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
     * @return Client return the idClient
     */
    public Client getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(Client idClient) {
        this.idClient = idClient;
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
