package oop.designpattern8;

import iolessons.Serialisation_Java.City;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//design pattern singletone
//constructor is private, only 1 object of a class can be created
//in project1 @service, @repository created singletone
//Проблемы многопот - 1)атомарность операций (count++ -обернуть в synchronised)
//в 1 мом времени 1 поток зайдет
//2)взаимное исключение
//3)видимость изменений для всех
//Use volatile to avoid reordering operations, db is visible when
// is saved in memory only
public class Database {
    private static volatile  Database db;

  private Database(){}
//    public static final Database getInstance(){
//      db=new Database();
//      return db;
//    }

    public static final Database getInstance() {
      // thread1, thread2, thread3
      if (db == null)  {
           synchronized (Database.class){
               if(db==null){
                   db=new Database();
               }
           }
        }
        return db;
    }


    private /*static final*/ Map<Integer, City> cities = new HashMap<>();

    public void insert(City city) {
        int id = cities.size() + 1;
        city.setId(id);
        cities.put(id, city);
    }

    public Collection<City> list() {
        return cities.values();
    }

}
