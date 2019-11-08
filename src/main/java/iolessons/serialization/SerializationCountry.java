package iolessons.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
//Сер с json в отличии от сер с джава(см User, TestUser, SuperUser) -
//инф читаемая не для паролей, объем данных меньше
public class SerializationCountry {

    // JSON XML YAML
    public static void main(String[] args) throws IOException {
        Country country = new Country("Germany", 1);
        //Country country = new Country();
        /*country.setId(1);
        country.setName("Germany");*/
        country.setFounder(new Founder("founder"));
        ObjectMapper objectMapper = new ObjectMapper();
        try (FileOutputStream fw = new FileOutputStream("D:\\Java\\General\\germany.json")) {
            fw.write(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsBytes(country));
        }
        try (FileInputStream in = new FileInputStream("D:\\Java\\General\\germany.json")) {
            Country deserCountry = objectMapper.readValue(in, Country.class);
            System.out.println(deserCountry);
        }

        Country deserCountry = objectMapper.readValue("{\"id\":2, \"name\":\"TEst\"}", Country.class);
        System.out.println(deserCountry);

    }
}
