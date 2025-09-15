package Task1;

import java.util.Objects;

public class SystemUser {
    public String name;
    public int age;

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
        if (!(obj instanceof SystemUser)) {
            return false;
        }
        SystemUser other = (SystemUser) obj;
        boolean equals = (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));
        return this.age == other.age && equals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
