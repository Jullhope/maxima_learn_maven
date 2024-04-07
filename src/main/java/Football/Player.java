package Football;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;

    private static int countPlayers;


    public int getStamina() {
        return stamina;
    }

    public Player() {
        this.stamina = generateStamina();
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игрок устал и ушел с поля");
        }
    }

    public void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
    private int generateStamina() {
        Random random = new Random();
        return random.nextInt(11) + 90;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
