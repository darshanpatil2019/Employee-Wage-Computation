import java.util.Random;

public class CalculateDailyWage {
    public static void main(String[] args) {
        int is_Present = 1;
        int wagePerHour = 20;
        int empHours;

        Random random = new Random();
        int empCheck = random.nextInt(2);

        if (empCheck == is_Present) {
            System.out.println("Employee is Present");
            empHours = 8;
        } else {
            System.out.println("Employee is Absent");
            empHours = 0;
        }

        int empWage;

        empWage = wagePerHour * empHours;
        System.out.println("Daily Emp Wage is : " + empWage);
    }
}
