package iolessons;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;

public class FileTest {

    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(Arrays.toString(file.listFiles(File::isFile)));

        file.canWrite();

        file.canRead();

//найти файлы которые заканчиваются на .log
        for(File files: file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return "log".equals(pathname.getName().substring(pathname.getName().lastIndexOf(".")+1));
            }
        })) {

        }
        for(File files: file.listFiles(
                pathname ->
                 "log".equals(pathname.getName().substring(pathname.getName().lastIndexOf(".")+1))

        )) {
            files.delete();
        }

        System.out.println(Arrays.toString(file.listFiles(File::isFile)));

        file = new File("./src/main/java");
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        Path path = Paths.get("././src/main/java");
        System.out.println(path);
        //System.out.println(path.subpath(0, 2));
        System.out.println(path.normalize());

        FileSystems.getDefault().getFileStores()
                .forEach(item-> System.out.println(item.name()));
       System.out.println(path.toUri());

//        // c:\temp\test.txt;
        // ~\log.txt

    }
}
