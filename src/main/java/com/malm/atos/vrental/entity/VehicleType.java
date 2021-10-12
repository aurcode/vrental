package com.malm.atos.vrental.entity;

import javax.persistence.*;
import java.io.Serializable;

/*`id` INT NOT NULL AUTO_INCREMENT,
    `type` VARCHAR(20) NOT NULL,
    `deleted` BOOL NOT NULL DEFAULT 0,
    UNIQUE (`type`),
    PRIMARY KEY (`id`)*/

@Entity
@Table( name = "vehicle_type" )
public class VehicleType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "deleted")
    private int deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDelete() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return  id + ". " + type;
    }

}
