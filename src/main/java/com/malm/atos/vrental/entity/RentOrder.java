package com.malm.atos.vrental.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "rent_order" )
public class RentOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_vehicle")
    private Vehicle idVehicle;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client idClient;

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
