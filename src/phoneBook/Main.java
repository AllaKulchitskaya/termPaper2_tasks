package phoneBook;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[6];
        users[0] = new User("Алина", 29, "+79816294529");
        users[1] = new User("Александр", 41, "+79206520752");
        users[2] = new User("Ирина", 36, "+79117038249");
        users[3] = new User("Олег", 32, "+79043198314");
        users[4] = new User("Татьяна", 51, "+79006530185");
        users[5] = new User("Григорий", 43, "+79624076971");
        Map<String, String> phoneBook = createPhoneBook(users);
        printPhoneBook(phoneBook);
    }

    private static Map<String, String> createPhoneBook (User[] users) {
        Map<String, String> phoneBook = new HashMap<>();
        for (User user : users) {
            phoneBook.put(user.getPhone(), user.getName());
        }
        return phoneBook;
    }

    private static void printPhoneBook(Map<String, String> users) {
        for (Map.Entry<String, String> contact : users.entrySet()) {
            System.out.println("Номер: " + contact.getKey() + ", имя: " + contact.getValue());
        }
    }
}
