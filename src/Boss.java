public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "BOSS HEALTH: " + getHealth() +  ", BOSS DAMAGE: "
                + getDamage() + ", BOSS HAS WEAPON: " + getWeapon().getWeaponType();
    }
}