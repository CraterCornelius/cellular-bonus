public class Main {
    public static void main(String[] args) {

        int initial = 100;
        int replenish = 900;
        int total = initial + replenish;
        int bonus = replenish / 100;

        if (replenish >= 1000) {
            System.out.println(" Поздравляем, ваш бонус за пополнение на сумму " + replenish + " рублей составил " + bonus + " рублей. Ваш баланс равен " + total + " рублей ");
        } else {
            System.out.println(" Вы пополнили счёт на " + replenish + " рублей. Ваш баланс равен " + total + " рублей ");
        }
    }
}
