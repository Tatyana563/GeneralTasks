package iolessons;

import javax.print.attribute.IntegerSyntax;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestUser {

    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        User user = new User(1, "Alex");
        user.setRoles(Collections.singleton(new Role("Super_user")));
        // try with resources можно использовать без catch;
       // обычный try можно использовать с finally без catch
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.txt"))) {
            out.writeObject(user);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.txt"))) {
            User newUser = (User)in.readObject();
            System.out.println(newUser);
            System.out.println(newUser.version);
        }

        List<Cloneable> list = new ArrayList<>();
        list.add(user);
        User u2 = (User) user.clone();
//1.Сохранить сост объкта user - порядок считывания=порядок записи сперва id, потом name
//DataInput/OutputStream работает лучше, потому что его намного проще.
// Он может только читать/писать примитивные типы и строки.
//
//ObjectInput/OutputStream может читать/записывать любой тип объекта,
// а также примитивы. Он менее эффективен, но гораздо проще в использовании,
// если вы хотите отправлять сложные данные.
        /*try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("user.out"));) {
            dos.writeInt(user.getId());
            dos.writeUTF(user.getName());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("user.out"));) {
            int id = dis.readInt();
            String name = dis.readUTF();
            User restoredUser = new User(id, name);
            System.out.println(restoredUser);
        }*/
    }
}
