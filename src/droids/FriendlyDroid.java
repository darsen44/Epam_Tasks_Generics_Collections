package droids;

public class FriendlyDroid extends Droid {

    private int health;

    public FriendlyDroid(String name, int age, int health) {
        super(name, age);
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "FriendlyDroid{" +
                "health=" + health +
                '}' + super.toString();
    }
}
