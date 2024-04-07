package Football;

public class Main {
    public static void main(String args[]) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player player6 = new Player();


        player1.info();
        player2.info();
        player3.info();
        player4.info();
        player5.info();
        player6.info();

        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());
        Player extraPlayer = new Player(); // Попытка создать 7-го игрока
        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());
        while (player1.getStamina() != 0) {
            player1.run();
        }
        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());
    }
}
