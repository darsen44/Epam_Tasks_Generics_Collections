package droids;

public class BattleDroid extends Droid {

    private String weaponName;
    private int weaponPower;

    public BattleDroid(String name, int age, String weaponName, int weaponPower) {
        super(name, age);
        this.weaponName = weaponName;
        this.weaponPower = weaponPower;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponPower() {
        return weaponPower;
    }

    public void setWeaponPower(int weaponPower) {
        this.weaponPower = weaponPower;
    }

    @Override
    public String toString() {
        return "BattleDroid{" +
                "weaponName='" + weaponName + '\'' +
                ", weaponPower=" + weaponPower +
                '}' +super.toString();
    }
}
