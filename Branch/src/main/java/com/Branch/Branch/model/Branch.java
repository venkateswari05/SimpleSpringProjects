package com.Branch.Branch.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch
{
    @Id
    private long id;
    private String name;
    private int count;

    public Branch()
    {

    }

    public Branch(long id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
