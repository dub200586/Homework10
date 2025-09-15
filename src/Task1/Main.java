package Task1;

public class Main {
    public static void main(String[] args) {
        SystemUser systemUser1 = new SystemUser(12, "Victor");
        SystemUser systemUser2 = new SystemUser(12, "Victor");

        System.out.println(systemUser1.equals(systemUser2));
    }
}
