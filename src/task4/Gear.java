package task4;

import java.util.Scanner;

public class Gear {
    public static int customNumberOfTemp;

    public static void main(String[] args) {
        try {
            customNumberOfTemp = getData();
            System.out.println(customNumberOfTemp + " Установлена температура");
        } catch (TemperaturesOutsidePermissiblelimitsExeption e) {
            System.out.println("Вы ввели невалидную температуру \n" + e.getMessage());
        }

    }

    public static int getData() throws TemperaturesOutsidePermissiblelimitsExeption {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру воздуха от -10 до +35:");
        customNumberOfTemp = scanner.nextInt();
        if (customNumberOfTemp < -10 || customNumberOfTemp > 35) {
            throw new TemperaturesOutsidePermissiblelimitsExeption("Невозможно установить такую температуру");
        }
        else return customNumberOfTemp;

    }
}




