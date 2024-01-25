package task1;

import java.util.Scanner;

public class NumberFormat {

    public static void main(String[] args) {
        getOutput(getData());

    }
    public static String getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input some number: ");
        String customNumber = scanner.nextLine();
        scanner.close();
        return customNumber;
    }

    public static void getOutput(String output) {
        try {
            int pars = Integer.parseInt(output);
            System.out.println(pars + " it is Number");
        } catch (NumberFormatException e) {
            System.out.println("it is not number " + e);
            throw e;
        }
    }
}





