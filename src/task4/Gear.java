package task4;

import java.util.Scanner;

public class Gear {
    public static int customNumberOfTemp;

    public static void main(String[] args) {
        try {
            getData();
            System.out.println(customNumberOfTemp + " Установлена температура");
        } catch (CustomExeption e) {
            System.out.println("Вы ввели невалидную температуру \n" + e.getMessage());
        }

    }

    public static int getData() throws CustomExeption {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру воздуха от -10 до +35:");
        customNumberOfTemp = scanner.nextInt();
        if (customNumberOfTemp < -10 || customNumberOfTemp > 35) {
            throw new CustomExeption("Невозможно установить такую температуру");
        }
        else return customNumberOfTemp;

    }
}




