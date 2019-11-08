package iolessons;

import java.io.*;

public class Revision {
    public static void main(String[] args) {
       writeFileBuffer();
    }

    private static void copying() {
        try (InputStream input =
                     new BufferedInputStream(new FileInputStream(
                             "D:\\IMPROVEment\\CPE PT Book.pdf"));
             OutputStream output =
                     new BufferedOutputStream(new FileOutputStream(
                             "D:\\IMPROVEment\\CPE PT Book2.pdf"));) {
            int data = 0;
            if ((data = input.read()) != 0) {
                output.write(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }
    private static void reader(){
        try( BufferedReader reader = new BufferedReader(new FileReader("D:\\IMPROVEment\\Remark.docx"));) {
           String data=null;
           while((data=reader.readLine())!=null){
               System.out.println(data);
           }
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void writeFileBuffer(){
        try(BufferedReader reader = new BufferedReader(new FileReader("D:\\IMPROVEment\\CPE PT Book.pdf"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\IMPROVEment\\CPE PT Book3.pdf"));
        ) {
            String data;
            while((data=reader.readLine())!=null){
                writer.write(data);
              writer.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

