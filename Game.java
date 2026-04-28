public class Game {
    public static void main(String[] args) {
        Spell fireball = new Spell("Fireball", 30, 50, "fire");
        Spell magicMissile = new Spell("Magic Missile", 10, 15);
        Spell spark = new Spell("Spark");

        fireball.describe();
        magicMissile.describe();
        spark.describe();

        System.out.println();
        System.out.println(fireball.getName() + " is a " + fireball.getElement() + " spell");
        System.out.println(magicMissile.getName() + " is a " + magicMissile.getElement() + " spell");
        System.out.println(spark.getName() + " costs " + spark.getManaCost() + " mana");
    }
}
