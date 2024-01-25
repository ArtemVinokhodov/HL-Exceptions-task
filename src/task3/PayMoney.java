package task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PayMoney {
    public static int priceProduct = 10;
    public static int moneyInWallet = 100;
    public static int totalPrice;

    public static void main(String[] args) {
        System.out.println(getData());
    }

    public static int getData() {
        Scanner scanner = new Scanner(System.in);
        //try {
            System.out.print("Товар стоит 10 денег. Введите количество нужного товара:");
            int customNumber = scanner.nextInt();
            return totalPrice = checkDate(customNumber, moneyInWallet);
        }

    public static int checkDate(int customNumber, int moneyInWallet) {
        int sum = customNumber * priceProduct;
         if (sum > moneyInWallet) {
                throw new IllegalArgumentException ("Недостаточно денег 1");
         } else {
             return sum;
        }
    }
}
