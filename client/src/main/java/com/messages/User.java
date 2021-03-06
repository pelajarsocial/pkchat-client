package com.messages;

import java.io.Serializable;

/**
 * Create By : Zack_
 * Last Update : 27/12/2021
 */
public class User implements Serializable {

    private static final long serialVersionUID = 2742144767101018291L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String getPicture(){
        return picture;
    }
    public void getPicture(String picture){
        this.picture = picture;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    Status status;
    String picture;
}
