package iolessons;

import lesson.exception.ExceptionA;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
//классы обертки реализуют Serializable
//Externalizable. - ручная реализ с сериализацией и десериализацией
//Serializable - интерфейс маркер не имеет методов как и Cloneable
public class User extends SuperUser implements Cloneable{
//variant1:
//-User extends SuperUser implements Serializable
// -SuperUser doesnt implements Serializable. имеет конструктор по умолчанию
//  сериализация пройдет но id=0;
 //variant2:
//User extends SuperUser, SuperUser implements Serializable (Object doesnt impl Serialisable)
    // станд констр - смотри текущий пример
    // сериализация пройдет id имеет прав значение;
// добавить поле когда отдаешь заказчику. Если что то меняем в коде меняем поле
    // Если java видит это поле не считает hashcode, работает быстрее
    //create serialversionUID File → Settings... → Inspections →
// Serialization issues → Serializable class without 'serialVersionUID'enabled
    private static final long serialVersionUID = -6085887279763706076L;
    private String name;

    public static int version;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return new User(this.id, this.name);
    }
// equals, hashcode нужны и для ArrayList contains, remove
    //before Deserial Java calculates metadata - compare 2 numbers.if different cant deserial
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(roles, user.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, roles);
    }
// transient поле не будет Serializable;
    //static поле не будет Serializable;static хар-ет класс, не объект
    // if private  Collection<Role> roles; BUT Roles doesn't implement Serialisable - error
    private transient Collection<Role> roles;

    public User(int id, String name) {
        super(id);
        this.name = name;
        this.version = 10;
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        is.defaultReadObject();
        roles = new ArrayList<>();
        while(true) {
            try {
                roles.add(new Role(is.readUTF()));
            } catch (Exception e) {
                break;
            }
        }
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        if (roles != null && !roles.isEmpty()) {
            for (Role role: roles) {
                os.writeUTF(role.getName());
            }
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String
    toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
