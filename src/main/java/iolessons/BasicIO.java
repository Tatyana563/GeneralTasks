package iolessons;

import java.io.*;
import java.nio.charset.Charset;

public class BasicIO {

    public static void main(String[] args) throws IOException {
        copyFileData2();
    }

    private static void copyFileData2() throws IOException {
        try (InputStream is = (new ByteArrayInputStream("sample text file".getBytes()));
            OutputStream out = new BufferedOutputStream(new FileOutputStream("intout.log", true));
        ) {
            int data;
            while ( (data = is.read()) !=  -1) {
                out.write(data);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    //TODO not work
    private static void copyFileData() throws IOException {
        try (DataInputStream is = new DataInputStream(new FileInputStream("log.txt"));
             //OutputStream out = new BufferedOutputStream(new FileOutputStream("intout.log"));
        ) {
            String data;
            while ( (data = is.readUTF()) !=  null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    //TODO not work
    private static void copyFile() {
        try (InputStream is = new FileInputStream("1.zip");
             OutputStream out = new FileOutputStream("2.zip");
        ) {
            int data = 0;
            byte[] buffer = new byte[2048];
            data = is.read(buffer);
            int count = 0;
            while ( data !=  -1) {
                System.out.println(data);
                out.write(data);
                data = is.read(buffer);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void copyFile2() {
        try (InputStream is = new BufferedInputStream(new FileInputStream("1.zip"));
             OutputStream out = new BufferedOutputStream(new FileOutputStream("2.zip"));
        ) {
            int data = 0;
            while ( (data = is.read()) !=  -1) {
                out.write(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFileBuffered() {
        try (
            BufferedReader is = new BufferedReader(new FileReader("D:/JAVA/General/1.log"));) {
            String data;
            while ((data = is.readLine()) != null) {
                System.out.print(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeFileBuffered() {
        try (
            BufferedReader is = new BufferedReader(new FileReader("D:/JAVA/General/1.log"));
            BufferedWriter out = new BufferedWriter(new FileWriter("D:/JAVA/General/2.log"));) {
            String data;
            while ((data = is.readLine()) != null) {
                out.write(data);
                out.write("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeFile() {
        try (
                FileReader is = new FileReader("D:/JAVA/General/1.log");
            BufferedWriter out = new BufferedWriter(new FileWriter("D:/JAVA/General/2.log"));) {
            int data;
            while ((data = is.read()) != -1) {
                out.write(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFileExt() {
        try (
            FileReader is = new FileReader("D:/JAVA/General/1.log");) {
            int data;
            while ((data = is.read()) != -1) {
                System.out.print((char)data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFile() {
        InputStream is = null;
        try {
            is = new FileInputStream("D:/JAVA/General/1.log");
            int data = 0;
            while ((data = is.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    // do nothing;
                }
            }
        }
    }
}
