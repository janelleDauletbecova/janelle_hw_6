public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        weapon.setWeaponType(WeaponType.AXE);
        boss.setWeapon(weapon);
        boss.setHealth(500);
        boss.setDamage(30);
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(150);
        skeleton.setDamage(20);
        skeleton.setCounter(10);
        weapon.setWeaponType(WeaponType.SWORD);
        skeleton.setWeapon(weapon);
        System.out.println(skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(15);
        skeleton1.setCounter(5);
        weapon.setWeaponType(WeaponType.BOW);
        skeleton1.setWeapon(weapon);
        System.out.println(skeleton1.printInfo());
    }
}