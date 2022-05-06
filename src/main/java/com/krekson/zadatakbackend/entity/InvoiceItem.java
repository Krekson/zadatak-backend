package com.krekson.zadatakbackend.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class InvoiceItem implements Serializable {
    @Id
    private Integer id;
    private Integer itemId;
    private Integer itemCode;
    private String itemName;
    private Integer itemQUnit;
    private Integer quantity;
    private Float itemPrice;
    private Float itemVat;
    private Integer invoiceId;

    public InvoiceItem() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemCode() {
        return itemCode;
    }

    public void setItemCode(Integer itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQUnit() {
        return itemQUnit;
    }

    public void setItemQUnit(Integer itemQUnit) {
        this.itemQUnit = itemQUnit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Float getItemVat() {
        return itemVat;
    }

    public void setItemVat(Float itemVat) {
        this.itemVat = itemVat;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }
}
