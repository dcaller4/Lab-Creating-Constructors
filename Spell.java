public class Spell {
    private String name;
    private int manaCost;
    private int damage;
    private String element;

    public Spell(String name, int manaCost, int damage, String element) {
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
        this.element = element;
    }

    public Spell(String name, int manaCost, int damage) {
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
        this.element = "neutral";
    }

    public Spell(String name) {
        this.name = name;
        this.manaCost = 5;
        this.damage = 1;
        this.element = "neutral";
    }

    public String getName() { return name; }
    public int getManaCost() { return manaCost; }
    public int getDamage() { return damage; }
    public String getElement() { return element; }

    public void describe() {
        System.out.println(name + " [" + element + "] - " + 
                           damage + " dmg, costs " + manaCost + " mana");
    }
}
