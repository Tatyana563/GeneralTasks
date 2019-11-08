package iolessons.Serialisation_Java;

import iolessons.Role;
import iolessons.Serialization_JSON.City;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class Country implements Serializable {
    private static final long serialVersionUID = 5452784941149412969L;
    String name;
    int id;


    public Country(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
