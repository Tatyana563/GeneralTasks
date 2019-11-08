package iolessons.Serialisation_Java;

import java.io.Serializable;
import java.util.Objects;

public class City implements Serializable {
    private static final long serialVersionUID = -5057959397445729280L;
    String name;
    boolean capital;
    private Integer id;

    public City(String name, boolean capital) {
        this.name = name;
        this.capital = capital;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return capital == city.capital &&
                Objects.equals(name, city.name) &&
                Objects.equals(id, city.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, id);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", capital=" + capital +
                ", id=" + id +
                '}';
    }
}
