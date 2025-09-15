package Task1;

import java.util.Objects;

public class SystemUser {
    private final String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SystemUser(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SystemUser{" + " name:" + name + ", age:" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SystemUser other)) {
            return false;
        }

        boolean equals = (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));

        return this.age == other.age && equals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
