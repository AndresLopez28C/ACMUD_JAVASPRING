package com.acm.taller_2.modelo;

import java.io.Serializable;
import java.util.List;

public class Pokemon implements Serializable{
    private int id;
    private String name;
    private float height;

    public Pokemon(){

    }

    public Pokemon(int id, String name, float height) {

        this.id = id;
        this.name = name;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
