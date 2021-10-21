package com.malm.atos.vrental.DTO;

public class BillingDTO {
    private Long id;
    private Long idRentOrder;
    private Long amount;
    private String createdDate;
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
     * @return Long return the amount
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * @return String return the createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
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
