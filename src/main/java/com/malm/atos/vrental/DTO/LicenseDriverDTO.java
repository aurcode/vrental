package com.malm.atos.vrental.DTO;

import com.malm.atos.vrental.entity.Client;
import com.malm.atos.vrental.entity.LicenseType;

public class LicenseDriverDTO {
    private Long id;
    private Client idClient;
    private LicenseType idLicenseType;
    private String issueDate;
    private String expire;
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
     * @return LicenseType return the idLicenseType
     */
    public LicenseType getidLicenseType() {
        return idLicenseType;
    }

    /**
     * @param idLicenseType the idLicenseType to set
     */
    public void setidLicenseType(LicenseType idLicenseType) {
        this.idLicenseType = idLicenseType;
    }

    /**
     * @return String return the issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return String return the expire
     */
    public String getExpire() {
        return expire;
    }

    /**
     * @param expire the expire to set
     */
    public void setExpire(String expire) {
        this.expire = expire;
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
