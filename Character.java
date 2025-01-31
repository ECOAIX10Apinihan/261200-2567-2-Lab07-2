public class Character {
    private int health;
    private int stamina;
    private final int maxHealth;
    private final int maxStamina;

    // Constructor
    public Character(int health, int stamina) {
        this.maxHealth = health;
        this.maxStamina = stamina;
        this.health = health;
        this.stamina = stamina;
        System.out.println("Character created with " + health + " health and " + stamina + " stamina.");
    }

    // Getters
    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    // Method: swingSword
    public void swingSword() {
        int staminaCost = 10;
        if (stamina > 0) {
            stamina = Math.max(stamina - staminaCost, 0);
            System.out.println("Character swings sword. Stamina is now " + stamina + ".");
            if (stamina == 0) {
                System.out.println("Your character needs to cool down.");
            }
        } else {
            System.out.println("Not enough stamina to swing the sword.");
        }
    }

    // Method: takeDamage
    public void takeDamage(int damageAmount) {
        if (health > 0) {
            health = Math.max(health - damageAmount, 0);
            System.out.println("Character takes " + damageAmount + " damage. Health is now " + health + ".");
            if (health == 0) {
                System.out.println("Character is dead.");
            }
        } else {
            System.out.println("Character is already dead.");
        }
    }

    // Method: rest
    public void rest() {
        health = maxHealth;
        stamina = maxStamina;
        System.out.println("Character has rested. Health and stamina restored to maximum.");
    }

    // Main method for testing
    public static void main(String[] args) {
        // สร้าง instance ของ Character
        Character hero = new Character(100, 50);

        // Test swingSword() method
        for (int i = 0; i < 6; i++) {
            hero.swingSword();
        }

        // Test takeDamage(...) method
        hero.takeDamage(30);
        hero.takeDamage(50);
        hero.takeDamage(20);

        // Test rest() method
        hero.rest();

        // แสดงสถานะปัจจุบัน
        System.out.println("Character's health: " + hero.getHealth() + ", stamina: " + hero.getStamina());
    }
}
