package bmicalculator;

import bmicalculator.calculator.Calculator;
import bmicalculator.utils.PrinterHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char option;
        double weight;
        double height;

        Scanner scanner = new Scanner(System.in);

        do {
            PrinterHelper.showMainMenu();
            option = scanner.next().charAt(0);

            if (option != 'a' && option != 'b') {
                PrinterHelper.showWrongInput();
                continue;
            }

            if (option == 'b')
                break;

            PrinterHelper.showHeightMenu();
            height = scanner.nextDouble();

            PrinterHelper.showWeightMenu();
            weight = scanner.nextDouble();

            Calculator calculator = new Calculator(height, weight);
            PrinterHelper.showFeedback(calculator.showBMI());

        } while (option != 'b');
    }
}
