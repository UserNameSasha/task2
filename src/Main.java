public class Main {
    public static void main(String args[]) {

        int clientBalans = 286;
        int addend = 750;
        int bonus = 0;

        if (addend > 1000) {
            bonus = addend / 100;
        } else {
            System.out.println("Итоговый счет: " + (clientBalans + addend));
            System.out.println("Бонус:" + bonus);
        }


    }
}