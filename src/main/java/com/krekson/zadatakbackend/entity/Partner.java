package com.krekson.zadatakbackend.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "partner")
public class Partner implements Serializable {
    @Id
    private Integer id;
    private String name;

    public Partner() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Partner{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
