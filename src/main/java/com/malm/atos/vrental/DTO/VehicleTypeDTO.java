package com.malm.atos.vrental.DTO;

import javax.persistence.Column;

public class VehicleTypeDTO {
    private Long id;
    private String type;
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

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
}
