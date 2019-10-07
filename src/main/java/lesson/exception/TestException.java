//package lesson.exception;
//
//import java.io.Closeable;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.nio.file.FileAlreadyExistsException;
//import java.rmi.AccessException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Vector;
//
//public class TestException extends SuperTestException implements Closeable {
//    private List<Integer> li = new ArrayList<Integer>();
//
//    @Override
//    public void calcValues() throws  IOException
//
//    {throw  new IOException("exception from calcValue method");
//    };
//
//    public void openFile(String file) throws RuntimeException {
//            throw new RuntimeException("file already exists");
//    }
//
//    public void openFile2(String file) throws AccessException, FileAlreadyExistsException, FileNotFoundException  {
//        try {
//            System.out.println("print line 1");
//            return;
//            //throw new RuntimeException("file already exists");
//        } finally {
//            System.out.println("print finally block code");
//        }
//    }
//
//
//
//    public static void main(String[] args) throws IOException{
//        //Throwable Exception
////        Error error = new Error();
////        RuntimeException re = new RuntimeException();
//
//        try (TestException te = new TestException()){
//
//            te.openFile2("dsdsd");
//            //System.out.println(1/0);
//            List<Integer> li = new ArrayList<>();
//            //li.get(100);
//            System.exit(0);
//            throw new FileNotFoundException();
////Если  catch (FileNotFoundException | FileAlreadyExistsException e)
////        то можно менять внутр сост e.initCause - скрыть stack trace
//            // но нельзя присвоит новый тип например
//            //e = new IndexOutOfBoundsException("sdsdsd");
//        } catch (FileNotFoundException | FileAlreadyExistsException e) {
//            System.err.println("occurred error during work with file " + e);
//            //e.initCause(null);
//            throw e;
//
//        } catch (IndexOutOfBoundsException e) {
//            //e = new IndexOutOfBoundsException("sdsdsd");
//            //throw e;
//            //System.err.println(1/0);
//        } catch (AccessException e) {
//            e.printStackTrace();
//        } finally {
//            //System.err.println(1/0);
//            System.err.println("test ");
//        }
//        System.err.println("next line");
//        TestException tt = new TestException();
//       try{ tt.calcValues();}
//       catch(IOException e){
//           System.err.println(e.getMessage());;
//       }
//
//    }
//
//    @Override
//    public void close() {
//        System.err.println("close this class");
//        li.clear();
//        li = null;
//    }
//}
////зайдет в finally after break, return continue UNLESS Error or System.exit
//// try with resources закроет даде если try catch fails. UNLESS System.exit
////Exception appear in 2 sections:
//// try finally, suppress:  try
////try with resources, try suppres: try with resources