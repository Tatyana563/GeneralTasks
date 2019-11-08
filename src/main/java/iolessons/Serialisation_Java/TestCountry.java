package iolessons.Serialisation_Java;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestCountry {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<City> list2 = new ArrayList<>();
        list2.add(new City("Barcelona", false));
        list2.add(new City("Madrid", true));
        list2.add(new City("Valencia", false));
        EuropeanCountry country = new EuropeanCountry("Spain", 1, true);
        country.setCities(list2);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("European_Country.txt"))) {
            out.writeObject(country);
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("European_Country.txt"))) {
                EuropeanCountry newUser = (EuropeanCountry)in.readObject();
                System.out.println(newUser);

            }
        }
    }
}
