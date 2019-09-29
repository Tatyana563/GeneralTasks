package lesson.Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    //public static final String email="petrov25@gmail.com";
    public static final String email="petrov#%^25@gmail.com";
    //public static final String phone="(+380)634153700";
    public static final String phone="+380634153700";

    public static  void validateEmail(String email){
        String regex = "^[a-zA-Z0-9!#_$%&'*+/?{}|~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher  =pattern.matcher(email);
        if(matcher.find()){
            System.out.println("Email is valid:"+email);
        }
       else System.out.println("Email is not valid");
    }
    public static void validatePhone(String phone){
        //^\\(? - May start with an option "("
       // \\)? - May have an optional ")"
        String regex = "^\\+(380)[0-9]{9}$";
       // String regex = "[+\\(?\\d{3}\\)?]\\d{9}";
        //"\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"
        //00380634153700 +380634153700
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher=pattern.matcher(phone);
        if(matcher.matches()){
            System.out.println("Phone is valid:"+phone);
        }
        else System.out.println("Phone is not valid");
    }


        public static void main(String[] args) {
validateEmail(email);
validatePhone(phone);
        }

}
