package com.Gender.Gender.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gender
{
    @Id
    private int id;
    private  String type;

    public Gender()
    {

    }

    public Gender(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
