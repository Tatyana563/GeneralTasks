package iolessons.Serialisation_Java;

import iolessons.Role;


import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EuropeanCountry extends Country {
    private static final long serialVersionUID = -1885330220564481342L;
    boolean EuropeanUnion;
    public List<City> cities;

    public EuropeanCountry(String name, int id, boolean europeanUnion) {
        super(name, id);
        EuropeanUnion = europeanUnion;
    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        outputStream.defaultWriteObject();
        if (cities != null && !cities.isEmpty()) {
            for (City item : cities)
                outputStream.writeObject(item);
        }

    }

    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
        cities = new ArrayList<>();
        int data;

        while ((data = inputStream.read()) != -1) {
            cities.add((City) (inputStream.readObject()));
        }
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "EuropeanCountry{" +
                "EuropeanUnion=" + EuropeanUnion +
                ", cities=" + cities +
                '}';
    }
}






