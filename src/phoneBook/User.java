package phoneBook;

import java.util.Objects;

public class User {
        private String name;
        private int age;
        private String phone;

        public User(String name, int age, String phone) {
            setName(name);
            setAge(age);
            setPhone(phone);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (StringUtils.isValid(name)) {
                name = "имя не указано";
            }
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age <= 0) {
                age = 30;
            }
            this.age = age;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            if (StringUtils.isValid(phone)) {
                phone = "номер телефона не указан";
            }
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            phoneBook.User user = (phoneBook.User) o;
            return age == user.age && Objects.equals(name, user.name) && Objects.equals(phone, user.phone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, phone);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", phone='" + phone + '\'' +
                    '}';
        }
}
