package iolessons.Serialization_JSON;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class Country implements Serializable {
    private static final long serialVersionUID = 7739056430024848808L;
    String name;
    int id;
    List<City> cityList;

    public Country(@JsonProperty("name") String name, @JsonProperty("id") int id,@JsonProperty("cityList") List<City> cityList) {
        this.name = name;
        this.id = id;
        this.cityList = cityList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cityList=" + cityList +
                '}';
    }
}
