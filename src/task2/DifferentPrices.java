package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DifferentPrices {
    public static int[] priceWithinFiveDays = {2, 10, 15, 5, 10};
    public static int customNumberAfterParse = -1;

    public static void main(String[] args) {
        getData();
        checkDate(customNumberAfterParse, priceWithinFiveDays);
    }

    public static int getData() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите номер дня от 1 до 5 для получения цены или введите 0 для завершения:");
                customNumberAfterParse = scanner.nextInt();

                if (customNumberAfterParse < 1 || customNumberAfterParse > 5) {
                    System.out.println("Нет такого дня");
                    continue;
                } else if (customNumberAfterParse == 0)
                    break;
                else {
                    return customNumberAfterParse;
                }
            } catch (InputMismatchException e) {
                System.out.println(e);
                throw new InputMismatchException("Вы ввели невалидное число");
            }
        }
        return customNumberAfterParse;
    }


    public static void checkDate(int customNumberAfterParse, int[] priceWithinFiveDays) {
        for (int i = 0; i < priceWithinFiveDays.length; i++) {
            if(customNumberAfterParse == i) {
                System.out.println("День " + i + " имел цену " + (priceWithinFiveDays[i - 1]));
            }
        }
    }
}
