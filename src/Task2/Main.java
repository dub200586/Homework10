package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите id пользователя");
            int id;

            if (sc.hasNextInt()) {
                id = sc.nextInt();
            } else {
                System.out.println("Введите число");
                continue;
            }

            user = getUserById(id);

            if (user == null) {
                System.out.println("Пользователь не найден");
                continue;
            }

            sc.nextLine();
            break;
        }

        while (true) {
            System.out.println("Введите тип кланирования(p/g)");
            String cloneType;

            cloneType = sc.nextLine();

            if (cloneType.equals("p")) {
                user.clone();
                System.out.println("Поверхносное кланирование совершено");
            } else if (cloneType.equals("g")) {
                User newUser = user.clone();
                newUser.setSkill(user.getSkill().clone());
                System.out.println("Глубокое кланирование совершено");
            } else {
                System.out.println("Тип введен не верно");
                continue;
            }

            sc.close();
            break;
        }

    }

    static User getUserById(int id) {
        User[] users = {new User(1, new Skill()), new User(2, new Skill()), new User(3, new Skill())};

        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }
}
