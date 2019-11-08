package iolessons.serialization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Founder {
    private String name;

    public Founder(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Founder{" +
                "name='" + name + '\'' +
                '}';
    }
}
