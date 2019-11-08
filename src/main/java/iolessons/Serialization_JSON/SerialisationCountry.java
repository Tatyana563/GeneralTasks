package iolessons.Serialization_JSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SerialisationCountry {
    public static void main(String[] args) throws IOException {
        List<City> list = new ArrayList<>();
        list.add(new City("Istunbul",CityType.emerging_gateways));
        list.add(new City("Ankara",CityType.knowledge_capital));
        Country country = new Country("Turkey",1,list);
        ObjectMapper objectMapper = new ObjectMapper();
        try(FileOutputStream out = new FileOutputStream("D:\\JAVA\\General\\country_1.json")){
          out.write(objectMapper.writeValueAsBytes(country));
        }
        try(FileInputStream in = new FileInputStream("D:\\JAVA\\General\\country_1.json")){
            Country desCountry=objectMapper.readValue(in,Country.class);
            System.out.println(desCountry);
        }


    }

    public <T> void  serializationToJson(String path, T object) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try(FileOutputStream out = new FileOutputStream(path)){
            out.write(objectMapper.writeValueAsBytes(object));
        }
    }

    public <T> T restoredFromJson(String path, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        try(FileInputStream in = new FileInputStream(path)){
            T desCountry=objectMapper.readValue(in, clazz);
            return desCountry;
        }

    }




}
