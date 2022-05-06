package com.krekson.zadatakbackend.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "invoice")
public class Invoice implements Serializable {
    @Id
    private Integer id;
    private String customId;
    private Integer partnerId;
    private String partnerName;
    private String country;
    private String city;
    private Date date;
    private Float total;

    public Invoice() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customId='" + customId + '\'' +
                ", partnerId=" + partnerId +
                ", partnerName='" + partnerName + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}
