package lesson.oop.designpattern;

public class TestUser {

    public static void main(String[] args) {
        User.Builder userBuilder = new User.Builder();
        userBuilder
                .setId(0)
                .setEmail("email")
                .setFax("fax")
                .setFirstName("firstname")
                .setMiddleName("middle")
                .setPassword("pass")
                .setPhone("dfdfd");
        User user = userBuilder.build();
        user.setPosition("dfdf");

        System.out.println(user);
    }
}
