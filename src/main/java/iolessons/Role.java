package iolessons;

import java.io.Serializable;

public class Role /*implements Serializable */{

    private String name;

    public String getName() {
        return name;
    }

    public Role(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }
}
