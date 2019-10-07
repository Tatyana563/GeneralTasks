package lesson.oop.designpattern;
//Design pattern builder
public class User {
    private final long id;
    private final String firstName;
    private final String middleName;
    private final String email;
    private final String password;
    private final String fax;
    private final String phone;

    private String secondName;
    private String position;
//  поле final нициал сразу или в констр
    //При созданиее обекта со многими полями можно сделать ошибку
// спутать позиции. Ctr+ P посмотреть поля
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fax='" + fax + '\'' +
                ", phone='" + phone + '\'' +
                ", secondName='" + secondName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public User(final Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.email = builder.email;
        this.password = builder.password;
        this.fax = builder.fax;
        this.phone = builder.phone;
    }

    public static class Builder {
        private long id;
        private String firstName;
        private String middleName;
        private String email;
        private String password;
        private String fax;
        private String phone;

        public Builder() {}


        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setFax(String fax) {
            this.fax = fax;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
