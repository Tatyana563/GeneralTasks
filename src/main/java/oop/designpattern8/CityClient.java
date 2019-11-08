package oop.designpattern8;

import iolessons.Serialisation_Java.City;

import java.util.Collection;

public class CityClient {

    private Database db;


    public void createCity(String name) {
        City city = new City(name, false);
        db.insert(city);
    }

    public Collection<City> list() {
        return db.list();
    }
}
