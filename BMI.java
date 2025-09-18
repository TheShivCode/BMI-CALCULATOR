package BasicsofJava;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("what is your name: ");
        String username = scanner.nextLine();
        System.out.print("Enter your age,"+ username+ ": ");
        int age = scanner.nextInt();
        System.out.print(username+ ", please enter your weight(in KG): ");
        double weight = scanner.nextDouble();
        System.out.print(username + ", please enter your height: ");
        double height = scanner.nextDouble();

        double heightInM = height * 0.3048;
        System.out.println(username + ", your height in metre is: "+heightInM);
        double CalculatedBMI = weight/(heightInM*heightInM);
        System.out.println(username+ ", your current BMI is: "+ CalculatedBMI);
        String condition;
        if(CalculatedBMI < 18.5) {
            condition = "Underweight";
        } else if (CalculatedBMI <25 ) {
            condition = "normal";

        } else if (CalculatedBMI < 30) {
            condition = "overweight";

        }
        else {
            condition = "obesity";
            }
        System.out.println(username+ " your body condition is " +condition);
        scanner.close();
    }
}


