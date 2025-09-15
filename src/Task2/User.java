package Task2;

public class User implements Cloneable {
    private final int id;
    private Skill skill;

    public User(int id, Skill skill) {
        this.id = id;
        this.skill = skill;
    }

    public int getId() {
        return id;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
