package com.krekson.zadatakbackend.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item")
public class Item implements Serializable {
    @Id
    private Integer id;
    private Integer code;
    private String name;
    private Integer qUnit;
    private Float price;
    private Float vat;

    public Item() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getqUnit() {
        return qUnit;
    }

    public void setqUnit(Integer qUnit) {
        this.qUnit = qUnit;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getVat() {
        return vat;
    }

    public void setVat(Float vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", qUnit=" + qUnit +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
