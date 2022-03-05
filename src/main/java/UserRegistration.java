import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {
    public static void main(String[] args) {
        //UC1 FirstName
        System.out.println("-----------UC1-----------");

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher("Ganesh");
        System.out.println(matcher.find());

        //UC2 LastName
        System.out.println("-----------UC2-----------");

        Pattern lastName = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher1 = lastName.matcher("Moturu");
        System.out.println(matcher1.find());

        //UC3 Email
        System.out.println("-----------UC3------------");

        Pattern email = Pattern.compile("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z])+[.][a-zA-z]{2,4}([.][a-zA-z]{2,4})?$");
        Matcher matcher2 = email.matcher("abc.xyz@bl.co.in");
        System.out.println(matcher2.find());

        //UC4 MobileFormat
        System.out.println("-----------UC4------------");
        Pattern mobile = Pattern.compile("^(\\+91|0|91)?[9876][0-9]{9}$");
        Matcher matcher3 = mobile.matcher("09949975752");
        System.out.println(matcher3.find());

        //UC5 PASSWORD - minimum 8 characters
        System.out.println("-----------UC5------------");
        Pattern password = Pattern.compile("[A-Z a-z 0-9]{8,}");
        Matcher matcher4 = password.matcher("awefvfveqr");
        System.out.println(matcher4.find());

        //UC6 PASSWORD - should have at least 1 Uppercase
        System.out.println("-----------UC6------------");
        Pattern password1 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]){8}.*$");
        Matcher matcher5 = password1.matcher("rBuskbefhghA");
        System.out.println(matcher5.find());

        //UC7 PASSWORD - should have at least 1 numeric number
        System.out.println("-----------UC7------------");
        Pattern password2 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){8,}.*$");
        Matcher matcher6 = password2.matcher("1ab461354D1ijP");
        System.out.println(matcher6.find());

        //UC8 PASSWORD - should have at least 1 numeric number
        System.out.println("-----------UC8------------");
        Pattern password3 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]){8,}.*$");
        Matcher matcher7 = password3.matcher("1ab+461354D@1ijP-");
        System.out.println(matcher7.find());


    }

}