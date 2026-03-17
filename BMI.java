package BasicsofJava;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String username = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Weight input
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();
        System.out.print("Is this in (1) KG or (2) LBS? Enter 1 or 2: ");
        int weightUnit = scanner.nextInt();
        if (weightUnit == 2) {
            weight = weight * 0.453592; // lbs to kg
        }

        // Height input
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.print("Is this in (1) CM or (2) FEET? Enter 1 or 2: ");
        int heightUnit = scanner.nextInt();

        double heightInM;
        if (heightUnit == 2) {
            heightInM = height * 0.3048; // feet to meter
        } else {
            heightInM = height / 100; // cm to meter
        }

        // BMI calculation
        double bmi = weight / (heightInM * heightInM);

        // Condition
        String condition;
        if (bmi < 18.5) {
            condition = "Underweight";
        } else if (bmi < 25) {
            condition = "Normal";
        } else if (bmi < 30) {
            condition = "Overweight";
        } else {
            condition = "Obese";
        }

        // Ideal weight range
        double minWeight = 18.5 * heightInM * heightInM;
        double maxWeight = 24.9 * heightInM * heightInM;

        // BMR (Mifflin-St Jeor, assuming male)
        double bmr = (10 * weight) + (6.25 * (heightInM * 100)) - (5 * age) + 5;

        // Goal
        System.out.print("Select your goal (1: Gain, 2: Lose, 3: Maintain): ");
        int goal = scanner.nextInt();

        String advice;
        if (goal == 1) {
            advice = "Calorie surplus + Strength training";
        } else if (goal == 2) {
            advice = "Calorie deficit + Cardio";
        } else {
            advice = "Maintain + Balanced diet";
        }

        // Output Dashboard
        System.out.println("\n----- HEALTH REPORT -----");
        System.out.println("Name: " + username);
        System.out.println("Age: " + age);
        System.out.printf("BMI: %.2f (%s)\n", bmi, condition);
        System.out.printf("Ideal Weight Range: %.2f kg - %.2f kg\n", minWeight, maxWeight);
        System.out.printf("Daily Calories Needed (BMR): %.2f kcal\n", bmr);
        System.out.println("Advice: " + advice);
        System.out.println("--------------------------");

        scanner.close();
    }
}
