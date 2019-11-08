package iolessons;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Random;

public class HomeTask {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder(10);
        //Random number from a 97 to 122

    for(int i=0;i<10; i++) {
        //double rand = 97+Math.random()*25;
        Random random = new Random((int)'a');
        //double rand = 97+Math.random()*25;
        int value = random.nextInt((int)'z');
        buffer.append((char) value);
    }
        System.out.println("Buffer: "+buffer);

systemDetails();
randomString();
    }
    public static void systemDetails(){
        FileSystem fs = FileSystems.getDefault();
        for(FileStore s:fs.getFileStores()){
            printDetails(s);
            System.out.println(FileSystems.getDefault());

        }
        for(Path root:fs.getRootDirectories()){
            System.out.println(root);
        }
    }
    public static void printDetails(FileStore store){
        String disk = store.toString();
        long totalSpace= 0;
        long availableSpace=0;
        try {
            totalSpace = store.getTotalSpace();
           availableSpace = store.getUsableSpace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(disk+ "totalSpace: "+totalSpace + " "+
                "availableSpace: "+availableSpace);

    }
    public static void randomString(){
       String str = RandomStringUtils.randomAlphabetic(10);
        System.out.println(str);
    }

}
