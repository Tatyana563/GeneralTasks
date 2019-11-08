package iolessons.serialization;
// to convert object into Jason - import library jackson-databind
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Country implements Serializable {

    private static final long serialVersionUID = -397387075276504976L;
    private String name;
    private long id;
    private Founder founder;

    public Founder getFounder() {
        return founder;
    }

    public void setFounder(Founder founder) {
        this.founder = founder;
    }

    //@JsonProperty("simple")

    @JsonIgnore
    private transient boolean isActive = true;

    public Country(@JsonProperty("name") String name, @JsonProperty("id") long id) {
        this.name = name;
        this.id = id;
    }

    public String getLastVersion() {
        return "1.2.3";
    }

    public void setLastVersion(String version){

    }



    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", founder=" + founder +
                ", isActive=" + isActive +
                '}';
    }
}
