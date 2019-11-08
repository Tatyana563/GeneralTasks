package iolessons;

import java.io.*;
//https://www.baeldung.com/java-buffered-reader
public class HomeTask3 {
    public static void main(String[] args) throws IOException {
      //  givenBufferedReader_whenSkipsWhitespacesAtBeginning_thenOk();

        // declare the BufferedReader Class
        // used the InputStreamReader to read the console input
        BufferedReader reader = new BufferedReader(new FileReader("D:\\JAVA\\General\\11.txt"));

        // catch the possible IOException by the read() method
        try {

            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            reader.mark(2);
            System.out.println("Printing characters after mark");
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            reader.reset();
            System.out.println("Printing characters after reset");
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            System.out.println((char)reader.read());
            // close the BufferedReader object
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void givenBufferedReader_whenSkipsWhitespacesAtBeginning_thenOk()
            throws IOException {
        String result;

        try (BufferedReader reader =
                     new BufferedReader(new StringReader("    Lorem ipsum dolor sit amet."))) {
            do {
                reader.mark(1);
            } while (Character.isWhitespace(reader.read()));

            reader.reset();
            result = reader.readLine();
        }

        System.out.println(result);
    }


}