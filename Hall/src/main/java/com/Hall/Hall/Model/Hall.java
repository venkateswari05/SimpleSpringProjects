package com.Hall.Hall.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hall
{

    @Id
    private int id;
    private int width;
    private int length;
    private boolean isDinning;

    public Hall()
    {

    }

    public Hall(int id, int width, int length, boolean isDinning)
    {
        this.id = id;
        this.width = width;
        this.length = length;
        this.isDinning = isDinning;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isDinning() {
        return isDinning;
    }

    public void setDinning(boolean dinning) {
        isDinning = dinning;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "id=" + id +
                ", width=" + width +
                ", length=" + length +
                ", isDinning=" + isDinning +
                '}';
    }
}

