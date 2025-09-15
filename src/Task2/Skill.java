package Task2;

public class Skill implements Cloneable {
    private final String name = "Java";

    public String getName() {
        return name;
    }

    @Override
    protected Skill clone() throws CloneNotSupportedException {
        return (Skill) super.clone();
    }
}
