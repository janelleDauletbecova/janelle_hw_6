public class Skeleton extends Boss{
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String printInfo(){
        return "SKELETON HEALTH: " + getHealth() +  ", SKELETON DAMAGE: "
                + getDamage() + ", SKELETON HAS WEAPON: " + getWeapon().getWeaponType() + ", COUNTER ARROWS: " + getCounter();
    }
}