package bmicalculator.utils;

public class PrinterHelper {

    public static void showMainMenu() {
        System.out.println("*--- ::     Calculate your BMI      :: ---*");
        System.out.println("*--- ::      Select an option       :: ---*");
        System.out.println("*--- ::a. Enter your Height & Weight:: ---*");
        System.out.println("*--- ::      b. Exit Program        :: ---*");
        System.out.println("*******************************************");
    }

    public static void showHeightMenu() {
        System.out.println("*--- :: Enter your Height in m:: ---*");
        System.out.println("*************************************");
    }

    public static void showWeightMenu() {
        System.out.println("*--- ::Enter your Weight in kg:: ---*");
        System.out.println("*************************************");
    }

    public static void showFeedback(String feedback) {
        System.out.println("*--- ::    BMI result   :: ---*");
        System.out.println(feedback);
    }

    public static void showWrongInput() {
        System.out.println("*--- ::    Invalid input    :: ---*");
        System.out.println("*--- ::Enter 'a' or 'b':: ---*");
        System.out.println("***********************************");
    }
}
