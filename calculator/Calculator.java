package bmicalculator.calculator;

public class Calculator {

    double height;
    double weight;

    public Calculator() {
        this.height = 0;
        this.weight = 0;
    }

    public Calculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public String showBMI() {
        double bmi = (double) Math.round((weight / Math.pow(height, 2)) * 100) / 100;         // calculate bmi and round to 2 decimal places
        String msg = "Your BMI is: ";
        String msg2 = "You are ";
        String result;

        if(bmi >=0 && bmi < 18.5)
            result = "underweight.";
        else if(bmi >= 18.5 && bmi < 23)
            result = "normal.";
        else if (bmi >= 23 && bmi < 30)
            result = "overweight.";
        else if (bmi >= 30)
            result = "obese.";
        else
            result = "Invalid BMI.";

        return (msg + bmi +"\n") + (msg2 + result);
    }
}