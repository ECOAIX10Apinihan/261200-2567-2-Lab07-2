public class Main {
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
