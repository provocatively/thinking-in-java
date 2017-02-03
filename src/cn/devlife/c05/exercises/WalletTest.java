package cn.devlife.c05.exercises;

/**
 * Exercise 22, page 207
 *
 * @author kevin
 */
public class WalletTest {
    Bills b;

    public static void main(String[] args) {
        for (Bills b : Bills.values()) {
            System.out.print("Worth: ");
            switch (b) {
                case ONE:
                    System.out.println("$1");
                    break;
                case FIVE:
                    System.out.println("$5");
                    break;
                case TEN:
                    System.out.println("$10");
                    break;
                case TWENTY:
                    System.out.println("$20");
                    break;
                case FIFTY:
                    System.out.println("$50");
                    break;
                case HUNDRED:
                    System.out.println("$100");
                    break;
                default:
                    break;
            }
        }
    }
}

enum Bills {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}
