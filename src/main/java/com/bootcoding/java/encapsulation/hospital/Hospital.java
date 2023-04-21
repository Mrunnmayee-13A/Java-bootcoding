package com.bootcoding.java.encapsulation.hospital;

import java.util.UUID;

public class Hospital {
    private String name;
    private String address;
    private UUID id;
    private String  service;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }


    }




