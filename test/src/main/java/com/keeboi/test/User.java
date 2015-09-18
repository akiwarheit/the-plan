package com.keeboi.test;

import java.io.Serializable;

/**
 * Created by kdeloria on 9/18/2015.
 */
public class User implements Serializable {

    private String name;

    private String occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
