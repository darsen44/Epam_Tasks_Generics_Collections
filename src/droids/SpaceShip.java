package droids;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpaceShip {
    private List<? extends Droid> droids;

    public SpaceShip(List<? extends Droid> droids) {
        this.droids = droids;
    }

    public List<? extends Droid> getDroids() {
        return droids;
    }

    public void setDroids(List<? extends Droid> droids) {
        this.droids = droids;
    }

    public static void main(String[] args) {
     Droid d = new Droid("d",3);
     BattleDroid bD = new BattleDroid("bD",6,"Gun",99);
     FriendlyDroid fD = new FriendlyDroid("fD0",12,100);
     List<Droid> droids1 = new ArrayList<>(Arrays.asList(d,bD,fD));
     List<Droid> droids2 = new ArrayList<>(Arrays.asList(d,bD));
     SpaceShip ship1 = new SpaceShip(droids1);
     SpaceShip ship2 = new SpaceShip(droids2);
     System.out.println(ship1.getDroids());
     System.out.println(ship2.getDroids());

    }
}
