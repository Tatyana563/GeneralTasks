package iolessons;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.*;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
//Задание по файлам, на основании изученного материала,
// реализовать метод, на вход которого будет подаваться путь к файлу и
// название файла. На основании данной информации сделать создание файла по
// указанному пути с записью произвольной текстовой информации.
// Метод должен производить всевозможные проверки, к примеру, существует
// !!ли такой путь. если нет, то создать. А если есть такой путь,
// !!проверить доступ к нему и проверить директория ли это.  Также проверить
// !!достаточно ли места на диске
public class HomeTask2 {
    public static void main(String[] args) throws IOException {
        getFile(new File("D:\\JAVA\\General\\5.txt"));

    }
    public static void getFile(File file) throws IOException {
        FileSystem fs = FileSystems.getDefault();
        for (FileStore s : fs.getFileStores()) {
            printDetails(s);

        }
        if (file.exists()) {
            String canonicalPath = file.getCanonicalPath();


            System.out.println("File is a directory: " + file.isDirectory());
            OutputStream out = new BufferedOutputStream(new FileOutputStream(canonicalPath));
            out = new FileOutputStream("created.txt");
            String str = RandomStringUtils.randomAlphabetic(10);

            out.write(str.getBytes());

        } else {
            //  boolean created = file.createNewFile();
            System.out.println("File is a directory: " + file.isDirectory());
            OutputStream out = new BufferedOutputStream(new FileOutputStream(file.getCanonicalPath()));
            out = new FileOutputStream("created2.txt");
            String str = RandomStringUtils.randomAlphabetic(10);
            if(str.getBytes().length < file.getFreeSpace()) {
                out.write(str.getBytes().length);
            }
        }
    }

    public static void printDetails(FileStore store) {
        String disk = store.toString();
        long totalSpace = 0;
        long availableSpace = 0;
        try {
            totalSpace = store.getTotalSpace();
            availableSpace = store.getUsableSpace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(disk+ "totalSpace: "+totalSpace + " "+
                "availableSpace: "+availableSpace);

    }
}