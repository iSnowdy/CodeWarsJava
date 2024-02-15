package Kyu_7;

public class Fighter {

    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {

        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        Fighter currentAttacker = firstAttacker.equals(fighter1.name) ? fighter1 : fighter2;
        Fighter currentDefender = currentAttacker == fighter1 ? fighter2 : fighter1;

        while (currentAttacker.health > 0 && currentDefender.health > 0) {
            // Instead of a damage function
            currentDefender.health -= currentAttacker.damagePerAttack;

            Fighter temp = currentAttacker;
            currentAttacker = currentDefender;
            currentDefender = temp;
        }

        if (fighter1.health <= 0)
            return fighter2.name;
        else
            return fighter1.name;
    }
}
