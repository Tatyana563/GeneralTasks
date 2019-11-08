package iolessons.Serialization_JSON;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
// JSON serial - setter, getters are required.
//OR getter+ constructor with all parameters
public class City implements Serializable {
    private static final long serialVersionUID = 5370618428055149671L;
    String name;
CityType type;

    public City(@JsonProperty("name") String name,@JsonProperty("type") CityType type) {
        this.name = name;
        this.type = type;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityType getType() {
        return type;
    }

    public void setType(CityType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
