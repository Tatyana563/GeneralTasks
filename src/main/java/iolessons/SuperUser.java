package iolessons;

import java.io.Serializable;

public class SuperUser implements Serializable {
//У каждого класса, реализующего Serializable, должно быть поле,
// содержащее уникальный идентификатор версии сериализованного класса
    private static final long serialVersionUID = -355933485912538826L;
    protected int id;

  public SuperUser(int id) {
        this.id = id;
   }

}
